import java.util.Scanner;

public class pregunta5 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		String palabra;
		System.out.print("Ingrese una palabra : ");
		palabra = reader.next();

		char arraydechar[] = palabra.toCharArray();
		char b[] = new char[palabra.length()];
		int j = 0;
		String c;

		for (int i = (palabra.length() - 1); i >= 0; i--) {

			b[j] = arraydechar[i];
			j++;
		}

		c = String.valueOf(b);

		if (c.compareToIgnoreCase(palabra) == 0) {

			System.out.println("Es palíndromo");

		} else {
			System.out.println("No es palíndromo");
		}
	}

}
