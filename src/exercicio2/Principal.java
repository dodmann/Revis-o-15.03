package exercicio2;

public class Principal {
	/* Elaborar um programa que, a partir de uma classe chamada Pessoa, com os campos
	públicos Nome, Idade e Sexo, estabeleça um objeto X para dez ele- mentos. O programa
	deve, por meio de um menu, dar a possibilidade de entrar todos os elementos, de
	apresentar todos os elementos e de sair do programa.
	*/
	public static void main(String[] args) {
		Pessoa pessoinha = new Pessoa();
		pessoinha.setNome("James");
		pessoinha.setIdade(2332);
		pessoinha.setSexo("M");
		
		System.out.println(pessoinha.getNome()+" "+pessoinha.getIdade()+" "+pessoinha.getSexo());		
	}

}
