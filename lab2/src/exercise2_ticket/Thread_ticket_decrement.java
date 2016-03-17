package exercise2_ticket;

public class Thread_ticket_decrement {
	int m;
	int i; // process_index
	
	public Thread_ticket_decrement(int n_loops, int process_index) {
		this.i = process_index;
		this.m = n_loops;
	}

	public void run() {
		for(int i = 0; i < m ; i++){
			
		}
	}
}
