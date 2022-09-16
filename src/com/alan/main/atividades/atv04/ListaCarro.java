package com.alan.main.atividades.atv04;

public class ListaCarro {
	private Carro carro;
	private ListaCarro proximaLista;
	
	public ListaCarro () {
		
	}
	
	public ListaCarro (Carro carro) {
		this.carro = carro;
	}
	
	public Carro getCarro() {
		return carro;
	}
	public void setCarro(Carro carro) {
		this.carro = carro;
	}
	public ListaCarro getProximaLista() {
		return proximaLista;
	}
	public void setProximaLista(ListaCarro proximaLista) {
		this.proximaLista = proximaLista;
	}
}
