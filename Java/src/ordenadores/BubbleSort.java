package ordenadores;

public class BubbleSort {

	public static void main(String[] args) {
		int [] entrada = {2,4,5,1,0,7,9,3,8,6};
		imprimeArray(entrada);
		//bubbleSortIterativo(entrada);
		bubbleSortRecursivo(entrada, entrada.length);
		imprimeArray(entrada);

	}
	
	static void bubbleSortIterativo(int [] entrada) {
		int n = entrada.length;
		
		//Percorre de trás para frente 
		for (int i = n - 1; i > 0; i--) {
			
			//Percorre do segundo elemento até o primeiro For 
			for (int j = 1; j <= i; j++) {
				
				//Se o da esquerda é maior que o da direita, faz a troca entre eles
				//garantindo que o maior sempre fique na extrema direita
				if(entrada[j-1] > entrada[j]) {
					int aux = entrada[j-1];
					entrada[j-1] = entrada[j];
					entrada[j] = aux;
				}
			}
		}
	}
	
	static void bubbleSortRecursivo(int[] entrada, int n) {
		//Se há elementos a serem ordenados...
		if(n>1) {
			
			//Percorre todos os elementos
			for (int i = 1; i < n; i++) {
				
				//Se o da esquerda é maior que o da direita, faz a troca entre eles
				//garantindo que o maior sempre fique na extrema direita
				if (entrada[i-1] > entrada[i]) {
					int aux = entrada[i-1];
					entrada[i-1] = entrada[i];
					entrada[i] = aux;
				}
			}
			
			//Como o ultimo é o maior, chama os n-1 restantes não ordenados
			bubbleSortRecursivo(entrada, n-1);
		}
	}

	public static void imprimeArray(int [] entrada) {
		for (int i = 0; i < entrada.length; i++) {
			System.out.print(entrada[i] + " ");
		}
		System.out.println(); //pular linha no final
	}
}
