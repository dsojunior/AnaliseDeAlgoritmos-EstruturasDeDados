package ordenacao;

public class TestaOrdenador {

	public static void main(String[] args){
		int[] arranjo = {1,4,5,2,6,3,10,9,7,8};
		SelectionSortMax.ordenar(arranjo, arranjo.length);
		imprimirArranjo(arranjo);
	}
	
	public static void imprimirArranjo(int[] A){
		for (int i=0;i<A.length;i++){
			System.out.print(A[i] + " ");
		}
		System.out.println();
	}
	
}
