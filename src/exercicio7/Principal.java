package exercicio7;

import java.util.Scanner;

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
		controle.setTelevisao(televisao);
		Scanner entrada = new Scanner(System.in);
		int opcao = 0;
		
		//Menu de controle: mudar de canal, alterar volume e mudar para canal selecionado		
		
		while(opcao != 7) {	
			System.out.println("Digite a opção desejada para operação do controle: ");
			System.out.println("\t1 - Aumentar Número do Canal"
							+ "\n\t2 - Diminuir Número do Canal"
							+ "\n\t3 - Selecionar um Canal específico"
							+ "\n\t4 - Aumentar o Volume do Som"
							+ "\n\t5 - Diminuir o Volume do Som"
							+ "\n\t6 - Exibir volume e canal atuais"
							+ "\n\t7 - Desligar controle");
			opcao = entrada.nextInt();
			switch (opcao) {
			
				//Aumentar Número do Canal
				case 1: 
					controle.aumentaCanal();
					System.out.println("O canal atual é o de no: "+televisao.getCanal());
				break;
				
				//Diminuir Número do Canal
				case 2:
					if(televisao.getCanal() != 0)
						controle.diminuiCanal();
					System.out.println("O canal atual é o de no: "+televisao.getCanal());
				break;
				
				//Selecionar um Canal Específico
				case 3:
					System.out.println("Digite o canal desejado: ");
					controle.mudaCanal(entrada.nextInt());
				break;
				
				//Aumentar o Volume do Som
				case 4:
					controle.aumentaVolume();
					System.out.println("O volume atual é de: "+televisao.getVolume()+" unidades.");
				break;
				
				//Diminuir o Volume do Som
				case 5:
					if(televisao.getVolume() != 0)
						controle.diminuiVolume();
					System.out.println("O volume atual é de: "+televisao.getVolume()+" unidades.");					
				break;
				
				case 6:
					controle.consultaCanaleVolume();
					break;
				
				case 7:
					System.out.println("Televisão desligada.");
					break;	
					
				default: 
					System.out.println("Opção inválida. Por favor, tente novamente.");
			}
		} 
		entrada.close();
	}
}
