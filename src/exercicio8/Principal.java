package exercicio8;

import java.util.Scanner;

public class Principal {
	/* Escreva em Java a classe NumeroComplexo que represente um numero complexo. A
	classe devera ter os seguintes metodos:
	-inicializaNumero, que recebe dois valores como argumentos para inicializar os
	campos da classe (parte real e imaginaria);
	-imprimeNumero, que deve imprimir o numero complexo encapsulado usando a
	notacao a + bi onde a = a parte real e b = imaginaria;
	-eIgual, que recebe outra instancia da classe NumeroComplexo e retorna true se
	os valores dos campos encapsulados forem iguais aos da instancia passada como
	argumento;
	-soma, que recebe outra instancia da classe NumeroComplexo e soma este
	numero complexo com o encapsulado usando a formula
	(a + bi) + (c + di) = (a + c) + (b+ d)i
	-subtrai, que recebe outra instancia da classe NumeroComplexo e subtrai o
	argumento do numero complexo encapsulado usando a formula
	(a + bi) - (c + di) = (a - c) + (b - d)i;
	-multiplica, que recebe outra instancia da classe NumeroComplexo e multiplica
	este numero complexo com o encapsulado usando a formula
	(a + bi) * (c + di) = (ac - bd) + (ad + bc)i;
	-divide, que recebe outra instancia da classe NumeroComplexo divide o numero
	encapsulado pelo passado como argumento usando a formula:
	(a + bi)/(c + di) = (ac + bd / c2 + d2) + (bc - ad / c2 + d2)i
	 */
	public static void main(String[] args) {
		NumeroComplexo numero = new NumeroComplexo();
		int opcao = 0;
		Scanner entrada = new Scanner(System.in);
		double real = 0;
		double imaginaria = 0;
		
		//Digitar o numero complexo, parte real e imaginaria
		System.out.println("Digite os numeros complexos para iniciar a classe: ");
		System.out.println("Parte real: ");
		real = entrada.nextDouble();
		System.out.println("Parte imaginaria ");
		imaginaria = entrada.nextDouble();
		numero.inicializaNumero(real, imaginaria);
		numero.imprimeNumero();
		
		//Operações com numeros complexos: adicao, subtracao, multiplicacao e divisao
		
		while(opcao != 6) {	
			System.out.println("\nDigite a opcao desejada para as operacoes com os numeros: ");
			System.out.println("\t1 - Soma\n\t2 - Subtracao\n\t3 - Multiplicacao\n\t4 - Divisao"
					+ "\n\t5 - Alterar os numeros complexos da classe: \n\t6 - Encerrar programa");
			opcao = entrada.nextInt();
			switch (opcao) {
				//Soma
				case 1: 
					System.out.println("Digite a parte real do numero a ser somado:");
					real = entrada.nextDouble();
					System.out.println("Digite a parte imaginaria do numero a ser somado:");
					imaginaria = entrada.nextDouble();
					NumeroComplexo numeroASerSomado = new NumeroComplexo(real, imaginaria); 
					NumeroComplexo resultadoSoma = numero.soma(numeroASerSomado);
					resultadoSoma.imprimeNumero();
				break;
				
				//Subtrai
				case 2:
					System.out.println("Digite a parte real do numero a ser subtraído:");
					real = entrada.nextDouble();
					System.out.println("Digite a parte imaginaria do numero a ser subtraído:");
					imaginaria = entrada.nextDouble();
					NumeroComplexo numeroASerSubtraido = new NumeroComplexo(real, imaginaria); 
					NumeroComplexo resultadoSubtracao = numero.subtrai(numeroASerSubtraido);
					resultadoSubtracao.imprimeNumero();
				break;
				
				//Multiplica
				case 3:
					System.out.println("Digite a parte real do numero a ser multiplicado:");
					real = entrada.nextDouble();
					System.out.println("Digite a parte imaginaria do numero a ser multiplicado:");
					imaginaria = entrada.nextDouble();
					NumeroComplexo numeroASerMultiplicado = new NumeroComplexo(real, imaginaria); 
					NumeroComplexo resultadoMultiplicacao = numero.multiplica(numeroASerMultiplicado);
					resultadoMultiplicacao.imprimeNumero();
				break;
				
				//Divide
				case 4:
					System.out.println("Digite a parte real do numero a ser dividido:");
					real = entrada.nextDouble();
					System.out.println("Digite a parte imaginaria do numero a ser dividido:");
					imaginaria = entrada.nextDouble();
					NumeroComplexo numeroASerDivido = new NumeroComplexo(real, imaginaria); 
					NumeroComplexo resultadoDivisao = numero.divide(numeroASerDivido);
					resultadoDivisao.imprimeNumero();
				break;
				
				//Inicializa de novo
				case 5:
					System.out.println("Digite os numeros complexos para iniciar a classe: ");
					System.out.println("Parte real: ");
					real = entrada.nextDouble();
					System.out.println("Parte imaginaria ");
					imaginaria = entrada.nextDouble();
					numero.inicializaNumero(real, imaginaria);
					numero.imprimeNumero();
				break;
				
				//Finalizar
				case 6:
					System.out.println("Programa encerrado.");
				break;
				
				default: 
					System.out.println("Opcao invalida.");
			}
		} 
		entrada.close();
	}
}