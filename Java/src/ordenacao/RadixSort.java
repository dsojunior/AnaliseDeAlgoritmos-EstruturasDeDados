package ordenacao;

public class RadixSort {

	public static String[] radix(String[] A, int numDigitos){
		for (int i=numDigitos-1;i>=0;i--){
			A = CountingSortParaRadix.countingSort(A, i);
		}
		return A;
	}
	
	public static void main(String[] args){
		String[] arranjo = {"casa", "bola", "cara","asas","dado", "polo", "cubo"};
		arranjo = radix(arranjo, 4);
		System.out.println("Imprimindo sequencia ordenada:");
		for (int i=0;i<arranjo.length;i++){
			System.out.println(arranjo[i]);
		}
	}
}
