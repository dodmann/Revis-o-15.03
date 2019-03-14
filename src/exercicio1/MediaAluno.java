package exercicio1;

public class MediaAluno {
	public String nome;
	private String sala;
	public int nota1;
	public int nota2;
	public int nota3;
	public int nota4;
	public int media;
	
	MediaAluno(){}
	
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSala() {
		return this.sala;
	}

	public void setSala(String sala) {
		this.sala = sala;
	}

	public int getNota1() {
		return this.nota1;
	}

	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}

	public int getNota2() {
		return this.nota2;
	}

	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}

	public int getNota3() {
		return this.nota3;
	}

	public void setNota3(int nota3) {
		this.nota3 = nota3;
	}

	public int getNota4() {
		return this.nota4;
	}

	public void setNota4(int nota4) {
		this.nota4 = nota4;
	}

	public int calculaMedia(int nota1, int nota2, int nota3, int nota4) {
		return this.media = (nota1 + nota2 + nota3 + nota4)/4;
	}
	
	public int getMedia() {
		return this.media;
	}

}
