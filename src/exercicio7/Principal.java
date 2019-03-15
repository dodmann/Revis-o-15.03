package exercicio7;

public class Principal {
	/* Crie uma classe Televisao e uma classe ControleRemoto que pode controlar o volume e
	trocar os canais da televisão. O controle de volume permite:
		a. aumentar ou diminuir a potência do volume de som em uma unidade de cada
		vez;
		b. aumentar e diminuir o número do canal em uma unidade
		c. trocar para um canal indicado;
		d. consultar o valor do volume de som e o canal selecionado. */
	public static void main(String[] args) {
		Televisao televisao = new Televisao();
		ControleRemoto controle = new ControleRemoto();
		System.out.println("Aumentar volume, 1: ");
		controle.setTelevisao(televisao);
		controle.aumentaVolume();
	}
}
