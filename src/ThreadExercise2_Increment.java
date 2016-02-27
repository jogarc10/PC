
public class ThreadExercise2_Increment implements Runnable {
	int M = 0; // Total number of operations
	
	public ThreadExercise2_Increment(int M) {
		this.M = M;
	}

	public void run() {
		for (int i = 0; i < M; i++) {
			Exercise2.shared_variable++; // Increment
			System.out.println("Increment");
		}
	}
}
