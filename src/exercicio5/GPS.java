package exercicio5;

public class GPS {
	private String idioma;
	private String rota;

	GPS(){}

	public String getIdioma() {
		return this.idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	public String getRota() {
		return this.rota;
	}

	public void setRota(String rota) {
		this.rota = rota;
	}
	
	public void exibeAtributos() {
		System.out.println("\nIdioma: "+this.getIdioma()+"\nRota: "+this.getRota());
	}
	
}
