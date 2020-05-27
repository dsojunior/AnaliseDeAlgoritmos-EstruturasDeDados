package ordenadores;

public class HeapSort {

	public static void main(String[] args) {
		int [] entrada = {1,2,3,4,5,6,7,8};
		imprimeArray(entrada);
		constroiHeapMaxInterativo(entrada);
	}
	
	static void refazHeapMax (int [] entrada, int i, int comprimentoHeap) {
		int esquerda = 2 * i + 1;
		int direita = 2 * i + 2;
		
		int maior;
		
		if (esquerda < comprimentoHeap && entrada[esquerda] > entrada[i]) {
			maior = esquerda;
		} else {
			maior = i;
		}
		
		if (direita < comprimentoHeap && entrada[direita] > entrada[maior]) {
			maior = direita;
		}
		
		if (maior != i) {
			//Faz a troca (swap), utilizando um temporário
			int aux = entrada[i];
			entrada[i] = entrada[maior];
			entrada[maior] = aux;
			
			imprimeArray(entrada);
			
			//Chama recursivamente
			refazHeapMax(entrada, maior, comprimentoHeap);
		}
		
	}
	
	static void constroiHeapMaxInterativo (int [] entrada) {
		int comprimentoHeap  = entrada.length;
		for (int i = (comprimentoHeap / 2) - 1 ; i >= 0; i--) {
			refazHeapMax(entrada, i, comprimentoHeap);
		}
	}
	
	public static void imprimeArray(int [] entrada) {
		for (int i = 0; i < entrada.length; i++) {
			System.out.print(entrada[i] + " ");
		}
		System.out.println(); //pular linha no final
	}

}
