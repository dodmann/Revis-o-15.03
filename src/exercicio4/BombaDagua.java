package exercicio4;

public class BombaDagua {
	private boolean status;
	
	BombaDagua(){}
	
	public boolean getStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	public void ligar(int tempo){
		this.setStatus(true);
		System.out.println("A bomba será desligada em "+ tempo + " segundos.");
		while(tempo != 0) {
			try {
				Thread.sleep(1000);
				tempo = tempo - 1;
				if (tempo != 0) {
					System.out.println("A bomba será desligada em "+ tempo + " segundos.");
				}
				else {
					System.out.println("A bomba será desligada.");
					this.desligar();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		
	}
	
	public void desligar() {
		this.setStatus(false);
	}
}
