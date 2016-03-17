package exercise2;

public class ThreadExercise2_decrement implements Runnable {

	int i; // process_index
	//int m;
	
	public ThreadExercise2_decrement(int process_index) { //int n_loops) {
		this.i = process_index;
		//this.m = n_loops;
	}

	public void run() {
		for(int iter = 0; iter < Main.TOTAL_STEPS ; iter++){
			for(int j = 1; j <= Main.n; j++){
				Main.in[i] = j;
				Main.last[j] = i;
				for(int k = 1; k <= Main.n; k++){
					while(Main.last[j]== 1 && Main.in[k]>=Main.in[i]);
				}
				
			}
			Main.shared_variable--;
			System.out.println("Decrement: " + Main.shared_variable);
			Main.in[i] = 0;
		}
	}

}
