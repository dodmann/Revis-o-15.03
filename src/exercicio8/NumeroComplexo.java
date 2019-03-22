package exercicio8;

public class NumeroComplexo {
	private double real;	
	private double imaginaria;
	
	NumeroComplexo(double real, double imaginaria){
		this.real = real;
		this.imaginaria = imaginaria;
	}
	
	NumeroComplexo(){}
	
	public double getReal() {
		return this.real;
	}

	public void setReal(double real) {
		this.real = real;
	}

	public double getImaginaria() {
		return this.imaginaria;
	}

	public void setImaginaria(double imaginaria) {
		this.imaginaria = imaginaria;
	}
	
	public void inicializaNumero(double real, double imaginaria) {
		this.real = real;
		this.imaginaria = imaginaria;
	}
	
	public void imprimeNumero() {
		System.out.printf("Numero: %.1f + %.1fi" ,this.getReal(), this.getImaginaria());
	}
	
	public boolean eIgual(NumeroComplexo numero) {
		if (numero.getReal() == this.getReal() && numero.getImaginaria() == this.getImaginaria()) {
			return true;
		}
		return false;
	}
	
	public NumeroComplexo soma(NumeroComplexo numero) {
		return new NumeroComplexo(this.getReal()+numero.getReal(), this.getImaginaria()+numero.getImaginaria());
	}
	
	public NumeroComplexo subtrai(NumeroComplexo numero) {
		return new NumeroComplexo(this.getReal()-numero.getReal(), this.getImaginaria()-numero.getImaginaria());
	}
	
	public NumeroComplexo multiplica(NumeroComplexo numero) {
		return new NumeroComplexo((this.getReal()*numero.getReal()-this.getImaginaria()*numero.getImaginaria()),
								  (this.getReal()*numero.getImaginaria()+this.getImaginaria()*numero.getReal()));
	}
	
	public NumeroComplexo divide(NumeroComplexo numero) {
		double denominador = Math.pow(numero.modulo(), 2);
		return new NumeroComplexo((this.getReal()*numero.getReal()+this.getImaginaria()*numero.getImaginaria())/denominador,
								  (this.getImaginaria()*numero.getReal()-this.getReal()*numero.getImaginaria())/denominador);
	}

	private double modulo() {
		if (this.getReal()!=0 || this.getImaginaria()!=0) {
            return Math.sqrt(this.getReal()*this.getReal()+this.getImaginaria()*this.getImaginaria());
        } else {
            return 0d;
        }
	}
}
