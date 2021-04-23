package br.com.erickfreire.apolicedesegurodeautomovelmodificada;

/**
 * Programa em Java que simula uma apolice de seguto de automovel
 * @author Erick Freire
 * @version 1 Criado em 23-04-2021 as 17:15
 */

public class ApoliceDeSeguroDeAutomovelModificada {
	
	private int numeroDaConta;
	private String modeloDoCarro;
	private String estado;
	
	public ApoliceDeSeguroDeAutomovelModificada(int numeroDaConta, String modeloDoCarro, String estado) {
		this.numeroDaConta = numeroDaConta;
		this.modeloDoCarro = modeloDoCarro;
		this.estado = estado;
	}

	public int getNumeroDaConta() {
		return numeroDaConta;
	}

	public void setNumeroDaConta(int numeroDaConta) {
		this.numeroDaConta = numeroDaConta;
	}

	public String getModeloDoCarro() {
		return modeloDoCarro;
	}

	public void setModeloDoCarro(String modeloDoCarro) {
		this.modeloDoCarro = modeloDoCarro;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public boolean estadoValido() {
		boolean estVal;
		switch (getEstado()) 
		{
		case "MA": 
		case "NJ": 
		case "NY":
		case "PA":
		case "CT":
		case "ME":
		case "NH":
		case "VT":
	       estVal = true; 
		   break; 
	    default: 
		   estVal = false; 
		   break; 
		} 
		return estVal;
	}

}
