package exercicio7;

public class ControleRemoto {
	private Televisao televisao;
	
	public Televisao getTelevisao() {
		return televisao;
	}

	public void setTelevisao(Televisao televisao) {
		this.televisao = televisao;
	}

	ControleRemoto(){}
	
	public void aumentaVolume() {
		this.televisao.setVolume(this.televisao.getVolume() + 1);
	}
	
	public void diminuiVolume() {
		this.televisao.setVolume(this.televisao.getVolume() - 1);
	}
	
	public void aumentaCanal() {
		this.televisao.setCanal(this.televisao.getCanal() + 1);
	}
	
	public void diminuiCanal() {
		this.televisao.setCanal(this.televisao.getCanal() - 1);
	}
	
	public void mudaCanal(int canal) {
		this.televisao.setCanal(canal);;
	}
	
	public void consultaCanaleVolume() {
		System.out.println("O canal atual é: " + this.televisao.getCanal() + " e o volume é de: " + this.televisao.getVolume()+ " unidades");
	}

	
	
}
