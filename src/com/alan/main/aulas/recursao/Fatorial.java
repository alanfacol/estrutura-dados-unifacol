package com.alan.main.aulas.recursao;

public class Fatorial {
	
	public static int get(int numero) {
		int resultado = 1;
		for (int i = numero; i > 1; i--){
			resultado *= i;
		}
		return resultado;
	}
	
	public static int getRercusiva(int numero) {
		if (numero > 0) {
			return numero * getRercusiva(numero - 1);
		} else {
			return 1;
		}
	}
	
	public static void main(String[] args) {
		int numero = 6;
		
		System.out.println(Fatorial.get(numero));
		System.out.println(Fatorial.getRercusiva(numero));
	}

}
