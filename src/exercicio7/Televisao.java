package exercicio7;

public class Televisao {
	private int volume = 0;
	private int canal = 0;
	
	public int getVolume() {
		return this.volume;
	}

	public int getCanal() {
		return this.canal;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}
	
	Televisao(int volume, int canal, ControleRemoto controleRemoto){
		this.volume = volume;
		this.canal = canal;
	}
	
	Televisao(){}
	

}
