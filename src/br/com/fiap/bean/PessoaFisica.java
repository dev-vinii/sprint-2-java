package br.com.fiap.bean;

public class PessoaFisica extends Pessoa{

	private String nome;
	private int cpf;
	private int rg;
	
	
	public PessoaFisica() {
		
	}

	
	
	public PessoaFisica(String nome, int cpf, int rg, String endereco, int contato, String email) {
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		super.setEndereco(endereco);
		super.setEmail(email);
		super.setContato(contato);
	}



	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getCpf() {
		return cpf;
	}


	public void setCpf(int cpf) {
		this.cpf = cpf;
	}


	public int getRg() {
		return rg;
	}


	public void setRg(int rg) {
		this.rg = rg;
	}
	
}
