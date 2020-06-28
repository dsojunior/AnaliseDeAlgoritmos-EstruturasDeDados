package ordenacao;

import java.util.Random;

public class QuickSort2 {
	
	
	public static void main(String[] args){
		int n = 1000;
		int[] A = gerarConjuntoAleatorio(n);
		QuickSort(A,0,n-1);
		
		for (int i=0;i<n;i++){
			System.out.print(A[i] + " ");
		}
		System.out.println();
		
	}
	
	private static int[] gerarConjuntoAleatorio(int n) {
		Random r = new Random();
		int[] A = new int[n];
		for (int i=0;i<n;i++){
			A[i] = r.nextInt(n);
		}
		return A;
	}

	static void QuickSort(int[] A, int ini, int fim) {
		if (ini < fim) {
			int q = particaoAleatoria(A, ini, fim);
			QuickSort(A, ini, q - 1);
			QuickSort(A, q + 1, fim);
		}
	}


	static int particao (int[] A, int ini, int fim) {
		int i, j, temp;
		int x = A[fim]; // pivô
		i = ini;
		j = fim - 1;
		while (i <= j) {
			if(A[i] <= x) {
				i++;
			} else if (A[j] > x) {
				j--;
			} else { // trocar A[i] e A[j]
				temp = A[i];
				A[i] = A[j];
				A[j] = temp;
				i++;
				j--;
			}
		}
		A[fim] = A[i]; // reposicionar o pivô
		A[i] = x;
		return i;
	}

	static int particaoAleatoria (int[] A, int ini, int fim) {
		int i, temp;
		double f;
		// Escolhe um número aleatório entre ini e fim
		f = java.lang.Math.random();
		// retorna um real f tal que 0 <= f < 1
		i = (int) (ini + (fim - ini) * f);
		// i é tal que ini <= i < fim
		// Troca de posicao A[i] e A[fim]
		temp = A[fim];
		A[fim] = A[i];
		A[i] = temp;
		return particao(A, ini, fim);
	}


}

