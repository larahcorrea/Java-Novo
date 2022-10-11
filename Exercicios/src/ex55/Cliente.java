package ex55;

public class Cliente {
	
	public int id;
	public String nome;
	public int idade;
	public String email;
	public ContaBancaria cb;

	
	
	Cliente(){
		
	}
	 
	Cliente (int id, String nome, int idade,String email, ContaBancaria cb){
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.cb = cb;
	}
	public void atualizarEmail(String novoEmail) {
		this.email = novoEmail;
	}
	public String exibirDadosBanco() {
		return "Agencia: "+ this.cb.agencia + " - Número: " + this.cb.numero + " - Saldo: " + this.cb.saldo;
	


}
	public String exibirDados() {
		return "- ID "+ this.id + " - Nome " + this.nome + " - Email " + this.email + " - Idade " + this.idade ;
	}

}