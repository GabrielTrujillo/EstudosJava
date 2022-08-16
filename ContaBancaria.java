
public class ContaBancaria {
	
	//Os atributos da classe conta bancaria estão encapsulados por proteção
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente cliente;
	
	//Dentro de uma especificacao existirao metodos (depositar, Sacar, Transferir), getters e setters
	
	//Os metodos saca, deposita e transfere sao especies de Setters do saldo
	public void deposita(double valor){
		this.saldo += valor;
	}
	
	public boolean saca(double valor){
		if(valor > this.saldo) {
			return false;
		}else {
			this.saldo -= valor;
			return true;
		}
	}
	
	public boolean transfere(double valor, ContaBancaria destino) {
		if(valor > this.saldo) {
			return false;
		}else {
			//this.saldo -= valor;
			//destino.saldo += valor;
			this.saca(valor);
			destino.deposita(valor);
			return true;
		}
	}
	
	//Getter do atributo saldo
	public double getSaldo() { 
		return this.saldo;
	}
	
	//Setter e Getter do Atributo agencia
	
	public void setAgencia(int agencia) {
		if(agencia > 0) {
			this.agencia = agencia;
		}else {
			System.out.println("Valor de agencia inconsistente, Tente Novamente");
		}
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	//Setter e Getter do Atributo numero
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getNumero() {
		return this.numero;
	}
	
	//Setter e Getter do atributo Cliente
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Cliente getCliente() {
		return this.cliente;
	}
}
