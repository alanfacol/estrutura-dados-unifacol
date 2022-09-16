package com.alan.main.atividades.atv04;

public class Atv04Main {
	
	public static ListaCarro[] adicionar(ListaCarro[] lista) {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == null) {
				lista[i] = new ListaCarro(new Carro("Ford K" + (i+1), 2000 + (i+1)));
				lista[i-1].setProximaLista(lista[i]);
				break;
			}
		}
		
		return lista;
	}
	
	public static ListaCarro[] removerUltimo(ListaCarro[] lista) {
		for (int i = 0; i < lista.length; i++) {
			if (lista[i] == null && i > 1) {
				lista[i-2].setProximaLista(null);
				lista[i-1] = null;
				break;
			} else if (i == lista.length - 1) {
				lista[i - 1].setProximaLista(null);
				lista[i] = null;
				break;
			}
		}
		
		return lista;
	}

	public static ListaCarro mostrar(ListaCarro lista) {
		if (lista != null) {
			System.out.println(lista.getCarro().getModelo() + " - " + lista.getCarro().getAno() + " - " + lista.getProximaLista());		
			return mostrar(lista.getProximaLista());
		} 
		
		return null;
	}
	
	public static ListaCarro[] montar(ListaCarro[] vetorLista) {
		for (int i = 0; i < vetorLista.length; i++) {
			vetorLista[i] = new ListaCarro(new Carro("Ford K" + (i+1), 2000 + (i+1)));
		}
		
		for (int i = 0; i < vetorLista.length; i++) {
			if (i <= vetorLista.length - 2) {
				vetorLista[i].setProximaLista(vetorLista[i+1]);
			} else {
				vetorLista[i].setProximaLista(null);
			}
		}
		
		return vetorLista;
	}

	public static void main(String[] args) {
		ListaCarro[] vetorLista = new ListaCarro[10];

		montar(vetorLista);
		
		for (int i = 0; i < 10; i++) {
			vetorLista = removerUltimo(vetorLista);			
		}

		for (int i = 0; i < 2; i++) {
			vetorLista = adicionar(vetorLista);
		}
		
		mostrar(vetorLista[0]);
		
	}
}
