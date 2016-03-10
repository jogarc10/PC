package exercise2;

public class ThreadExercise2_increment implements Runnable {

	int m;
	int i; // process_index
	
	public ThreadExercise2_increment(int n_loops, int process_index) {
		this.i = process_index;
		this.m = n_loops;
	}

	public void run() {
		for(int i = 0; i < m ; i++){
			for(int j = 1; j <= Main.n; j++){
				Main.in[i] = j;
				Main.last[j] = i;
				//for(int k = 1; k <= Main.n; k++) 
				//TODO
			}
			
		}
	}

}
