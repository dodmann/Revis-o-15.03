package exercicio4;

import java.util.Scanner;

public class Principal {
	/* Faca uma classe que simule o funcionamento de uma bomba d'agua. A bomba possui
	um atributo booleano chamado status e os metodos ligar e desligar (ambos sem
	retorno). O metodo ligar coloca true em status e o metodo desligar coloca false
	em status. A bomba deve ficar ligada durante um certo intervalo de tempo (em
	segundos). O tempo em segundos deve ser recebido pelo metodo ligar. A cada segundo,
	apresente em tela quantos segundos faltam para a bomba ser desligada. Decorrido o
	tempo, o metodo desligar e acionado e a bomba e desligada  */
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		BombaDagua bomba = new BombaDagua();
		
		System.out.println("Digite a quantidade de segundos em que a bomba será ligada: ");
		bomba.ligar(entrada.nextInt());
		entrada.close();
	}
}
