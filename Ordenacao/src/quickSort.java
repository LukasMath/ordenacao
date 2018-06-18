import java.util.Arrays;

public class quickSort {

	public static void main(String[] args) {
		
		int[]v = {6,3,4,5,2,7,1,9,8,0};
		quicksort(v, 0, v.length-1);
		System.out.println(Arrays.toString(v));
	}

	private static void quicksort(int[] v, int esq, int dir) {
		if(esq < dir) {		
			int j = separar(v, esq, dir);
			quicksort(v, esq, j-1);
			quicksort(v, j+1, dir);
		}
	}

	private static int separar(int[] v, int esq, int dir) {
		int i = esq, j = dir;
		
		while(i < j){
			while(i < dir && v[i] <= v[esq]) i++;
			while(j > esq && v[j] >= v[esq]) j--;
			if(i < j) {
				trocar(v, i, j);
				i++;
				j++;
			}
		}
		trocar (v, esq, dir);
		return j;
	}

	private static void trocar(int[] v, int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}

	
}
