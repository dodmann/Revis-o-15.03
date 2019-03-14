package exercicio3;

import java.util.Scanner;

public class Principal {
	/* Elaborar um programa que tenha uma classe chamada ContaCorrente com os campos
	N�mero e Saldo e com os m�todos Depositar e Sacar. O trecho de c�digo do programa
	deve come�ar com o Saldo com valor zero e apresentar um menu com as op��es
	depositar, sacar e finalizar, al�m de apresentar o valor do Saldo atual da conta. 
	� medida que forem selecionadas as op��es de a��o do programa em depositar e sacar, 
	o saldo deve ser apresentado sempre de forma atualizada. */
	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		int opcao;
		Scanner entrada = new Scanner(System.in);
		
		//Digitar o n�mero da conta
		System.out.println("Digite o numero da conta: ");
		conta.setNumero(entrada.nextLine());
		
		//Depositar, sacar ou finalizar
		System.out.println("Digite a op��o desejada para as opera��es com a conta: ");
		System.out.println("1 - Depositar\n2 - Sacar\n3 - Finalizar sess�o");
		opcao = entrada.nextInt();
		
		while(opcao != 3) {
			switch (opcao) {
				//Depositar
				case 1: 
					System.out.println("Conta "+conta.getNumero());
					System.out.println("O saldo da conta �: "+conta.getSaldo());
					System.out.println("Digite o valor a ser depositado:");				
					conta.depositar(entrada.nextDouble());
					System.out.println("O saldo da conta �: "+conta.getSaldo());
				break;
				
				//Sacar
				case 2:
					System.out.println("Conta "+conta.getNumero());
					System.out.println("O saldo da conta �: "+conta.getSaldo());
					System.out.println("Digite o valor a ser sacado:");				
					conta.sacar(entrada.nextDouble());
					System.out.println("O saldo da conta �: "+conta.getSaldo());
				break;
				
				//Finalizar
				case 3:
					System.out.println("Sess�o finalizada.");
				break;
			}
		} 
		entrada.close();
	}
}
