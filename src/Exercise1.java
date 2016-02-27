
public class Exercise1 {
	public static void main(String[] args) throws InterruptedException {
		Thread[] threads_list = new Thread[5];
		final int N = 5;
		
		for (int i = 0; i < N; i++) {
			// Creamos N threads y los mandamos a ejecutar
			threads_list[i] = new Thread(new ThreadExercise1(500));
			threads_list[i].start();
		}
		
		for (Thread t : threads_list) {
			// Ahora esperamos a cada thread creado.
			// Es decir, hasta que no hayan terminado todos, no continúamos el código.
			t.join();
		}
		
		System.out.println("Todos estan terminados!!!");
		
	}
}
