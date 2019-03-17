package exercicio1;

import java.util.Scanner;

public class Principal {
	/* Elaborar um programa que entre nome, sala e quatro notas escolares de um aluno. O
		programa deve, ao final, apresentar o resultado da media do aluno. Para realizar essa
		tarefa, o programa deve usar uma classe que tenha nome, notas e mdia como campos
		publicos e sala como campo protegido, o qual necessitara de dois metodos de acesso,
		um para escrever no campo e outro para ler o campo. */
	public static void main(String[] args) {
		MediaAluno mediaAluno = new MediaAluno();
		
		//abertura do scanner
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o nome do aluno:");
		mediaAluno.setNome(entrada.nextLine());
		
		System.out.println("Digite a sala do aluno:");
		mediaAluno.setSala(entrada.nextLine());
		
		System.out.println("Digite a primeira nota do aluno:");
		mediaAluno.setNota1(entrada.nextInt());
		
		System.out.println("Digite a segunda nota do aluno:");
		mediaAluno.setNota2(entrada.nextInt());
		
		System.out.println("Digite a terceira nota do aluno:");
		mediaAluno.setNota3(entrada.nextInt());
		
		System.out.println("Digite a quarta nota do aluno:");
		mediaAluno.setNota4(entrada.nextInt());
		
		mediaAluno.calculaMedia(mediaAluno.getNota1(),mediaAluno.getNota2(),mediaAluno.getNota3(),mediaAluno.getNota4());
		
		System.out.println("\nNome: "+mediaAluno.getNome());
		System.out.println("Sala: "+mediaAluno.getSala());
		System.out.println("Media final: "+mediaAluno.getMedia());
		
		//fechamento do scanner
		entrada.close();
	}
}
