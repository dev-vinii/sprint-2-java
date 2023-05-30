package br.com.fiap.bean;

public class Bicicleta {
	private String marcaBike;
	private int anoBike;
	private double valorMercado;
	private String funcaoBike;
	private String modeloBike;
	private String corBike;
	
	public Bicicleta() {
		
	}

	public Bicicleta(String marcaBike, int anoBike, double valorMercado, String funcaoBike,
			String modeloBike, String corBike) {
		this.marcaBike = marcaBike;
		this.anoBike = anoBike;
		this.valorMercado = valorMercado;
		this.funcaoBike = funcaoBike;
		this.modeloBike = modeloBike;
		this.corBike = corBike;
	}

	public String getMarcaBike() {
		return marcaBike;
	}

	public void setMarcaBike(String marcaBike) {
		this.marcaBike = marcaBike;
	}

	public int getAnoBike() {
		return anoBike;
	}

	public void setAnoBike(int anoBike) {
		this.anoBike = anoBike;
	}

	public double getValorMercado() {
		return valorMercado;
	}

	public void setValorMercado(double valorMercado) {
		this.valorMercado = valorMercado;
	}

	public String getFuncaoBike() {
		return funcaoBike;
	}

	public void setFuncaoBike(String funcaoBike) {
		this.funcaoBike = funcaoBike;
	}

	public String getModeloBike() {
		return modeloBike;
	}

	public void setModeloBike(String modeloBike) {
		this.modeloBike = modeloBike;
	}

	public String getCorBike() {
		return corBike;
	}

	public void setCorBike(String corBike) {
		this.corBike = corBike;
	}
	
	
	
}
