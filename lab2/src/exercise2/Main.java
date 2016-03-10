package exercise2;

public class Main {
	static int n = 4; // number of processes
	static int m = n; // number of etapas
	static int in[] = new int[2*m]; // steps. in: array of processes
	static int last[] = new int[2*n]; // last process executed on "etapa" i (where i is the index of the array)
	static Thread[] threads_list = new Thread[n];
	
	static int n_loops = 10; // vueltas del loop interno. Cuantas veces queremos hacerlo.
	
	public static void main(String[] args) {
		for(int i = 0; i < 2*n; i++){
			if(i % 2 == 0)
				threads_list[i] = new Thread(new ThreadExercise2_increment(n_loops, i));
			else
				threads_list[i] = new Thread(new ThreadExercise2_decrement(n_loops, i));
		}
		
	}

}
