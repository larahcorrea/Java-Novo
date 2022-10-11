package ex54;

public class Pessoa {
	public int id;
	public String nome;
	public Dependente dep;
	
	
	
	Pessoa(){
		
	}
	Pessoa (int id, String nome, Dependente dep){
		this.id = id;
		this.nome = nome;
		this.dep = dep;
		
	}
	
	public void transformaNomeMaiusculo() {
		this.nome = this.nome.toUpperCase();
		
	}
	
	public String exibirNome() {
		return (this.id + " - " + this.nome);
	}
	public void mudarNome (String novoNome) {
		this.nome = novoNome;
		
	}
	   
    public String exibirDependente() {
        return "Nome: " + this.dep.nome + " - " + "Idade: " + this.dep.idade;
    }

	

}
