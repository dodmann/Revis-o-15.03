package exercicio6;

import java.util.ArrayList;
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
			
			System.out.println("Login realizado com sucesso.");
			int opcao = 0;
			while(opcao != 19203) {	
				System.out.println("Opcoes: ");
				System.out.println("\t1 - Adicionar novo sensor:\n\t2 - Ativar sensor(altera o seu status para ativo):\n\t3 - Acionar sensor(aciona o sensor):\n\t4 - Finalizar sessao");
				opcao = entrada.nextInt();
				switch (opcao) {
					//Adicionar sensor
					case 1:
						System.out.println("Digite o nome do sensor: ");						
						Scanner nomeSensor = new Scanner(System.in);
						String id = nomeSensor.nextLine();
						Sensor sensor = new Sensor(id);
						sensores.add(sensor);
					break;
					
					//Ativar sensor
					case 2:
						System.out.println("Sensores disponíveis: ");
						for(Sensor sensor1 : sensores) {
							System.out.print(sensor1.getId()+" ");
						}
						System.out.println();
						System.out.println("Digite o nome do sensor a ser ativado: ");			
						Scanner sensorASerPesquisado = new Scanner(System.in);
						String respostaAtivacao = sensorASerPesquisado.nextLine();
						for(Sensor sensorPesquisa : sensores) {
							if(sensorPesquisa.getId().equals(respostaAtivacao)) {
								sensorPesquisa.setAtivo(true);
							}
						}
					break;
					
					//Acionar sensor
					case 3:
						System.out.println("Sensores disponíveis: ");
						for(Sensor sensor1 : sensores) {
							System.out.print(sensor1.getId()+" ");
						}
						System.out.println();
						System.out.println("Digite o nome do sensor a ser ativado: ");
						Scanner sensorASerAcionado = new Scanner(System.in);
						String respostaAcionamento = sensorASerAcionado.nextLine();
						for(Sensor sensorPesquisa : sensores) {
							if(sensorPesquisa.getId().equals(respostaAcionamento) && sensorPesquisa.isAtivo()) {
								sensorPesquisa.setStatus("acionado");
							}
							else System.out.println("Falha no acionamento.");
						}
					break;
					
					//Desligar sistema
					case 4:
						System.out.println("Digite o codigo de seguranca: ");
						Scanner scanner = new Scanner(System.in);
						String senhaDesligar = scanner.nextLine();
						boolean resultado = this.desligarSistema(senhaDesligar);
						if(resultado) return;
					break;
					
					default: 
						System.out.println("Opcao invalida.");
				}
			}
		}
		else System.out.println("Falha no login.");
		entrada.close();
		
	}
	
	public boolean desligarSistema(String codigoDeSeguranca) {
		if(codigoDeSeguranca.equals(this.codigoDeSeguranca)) {
			System.out.println("Sessão finalizada.");
			return true;
		}
		else {
			System.out.println("Senha incorreta.");
			return false;
		}
	}
	
	public void verificaStatus() {
		
	}
	
	public String getCodigoDeSeguranca() {
		return this.codigoDeSeguranca;
	}

	public void setCodigoDeSeguranca(String codigoDeSeguranca) {
		this.codigoDeSeguranca = codigoDeSeguranca;
	}

}
