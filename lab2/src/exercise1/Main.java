package exercise1;

public class Main {
	static int N = 500; // number of sums/decerements each process
	static volatile int shared_variable = 0;
	static boolean incr = false; // true = increment process is executing
	static boolean decr = false; // true = decrement process is executing
	static int last = 0; // Indicates the last process that entered on critical section
	
	public static void main(String[] args) throws InterruptedException {
		Thread thread1 = new Thread(new ThreadExercise1_increment(N));
		Thread thread2 = new Thread(new ThreadExercise1_decrement(N));
		
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();
		
		System.out.println("HOOOOOOOLA");
		System.out.println("Ultimooooo " + shared_variable);
	}

}
