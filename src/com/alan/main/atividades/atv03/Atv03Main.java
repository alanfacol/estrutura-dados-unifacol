package com.alan.main.atividades.atv03;

public class Atv03Main {
	
	public static Pessoa[] filaPessoa = new Pessoa [15];
	public static int fim = 0;
	
	public static void adicionar(Pessoa pessoa) {
		if (!cheia()) {
			filaPessoa[fim] = pessoa;
			fim++;
		} else {
			System.out.println("Erro ao adicionar a pessoa- Fila cheia!");
		}
	}
	
	public static void remover() {
		if (!vazia()) {
			filaPessoa[0] = null;
			for (int i = 0; i < filaPessoa.length; i++) {
				if (i <= filaPessoa.length - 2) {
					filaPessoa[i] = filaPessoa[i+1];
				} else {
					filaPessoa[i] = null;
				}
			}
			fim--;
		} else {
			System.out.println("Erro ao remover - Pilha vazia!");
		}
	}
	
	public static Pessoa primeiro() {
		return filaPessoa[0];
	}
	
	private static boolean vazia() {
		if (fim == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	private static boolean cheia(){
		if (fim >= filaPessoa.length) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		adicionar(new Pessoa("Alan", 24));
		adicionar(new Pessoa("Pedro", 30));
		adicionar(new Pessoa("Amanda", 21));
		adicionar(new Pessoa("Bruna", 16));
		adicionar(new Pessoa("Diego", 40));
		adicionar(new Pessoa("Junior", 43));
		adicionar(new Pessoa("Mateus", 40));
		adicionar(new Pessoa("Filipe", 21));
		adicionar(new Pessoa("Paulo", 32));
		adicionar(new Pessoa("João", 27));
		adicionar(new Pessoa("Silva", 28));
		adicionar(new Pessoa("Santos", 29));
		adicionar(new Pessoa("Augusto", 44));
		adicionar(new Pessoa("Marli", 39));
		adicionar(new Pessoa("Aline", 18));
		
		System.out.println("O primeiro da fila no momento é: " + primeiro().getNome());
		
		for (int i = 0; i < 7; i++) {
			remover();
		}
		
		System.out.println("O primeiro da fila, após a retirada de 7 pessoas é: " + primeiro().getNome());
		
		for (int i = 0; i < 12; i++) {
			remover();
		}
		
		System.out.println("Só é possível mais 5 retiradas da fila");

	}

}
