package ordenacao;

public class CountingSortParaRadix {

	static final int k = 256; //valor maximo de um char
	
	public static void imprimirArranjo(String[] A) {
		for (int i=0;i<A.length;i++){
			System.out.print(A[i] + " ");
		}
		System.out.println();
		
	}

	static String[] countingSort(String[] A, int digito){
		int n = A.length;
		String[] B = new String[n];
		int[] C = new int[k];
		for (int j=0;j<n;j++) C[A[j].charAt(digito)]++;
		for (int i=1;i<k;i++) C[i] += C[i-1];
		for (int j=n-1;j>=0;j--) {
			B[C[A[j].charAt(digito)]-1] = A[j];
			C[A[j].charAt(digito)]--;
		}
		return B;
	}

	static int max(int A[]){
		int n = A.length;
		if (n > 0){
			int temp = A[0];
			for (int i=1;i<n;i++){
				if (temp < A[i]) temp = A[i];
			}
			return temp;
		}else{
			return -1;
		}

	}


}
