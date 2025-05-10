package ex1;
import util.ImpressaoVetor;

public class BubbleSort {
	   public static void main (String[] args) {
	       int vetor[] = {3, 4, 9, 2, 5, 8, 2, 1, 7};
	       ordenar(vetor);
	   }
	   public static void ordenar(int numeros[]) {
		int tamanho = numeros.length;
		for (int x = 0; x < tamanho - 1; x++) {
			for (int y = 0; y < tamanho - 1 - x; y++) {
				if (numeros[y] > numeros[y + 1]) {
					int aux = numeros[y];
					numeros[y] = numeros[y + 1];
					numeros[y + 1] = aux;
				}
				ImpressaoVetor.imprimir(numeros);
			}
	   }
	   }
	}
