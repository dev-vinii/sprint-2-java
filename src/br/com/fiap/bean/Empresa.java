package br.com.fiap.bean;

public class Empresa extends Pessoa{
	private int cnpj;
	private String razaoSocial;
	
	public Empresa() {
		
	}
	
	
	
	public Empresa(int cnpj, String razaoSocial, String endereco, int contato, String email) {
		this.cnpj = cnpj;
		this.razaoSocial = razaoSocial;
		super.setContato(contato);
		super.setEmail(email);
		super.setEndereco(endereco);
	}



	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String getRazaoSocial() {
		return razaoSocial;
	}

	public void setRazaoSocial(String razaoSocial) {
		this.razaoSocial = razaoSocial;
	}

	
}
