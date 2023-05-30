package br.com.fiap.bean;

public class Modificacoes {
	private String quadro;
	private String freio;
	private String guidao;
	private String pneu;
	private String suspensaoTraseira;
	private String suspensaoDianteira;
	private String pedal;

	public Modificacoes() {
		
	}

	public Modificacoes(String quadro, String freio, String guidao, String pneu, String suspensaoTraseira,
			String suspensaoDianteira, String pedal) {
		this.quadro = quadro;
		this.freio = freio;
		this.guidao = guidao;
		this.pneu = pneu;
		this.suspensaoTraseira = suspensaoTraseira;
		this.suspensaoDianteira = suspensaoDianteira;
		this.pedal = pedal;
	}

	public String getQuadro() {
		return quadro;
	}

	public void setQuadro(String quadro) {
		this.quadro = quadro;
	}

	public String getFreio() {
		return freio;
	}

	public void setFreio(String freio) {
		this.freio = freio;
	}

	public String getGuidao() {
		return guidao;
	}

	public void setGuidao(String guidao) {
		this.guidao = guidao;
	}

	public String getPneu() {
		return pneu;
	}

	public void setPneu(String pneu) {
		this.pneu = pneu;
	}

	public String getSuspensaoTraseira() {
		return suspensaoTraseira;
	}

	public void setSuspensaoTraseira(String suspensaoTraseira) {
		this.suspensaoTraseira = suspensaoTraseira;
	}

	public String getSuspensaoDianteira() {
		return suspensaoDianteira;
	}

	public void setSuspensaoDianteira(String suspensaoDianteira) {
		this.suspensaoDianteira = suspensaoDianteira;
	}

	public String getPedal() {
		return pedal;
	}

	public void setPedal(String pedal) {
		this.pedal = pedal;
	}
	
	
}
