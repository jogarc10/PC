
public class ThreadExercise1_increment implements Runnable {
	int m;
	
	public ThreadExercise1_increment(int M) {
		this.m = M;
	}

	public void run() {
		for(int i = 0; i < m ; i++){
			Main.incr = true;
			Main.last = 1;
			System.out.println("Increment " + Main.shared_variable);
			while(Main.decr && Main.last == 1);
			Main.shared_variable++;
			Main.incr = false;
		}
	}
}