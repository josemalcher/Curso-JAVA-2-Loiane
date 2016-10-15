package aula69VariasThreads;

public class Teste3 {
	public static void main(String[] args) {
		MinhaThreadsRunnable thread1 = new MinhaThreadsRunnable("#1 ", 500);
		MinhaThreadsRunnable thread2 = new MinhaThreadsRunnable("#2 ", 500);
		MinhaThreadsRunnable thread3 = new MinhaThreadsRunnable("#3 ", 500);

		Thread t1 = new Thread(thread1);
		Thread t2 = new Thread(thread2);
		Thread t3 = new Thread(thread3);

		t1.start();
		/*
		 * try { t1.join(200); } catch (InterruptedException e) {
		 * e.printStackTrace(); }
		 */
		t2.start();
		/*
		 * try { t2.join();
		 */
		t3.start();

		// for (int i = 0; i < 7; i++) {
		/*
		 * while (t1.isAlive() || t2.isAlive() || t3.isAlive()) { try {
		 * Thread.sleep(200); } catch (InterruptedException e) {
		 * e.printStackTrace(); } }
		 */
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Programa FINALIZADO");
	}
}
