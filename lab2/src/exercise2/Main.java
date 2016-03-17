package exercise2;

public class Main {
	static int n = 5; // number of processes
	static int m = n; // number of etapas
	static int TOTAL_THREADS = 2*n;
	static int TOTAL_STEPS = 2*m+1;
	static int in[] = new int[TOTAL_STEPS]; // steps. in: array of processes
	static int last[] = new int[TOTAL_THREADS]; // last process executed on "etapa" i (where i is the index of the array)
	static Thread[] threads_list = new Thread[TOTAL_THREADS];
	static volatile int shared_variable = 0;
	//static int inner_loops = 10; // vueltas del loop interno. Cuantas veces queremos hacerlo.
	
	public static void main(String[] args) throws InterruptedException {
		System.out.println("First output: " + shared_variable);
		
		for(int i = 1; i <= TOTAL_THREADS; i++){
			if(i % 2 == 0)
				threads_list[i-1] = new Thread(new ThreadExercise2_increment(i)); //inner_loops, i));
			else
				threads_list[i-1] = new Thread(new ThreadExercise2_decrement(i)); //inner_loops, i));
			threads_list[i].start();
		}
		
		for(int i = 0; i <= TOTAL_THREADS; i++){
			threads_list[i-1].join();
		}
		
		System.out.println("Last output: " + shared_variable);
	}

}
