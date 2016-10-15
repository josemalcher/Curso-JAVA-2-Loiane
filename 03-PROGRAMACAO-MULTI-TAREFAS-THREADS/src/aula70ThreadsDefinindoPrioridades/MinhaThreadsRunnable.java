package aula70ThreadsDefinindoPrioridades;

public class MinhaThreadsRunnable implements Runnable {
	private String nome;
	private int tempo;

	public MinhaThreadsRunnable(String nome, int tempo) {
		super();
		this.nome = nome;
		this.tempo = tempo;
		// antes
		// Thread t = new Thread(this);
		// t.start();
	}

	@Override
	public void run() {
		
		try {
			for (int i = 0; i < 6; i++) {
				System.out.println(nome + " contator "+ i);
				Thread.sleep(tempo);
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println(nome + " terminou a execução ***");

	}

}
