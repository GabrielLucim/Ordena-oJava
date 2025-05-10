package ex1;

import util.ImpressaoVetor;

public class SelectionSort {
	public static void main(String[] args) {
		int vetor[] = { 3, 4, 9, 2, 5, 8, 2, 1, 7 };
		ordenar(vetor);
	}

	public static void ordenar(int numeros[]) {
		int tamanho = numeros.length;

		for (int i = 0; i < tamanho - 1; i++) {
			int minIndex = i;

			for (int j = i + 1; j < tamanho; j++) {
				if (numeros[j] > numeros[minIndex]) {
					minIndex = j;
				}
			}

			if (minIndex != i) {
				int aux = numeros[i];
				numeros[i] = numeros[minIndex];
				numeros[minIndex] = aux;
			}

			ImpressaoVetor.imprimir(numeros);
		}
	}
}