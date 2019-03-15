package exercicio7;

public class ControleRemoto {
	private Televisao televisao;
	/* a. aumentar ou diminuir a potência do volume de som em uma unidade de cada
	vez;
	b. aumentar e diminuir o número do canal em uma unidade
	c. trocar para um canal indicado;
	d. consultar o valor do volume de som e o canal selecionado. */
	
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
	
	public void diminuirVolume() {
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
	
	public void consultaCanaleVolume(int canal) {
		System.out.println("O canal atual é: " + this.televisao.getCanal() + " e o volume é: " + this.televisao.getVolume());
	}

	
	
}
