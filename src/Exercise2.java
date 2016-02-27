
public class Exercise2 {
	static final int M = 600; // Number of Threads
	static final int N = 50;
	static int shared_variable = 0;
	static Thread[] threads_list = new Thread[2*M];
	
	public static void main(String args[]) throws InterruptedException {
		
		// Start ejecuta de forma asincrona, crea hebras y ejecuta concurrentemente
		// Run no ejecuta concurrentement
		
		for (int i = 0; i < 2*M; i += 2) {
			threads_list[i] = new Thread(new ThreadExercise2_Increment(N));
			threads_list[i].start();
			
			threads_list[i+1] = new Thread(new ThreadExercise2_decrement(N));			
			threads_list[i+1].start();
		}
		
		for (int i = 0; i < 2*M; i++) {
			threads_list[i].join();
		}
		
		System.out.println("Finished!");
		System.out.println("Shared_variable:  " + shared_variable);
		
		/*
		 * Solución: Haciendolo con Thread Save
		for (int i = 0; i < M; i++) {
			threads_list[i] = new Thread(new ThreadExercise2_decrement(N));
			threads_list[i].run();
		}
		
		for (int i = M; i < 2*M; i++) {
			threads_list[i] = new Thread(new ThreadExercise2_Increment(N));
			threads_list[i].run();
		}
		
		for (int i = 0; i < 2*M; i++) {
			threads_list[i].join();
		}
		
		System.out.println("Finished!");
		System.out.println("Shared_variable:  " + shared_variable);
		*/
	}
}
