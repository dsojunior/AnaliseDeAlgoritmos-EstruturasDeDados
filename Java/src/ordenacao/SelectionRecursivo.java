package ordenacao;

public class SelectionRecursivo {

	public static void ordena(int[] A, int n) {
		if (n==1) return;
		int maior = n-1;
		for (int i=0;i<n-1;i++){
			if (A[i]>A[maior]) maior = i;
		}
		int temp = A[maior];
		A[maior] = A[n-1];
		A[n-1] = temp;
		ordena(A,n-1);
	}
	
	
	public static void main(String[] args){
		int[] X = {3,5,1,4,9,2};
		ordena(X, X.length);
		for (int i=0;i<X.length;i++){
			System.out.print(X[i] + " ");
		}
	}
}
