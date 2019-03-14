package exercicio3;

import java.util.Scanner;

public class Principal {
	/* Elaborar um programa que tenha uma classe chamada ContaCorrente com os campos
	Número e Saldo e com os métodos Depositar e Sacar. O trecho de código do programa
	deve começar com o Saldo com valor zero e apresentar um menu com as opções
	depositar, sacar e finalizar, além de apresentar o valor do Saldo atual da conta. 
	À medida que forem selecionadas as opções de ação do programa em depositar e sacar, 
	o saldo deve ser apresentado sempre de forma atualizada. */
	public static void main(String[] args) {
		ContaCorrente conta = new ContaCorrente();
		int opcao = 0;
		Scanner entrada = new Scanner(System.in);
		
		//Digitar o número da conta
		System.out.println("Digite o numero da conta: ");
		conta.setNumero(entrada.nextLine());
		
		//Depositar, sacar ou finalizar
		
		
		while(opcao != 3) {	
			System.out.println("\nDigite a opção desejada para as operações com a conta: ");
			System.out.println("\t1 - Depositar\n\t2 - Sacar\n\t3 - Finalizar sessão");
			opcao = entrada.nextInt();
			switch (opcao) {
				case 1: 
					System.out.println("Conta "+conta.getNumero());
					System.out.println("O saldo da conta é: R$ "+conta.getSaldo());
					System.out.println("Digite o valor a ser depositado:");				
					conta.depositar(entrada.nextDouble());
					System.out.println("O saldo da conta é: R$ "+conta.getSaldo());
				break;
				
				//Sacar
				case 2:
					System.out.println("Conta "+conta.getNumero());
					System.out.println("O saldo da conta é: R$ "+conta.getSaldo());
					System.out.println("Digite o valor a ser sacado:");				
					conta.sacar(entrada.nextDouble());
					System.out.println("O saldo da conta é: R$ "+conta.getSaldo());
				break;
				
				//Finalizar
				case 3:
					System.out.println("Sessão finalizada.");
				break;
				
				default: 
					System.out.println("Opção inválida.");
			}
		} 
		entrada.close();
	}
}
