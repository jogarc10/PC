

public class ThreadExercise1_decrement implements Runnable {
	int m;
	
	public ThreadExercise1_decrement(int M) {
		this.m = M;
	}

	public void run() {
		for(int i = 0; i < m ; i++){
			Main.decr = true;
			Main.last = 2;
			System.out.println("Decremenet " + Main.shared_variable);
			while(Main.incr && Main.last == 2);
			Main.shared_variable--;
			Main.decr = false;
		}
	}
}

