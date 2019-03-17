package exercicio3;

import java.util.Scanner;

public class Principal {
	/* Elaborar um programa que tenha uma classe chamada ContaCorrente com os campos
	Numero e Saldo e com os metodos Depositar e Sacar. O trecho de codigo do programa
	deve comecar com o Saldo com valor zero e apresentar um menu com as opcoes
	depositar, sacar e finalizar, alem de apresentar o valor do Saldo atual da conta. 
	a medida que forem selecionadas as opcoes de acao do programa em depositar e sacar, 
	o saldo deve ser apresentado sempre de forma atualizada. */
	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		int opcao = 0;
		Scanner entrada = new Scanner(System.in);
		
		//Digitar o numero da conta
		System.out.println("Digite o numero da conta: ");
		conta.setNumero(entrada.nextLine());
		
		//Depositar, sacar ou finalizar
		
		
		while(opcao != 3) {	
			System.out.println("\nDigite a opcao desejada para as operacoes com a conta: ");
			System.out.println("\t1 - Depositar\n\t2 - Sacar\n\t3 - Finalizar sessao");
			opcao = entrada.nextInt();
			switch (opcao) {
				case 1: 
					System.out.println("Conta "+conta.getNumero());
					System.out.println("O saldo da conta e: R$ "+conta.getSaldo());
					System.out.println("Digite o valor a ser depositado:");				
					conta.depositar(entrada.nextDouble());
					System.out.println("O saldo da conta e: R$ "+conta.getSaldo());
				break;
				
				//Sacar
				case 2:
					System.out.println("Conta "+conta.getNumero());
					System.out.println("O saldo da conta e: R$ "+conta.getSaldo());
					System.out.println("Digite o valor a ser sacado:");				
					conta.sacar(entrada.nextDouble());
					System.out.println("O saldo da conta e: R$ "+conta.getSaldo());
				break;
				
				//Finalizar
				case 3:
					System.out.println("Sessao finalizada.");
				break;
				
				default: 
					System.out.println("Opcao invalida.");
			}
		} 
		entrada.close();
	}
}
