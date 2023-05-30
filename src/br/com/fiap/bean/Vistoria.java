package br.com.fiap.bean;

public class Vistoria {
	private boolean analiseAvaria;
	private boolean confirmaçãoInformaçãoBike;
	
	public Vistoria() {
		
	}

	public Vistoria(boolean analiseAvaria, boolean confirmaçãoInformaçãoBike) {
		this.analiseAvaria = analiseAvaria;
		this.confirmaçãoInformaçãoBike = confirmaçãoInformaçãoBike;
	}

	public boolean isAnaliseAvaria() {
		return analiseAvaria;
	}

	public void setAnaliseAvaria(boolean analiseAvaria) {
		this.analiseAvaria = analiseAvaria;
	}

	public boolean isConfirmaçãoInformaçãoBike() {
		return confirmaçãoInformaçãoBike;
	}

	public void setConfirmaçãoInformaçãoBike(boolean confirmaçãoInformaçãoBike) {
		this.confirmaçãoInformaçãoBike = confirmaçãoInformaçãoBike;
	}
	
	public void validacao(boolean avaria, boolean infos) {
		if (avaria == true && infos == true) {
			System.out.println("Vistoria aprovada");
		} else {
			System.out.println("Vistoria reprovada");
		}
	}
}
