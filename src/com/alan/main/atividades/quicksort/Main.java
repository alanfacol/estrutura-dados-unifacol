package com.alan.main.atividades.quicksort;

public class Main {

	private static void quickSort(int[] array, int start, int end) {
		if (end > start) {
			int pivo = divide(array, start, end); // ordena com base no pivo escolhido
			quickSort(array, start, pivo - 1); // ordena os da esquerda do pivo
			quickSort(array, pivo + 1, end); // ordena os da direita do pivo
		}
	}

	private static int divide(int[] array, int start, int end) {
		int pivot = array[end];
		int i = start;
		for (int j = start; j < end; j++) {
			/*
			 * Bloco que verifica se o elemento array[j] é menor que o pivo (o if abaixo)
			 * Isso Indica que o elemento deve ser enviado para a posição onde os elementos
			 * menores que ele ficam, ou seja, no inicio do array, indicado pela variável i
			 * 
			 * A Grosso modo, a variável j sempre irá buscar por elementos menores que o
			 * pivô, para enviar eles para a posição da variável i
			 */
			if (array[j] <= pivot) {
				change(array, j, i);
				i++;
			}
		}
		change(array, i, end); // momento onde o pivo (end) é enviado para logo a frente das variáveis menores que ele (i) 
		return i;
	}

	private static void change(int[] array, int x, int y) {
		int t = array[x];
		array[x] = array[y];
		array[y] = t;
	}

	public static void main(String[] args) {

		int array[] = { 1, 2, 5, 7, 3, 4, 8, 6 };
		quickSort(array, 0, array.length - 1);

		for (int i : array) {
			System.out.print(i + " ");
		}

	}

}
