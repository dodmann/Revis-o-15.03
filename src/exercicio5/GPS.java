package exercicio5;

public class GPS {
	private String idioma;
	private String rota;

	GPS(String idioma, String rota){
		this.idioma = idioma;
		this.rota = rota;
	}
	
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
		System.out.println("Idioma: "+this.getIdioma()+"\nRota: "+this.getRota()+"\n");
	}
	
}
