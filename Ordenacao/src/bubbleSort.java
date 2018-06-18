import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {

		int[] v = { 55, 41, 87, 74, 54, 25, 38, 45, 22, 98, 47 };
		bolha(v);
		System.out.println(Arrays.toString(v));

	}

	private static void bolha(int[] v) {
		for (int ultima = v.length - 1; ultima > 0; ultima--) {
			for (int i = 0; i < ultima; i++)
				if (v[i] > v[i + 1])
					trocar(v, i, i + 1);

		}
	}

	private static void trocar(int[] v, int i, int j) {
		int aux = v[i];
		v[i] = v[j];
		v[j] = aux;
	}

}
