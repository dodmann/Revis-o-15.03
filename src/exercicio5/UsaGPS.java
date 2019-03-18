package exercicio5;

import java.util.Scanner;

public class UsaGPS {
	
	public static void main(String[] args) {
		System.out.println("Valores atuais do GPS: ");
		GPS gps = new GPS("Portugues","2039309 2093039");
		Scanner entrada = new Scanner(System.in);
		gps.exibeAtributos();
		System.out.println("Digite o idioma: ");
		gps.setIdioma(entrada.nextLine());
		System.out.println("Digite a rota: ");
		gps.setRota(entrada.nextLine());
		gps.exibeAtributos();
		entrada.close();
	}

}
