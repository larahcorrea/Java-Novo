package ex55;

public class ContaBancaria1 {
	private int agencia;
	private int numero;
	private Double saldo;
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Double getSaldo() {
		return saldo;
	}
	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}
	
	
	ContaBancaria1(){
		
	}
	ContaBancaria1 (int agencia, int numero, Double saldo){
	
	this.agencia = agencia;
	this.numero = numero;
	this.saldo = saldo;
	}
	
	
	
	
	
}
