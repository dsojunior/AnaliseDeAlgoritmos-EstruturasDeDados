package ordenadores;

public class InsertionSort {
	public static void main(String[] args) {
		int [] entrada = {2,4,5,1,0,7,9,3,8,6};
		imprimeArray(entrada);
		//insertionSortIterativa(entrada);
		insertionSortRecursivo(entrada, entrada.length);
		imprimeArray(entrada);
	}
	
	static void insertionSortIterativa (int [] entrada) {
		int pivo;
		
		//Percorre a entrada
		for (int i = 1; i < entrada.length; i++) {
			
			//Atribui como pivo a posicao atual do Array
			pivo = entrada[i];
			
			int j = i;
			
			//Percorre todos os elementos a esquerda do pivo enquanto encontrar algum maior
			while ((j>0) && (entrada[j-1]>pivo)) {
				entrada[j] = entrada[j-1];
				j = j-1;
			}
			
			//Troca de posicao, garantindo que todos os maiores estao a direita e os menores estão a esquerda
			entrada[j] = pivo;
		}
	}
	
	static void insertionSortRecursivo (int[] entrada, int n) {
		//Se há elementos a serem ordenados...
		if (n>1) {
			
			//Chama recursivo para n-1 elementos
			insertionSortRecursivo(entrada, n-1);
			
			int aux;
			int i = n - 1;
			
			//Percorre todos os elementos a esquerda do vetor, e se encontrar um maior, realiza a troca
			//garantindo que todos os menores ficam a esquerda e os maiores fiquem a direita
			while (i>0 && entrada [i-1] > entrada[i]) {
				aux = entrada [i];
				entrada[i] = entrada[i-1];
				entrada[i-1] = aux;
				i--;
			}
		}
	}
	
	static void imprimeArray(int [] entrada) {
		for (int i = 0; i < entrada.length; i++) {
			System.out.print(entrada[i] + " ");
		}
		System.out.println(); //pular linha no final
	}
}
