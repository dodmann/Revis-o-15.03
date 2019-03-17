package exercicio5;

import java.util.Scanner;

public class Principal {
	/* Crie uma classe chamada GPS contendo os seguintes atributos do tipo String: idioma
	e rota. Defina dois metodos construtores: o default e outro para ligar o GPS com o
	idioma portugues e uma rota qualquer. Elabore metodos para realizar as seguintes
	funcoes:
		a. Definir idioma
		b. Definir rota
		c. Um metodo chamado mostrar para apresentar todos os valores atuais dos
		atributos do GPS.
	Elabore tambem uma outra classe (UsaGPS) para testar essas funcionalidade */
	public static void main(String[] args) {		
		GPS gps = new GPS();
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite o idioma: ");
		gps.setIdioma(entrada.nextLine());
		System.out.println("Digite a rota: ");
		gps.setRota(entrada.nextLine());
		gps.exibeAtributos();
		entrada.close();
	}
	
	
}
