import java.util.Scanner;

public class pregunta6 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		int n, aux, aux2, z = 1, a = 1, e = 2, i = 3, o = 4;

		System.out.print("Ingrese la cantidad de números que va a ingresar  : ");
		n = reader.nextInt();

		System.out.print("Ingrese los números  : ");
		int lista[] = new int[n];

		for (int x = 0; x < n; x++) {
			lista[x] = reader.nextInt();
		}

		for (int k = 0; k < lista.length - 4; k++) {

			aux = lista[k] * lista[k + 1] * lista[k + 2] * lista[k + 3];
			aux2 = lista[k + 1] * lista[k + 2] * lista[k + 3] * lista[k + 4];

			if (aux2 > aux) {
				z = aux2;
				a = lista[k + 1];
				e = lista[k + 2];
				i = lista[k + 3];
				o = lista[k + 4];

			} else {
				z = aux;
			}

		}
		System.out.println("El producto máximo es igual a :" + z);
		System.out.println("Los números son :{" + a + "," + e + "," + i + "," + o + "}");
	}

}
