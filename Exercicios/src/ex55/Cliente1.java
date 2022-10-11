package ex55;


public class Cliente1 {
	
	private String nome;
	private int idade;
	private String email;
	private ContaBancaria1 cb1;
	
	private int id;
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ContaBancaria1 getCb1() {
		return cb1;
	}

	public void setCb1(ContaBancaria1 cb1) {
		this.cb1 = cb1;
	}
	

	
	
	Cliente1(){
		
	}
	 
	Cliente1 (int id, String nome, int idade,String email, ContaBancaria1 cb){
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.cb1 = cb;
	}
	public void atualizarEmail(String novoEmail) {
		this.setEmail(novoEmail);
	}
	public String exibirDadosBanco1() {
		return "Agencia: "+ this.cb1.getAgencia() + " - Número: " + this.cb1.getNumero() + " - Saldo: " + this.cb1.getSaldo();
	


}
	public String exibirDados1() {
		return "- ID "+ this.getId() + " - Nome " + this.getNome() + " - Email " + this.getEmail() + " - Idade " + this.getIdade() ;
	}

}