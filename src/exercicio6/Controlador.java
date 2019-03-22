package exercicio6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Controlador {
	private String codigoDeSeguranca;	
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
		this.setCodigoDeSeguranca(codigoDeSeguranca);
	}
	
	public void ligarSistema() {
		System.out.println("Digite o codigo de seguranca a ser criado:");
		Scanner entrada = new Scanner(System.in);		
		this.definirCodigoDeSeguranca(entrada.nextLine());
		System.out.println("Codigo de seguranca: ");
		String result = entrada.nextLine();
		if (this.getCodigoDeSeguranca().equals(result)) {
			//Criando lista de sensores
			sensores = new ArrayList<Sensor>();
			Iterator<Sensor> itr = sensores.iterator();
			
			System.out.println("Login realizado com sucesso.");
			int opcao = 0;
			while(opcao != 4) {	
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
					break;
					
					//Acionar sensor
					case 2:
//						System.out.println("Verificar sensor");
//						System.out.println("Digite o nome do sensor: ");
//						Scanner nomeSensorVerificacao = new Scanner(System.in);
						System.out.println("Sensores disponíveis: ");
						while(itr.hasNext()) {
							Object sensores = itr.next();
							System.out.print(sensores + " ");
						}
						System.out.println();
					break;
					
					//Ativar sensor
					case 3:
					break;
					
					//Finalizar sessao
					case 4:
					break;
					
					default: 
						System.out.println("Opcao invalida.");
				}
			}
		}
		else System.out.println("Falha no login.");
		entrada.close();
		
	}
	
	public void desligarSistema() {}
	
	public String getCodigoDeSeguranca() {
		return this.codigoDeSeguranca;
	}

	public void setCodigoDeSeguranca(String codigoDeSeguranca) {
		this.codigoDeSeguranca = codigoDeSeguranca;
	}

}
