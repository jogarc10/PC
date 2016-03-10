package exercise2;

public class ThreadExercise2_decrement implements Runnable {

	int m;
	int i; // process_index
	
	public ThreadExercise2_decrement(int n_loops, int process_index) {
		this.i = process_index;
		this.m = n_loops;
	}

	public void run() {
		for(int i = 0; i < m ; i++){
			
		}
	}

}
