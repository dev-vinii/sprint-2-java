package br.com.fiap.bean;

import java.util.Date;

public class VistoriaSolicitada {
	private String nomeCLiente;
	private int cpf;
	private int cnpj;
	private String nomeCorretor;
	private String nomeDaBike;
	private String modeloBike;
	private Date prazo;
	
	public VistoriaSolicitada() {
		
	}

	public VistoriaSolicitada(String nomeCLiente, int cpf, int cnpj, String nomeCorretor, String nomeDaBike,
			String modeloBike) {
		this.nomeCLiente = nomeCLiente;
		this.cpf = cpf;
		this.cnpj = cnpj;
		this.nomeCorretor = nomeCorretor;
		this.nomeDaBike = nomeDaBike;
		this.modeloBike = modeloBike;
	}

	public String getNomeCLiente() {
		return nomeCLiente;
	}

	public void setNomeCLiente(String nomeCLiente) {
		this.nomeCLiente = nomeCLiente;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public int getCnpj() {
		return cnpj;
	}

	public void setCnpj(int cnpj) {
		this.cnpj = cnpj;
	}

	public String getNomeCorretor() {
		return nomeCorretor;
	}

	public void setNomeCorretor(String nomeCorretor) {
		this.nomeCorretor = nomeCorretor;
	}

	public String getNomeDaBike() {
		return nomeDaBike;
	}

	public void setNomeDaBike(String nomeDaBike) {
		this.nomeDaBike = nomeDaBike;
	}

	public String getModeloBike() {
		return modeloBike;
	}

	public void setModeloBike(String modeloBike) {
		this.modeloBike = modeloBike;
	}
	
	
}
