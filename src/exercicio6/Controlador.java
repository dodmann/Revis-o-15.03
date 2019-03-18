package exercicio6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controlador {
	private String codigoDeSegurança;	
//	private Campainha campainha;
//	private Sirene sirene;
	private Sensor sensor;
	List<Sensor> sensores;
			
	Controlador() {}
	
	public void ativarSensor(String sensor){
		this.sensor.setAtivo(true);
	}
	
	public void acionarSensor(String sensor) {
		this.sensor.setStatus("ativo");
	}
	
	public void definirCodigoDeSeguranca(String codigoDeSeguranca) {
		this.setCodigoDeSegurança(codigoDeSeguranca);
	}
	
	public void ligarSistema() {
		System.out.println("Digite o codigo de seguranca a ser criado:");
		Scanner entrada = new Scanner(System.in);		
		this.definirCodigoDeSeguranca(entrada.nextLine());
		System.out.println("Código de segurança: ");
		String result = entrada.nextLine();
		if (this.getCodigoDeSegurança().equals(result)) {
			//Criando lista de sensores
			sensores = new ArrayList<Sensor>();
			
			System.out.println("Login realizado com sucesso.");
			int opcao = 0;
			while(opcao != 2) {	
				System.out.println("Opcoes: ");
				System.out.println("\t1 - Adicionar novo sensor:\n\t2 - Acionar sensor(aciona o sensor):\n\t3 - Ativar sensor(altera o seu status para ativo):\n\t4 - Finalizar sessao");
				opcao = entrada.nextInt();
				switch (opcao) {
					//Adicionar sensor
					case 1:
						System.out.println("Digite o nome do sensor: ");
						Scanner nomeSensor = new Scanner(System.in);
						System.out.println(nomeSensor.nextLine());
						Sensor sensor = new Sensor(nomeSensor.nextLine());
						sensores.add(sensor);
						nomeSensor.close();
					break;
					
					//Acionar sensor
					case 2:
						System.out.println("Verificar sensor");
						System.out.println("Digite o nome do sensor: ");
						Scanner nomeSensorVerificacao = new Scanner(System.in);
						sensores.contains(this.sensor);
						nomeSensorVerificacao.close();
					break;
					
//					//Ativar sensor
//					case 3:
//					break;
//					
//					//Finalizar sessao
//					case 4:
//					break;
					
					default: 
						System.out.println("Opcao invalida.");
				}
			}
		}
		else System.out.println("Falha no login.");
		entrada.close();
		
	}
	
	public void desligarSistema() {}
	
	public String getCodigoDeSegurança() {
		return this.codigoDeSegurança;
	}

	public void setCodigoDeSegurança(String codigoDeSegurança) {
		this.codigoDeSegurança = codigoDeSegurança;
	}

}
