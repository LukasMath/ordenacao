import java.util.Arrays;

public class mergeSort {

	public static void main(String[] args) {

		int[] v = { 11, 33, 54, 66, 4, 5, 66, 75, 88 };
		int[] w = new int[v.length];

		mergeSort(v, w, 0, v.length - 1);
		System.out.println(Arrays.toString(v));
	}

	private static void mergeSort(int[] v, int[] w, int ini, int fim) {
		if (ini < fim) {
			int meio = (ini + fim) / 2;
			mergeSort(v, w, ini, meio);
			mergeSort(v, w, meio + 1, fim);
			intercalar(v, w, ini, meio, fim);
		}

	}

	private static void intercalar(int[] v, int[] w, int ini, int meio, int fim) {
		for (int k = ini; k <= fim; k++)
			w[k] = v[k];

		int i = ini;
		int j = meio + 1;

		for (int k = ini; k <= fim; k++) {
			if (i > meio)
				v[k] = w[j++];
			else if (j > fim)
				v[k] = w[i++];
			else if (w[i] < w[j])
				v[k] = w[i++];
			else
				v[k] = w[j++];
		}
	}
}
