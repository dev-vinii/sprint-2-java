package br.com.fiap.bean;

public class Login {
	private String nome;
	private String senha;
	
	public Login() {
		
	}

	public Login(String nome, String senha) {
		this.nome = nome;
		this.senha = senha;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void logar() {
		String nomeConta = "teste";
		String senhaConta = "teste123";
		
		if (this.getNome() == nomeConta && this.getSenha() == senhaConta) {
			System.out.println("Login efetuado com sucesso!");;
		} else {
			System.out.println("Nome ou senha incorreta!");;
		}
	}
}
