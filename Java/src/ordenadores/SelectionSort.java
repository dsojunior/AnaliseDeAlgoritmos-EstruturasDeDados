package ordenadores;

public class SelectionSort {

	public static void main(String[] args)	{
		int [] entrada = {2,4,5,1,0,7,9,3,8,6};
		imprimeArray(entrada);
		//selectionSortInterativo(entrada);
		selectionSortRecursivo(entrada, entrada.length);
		imprimeArray(entrada);
	}
	
	static void selectionSortInterativo (int [] entrada) {
		int max; 
		int n = entrada.length; //Tamanho do Array
		
		//Primeiro for percorre N - 1 elementos do final para o come�o do Array
		for (int i = n - 1 ; i > 0; i--) {
			//Define o valor maximo inicialmente com o ultimo elemento 
			max = i;
			
			//O Segundo For vai do primeiro elemento at� o elemtno mais ordenado - 1
			for (int j = 0; j < i; j++) {
				//Atribui o maior vaior encontrado at� o momento
				if (entrada[j] > entrada[max]){
					max = j;   
				}
			}
			
			//Se encontrou algum maior, faz a Troca, colocando o maior sempre no final
			if (i != max){
				int aux = entrada[i];
				entrada[i] = entrada[max];
				entrada[max] = aux;
			}
		}
	}
	
	static void selectionSortRecursivo(int [] entrada, int n){
		//Se h� elementos a serem ordenados....
		if (n > 1){
			//Seta inicialmente zero como maior valor
			int max = 0;
			
			//Percorre a partir do segundo elemento at� o final (N-1 elementos)
			for (int i = 1; i < n; i++)	{
				//Se encontrar um maior valor na verredura, atribui como maximo
				if (entrada[i] > entrada[max]){
					max = i;
				}
			}
			
			//Se eu encontrei um valor maior "fora da posi��o", eu coloco ele na maior posi��o poss�vel
			if (n-1 != max)	{
				int aux = entrada[n-1];
				entrada[n-1] = entrada[max];
				entrada[max] = aux;
			}
			
			//Chamo recursivo para N-1 restantes, ja que o ultimo est� ordenado
			selectionSortRecursivo(entrada, n-1);
		}
	}
	
	
	static void imprimeArray(int [] entrada) {
		for (int i = 0; i < entrada.length; i++) {
			System.out.print(entrada[i] + " ");
		}
		System.out.println(); //pular linha no final
	}

}
