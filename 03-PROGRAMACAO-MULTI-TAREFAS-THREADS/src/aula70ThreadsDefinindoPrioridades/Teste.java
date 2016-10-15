package aula70ThreadsDefinindoPrioridades;

public class Teste {

	public static void main(String[] args) {
		//

		MinhaThreadsRunnable thred1 = new MinhaThreadsRunnable("#1", 500);
		MinhaThreadsRunnable thred2 = new MinhaThreadsRunnable("#2", 500);
		MinhaThreadsRunnable thred3 = new MinhaThreadsRunnable("#3", 500);

		Thread t1 = new Thread(thred1);
		Thread t2 = new Thread(thred2);
		Thread t3 = new Thread(thred3);

		t1.setPriority(5);
		t2.setPriority(3);
		t3.setPriority(1);

		// t1.setPriority(Thread.NORM_PRIORITY);

		t1.start();
		t2.start();
		t3.start();

	}

}
