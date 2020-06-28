package ordenacao;

public class TestaHeap {
	public static void main(String[] args) {
		int[] A = {3,7,2,8,5,1,6,4};
		HeapSort.constroiHeapMaxRec(A, 0);
		imprimirArranjo(A);

		
		int[] E = {11,3,70,8,6,20,5,15};
		HeapSort.constroiHeapMaxRec(E, 0);
		imprimirArranjo(E);
		
		
		int[] B = {1,2,3,4,8,7,6,5};
		HeapSort.constroiHeapMaxInt(B);
		imprimirArranjo(B);
		
		
		
		int[] C = {1,8,7,6,5,4,3,2};
		HeapSort.refazHeapMax(C, 0, C.length);
		imprimirArranjo(C);
		
		
		int[] D = {10,17,16,15,14,13,12,11};
		HeapSort.refazHeapMax(D, 0, C.length);
		imprimirArranjo(D);
		
		
		int[] F = {4,3,2,1,8,7,6,5};
		HeapSort.constroiHeapMaxInt(F);
		imprimirArranjo(F);
	}
	
	static void imprimirArranjo(int[] A) {
		for (int i=0;i<A.length;i++){
			System.out.print(A[i] + "\t");
		}
		System.out.println();
	}
}
