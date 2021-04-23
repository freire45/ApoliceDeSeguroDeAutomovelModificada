package br.com.erickfreire.apolicedesegurodeautomovelmodificada;

public class ApoliceDeSeguroDeAutomovelModificadaTeste {
	public static void main(String[] args) {
		ApoliceDeSeguroDeAutomovelModificada apolice1 = new ApoliceDeSeguroDeAutomovelModificada(11111111, "Toyota Camry", "NJ");
		ApoliceDeSeguroDeAutomovelModificada apolice2 = new ApoliceDeSeguroDeAutomovelModificada(22222222, "Ford Fusion", "NY");

		estadoValido1(apolice1);
		estadoValido1(apolice2);
	}

	public static void estadoValido1(ApoliceDeSeguroDeAutomovelModificada apolice) {
		System.out.println("A Apolice do seguro do carro:");
		System.out.printf("Conta #: %d; Carro: %s; Estado %s %s Estado válido: %n%n", apolice.getNumeroDaConta(),
				apolice.getModeloDoCarro(), apolice.getEstado(), (apolice.estadoValido() ? "é" : "não é"));
	}

}
