
public class ThreadExercise1 implements Runnable {
	int T = 0;
	
	public ThreadExercise1(int T) {
		this.T = T;
	}
	
	public void run() {
		long threadID = Thread.currentThread().getId();
		System.out.println("Thread ID: " + threadID);
		
		try {
			Thread.sleep(T);
		}
		catch (InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
		
		System.out.println("Thread ID: " + threadID);
	}
}
