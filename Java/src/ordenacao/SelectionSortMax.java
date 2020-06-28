package ordenacao;

public class SelectionSortMax {

	public static void ordenar(int[] A, int n){
		if (n >= 2){
			int max = 0;
			for (int i=1;i<=n-1;i++){
				if (A[i] > A[max]){
					max = i;
				}
			}
			if (max != n-1){
				int temp = A[max];
				A[max] = A[n-1];
				A[n-1] = temp;
			}
			ordenar(A,n-1);
		}
	}
	
}
