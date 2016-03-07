package numero;

import java.util.Scanner;

public class numero {
	public static void main(String[] args) {
		int i = 0;
		int n = 0;
		int num = 0;
		int suma = 0;
		int multipli = 1;
		System.out.println("¿Cuántos números quieres sumar y multiplicar?");
		Scanner leer = new Scanner(System.in);
		n = leer.nextInt();

		System.out.println("Pon qué números son");

		for (i = 1; i <= n; i = i + 1) {
			suma = leer.nextInt();
			num += suma;
			multipli = multipli * suma;
		}
		System.out.println("La suma es " + num);
		System.out.println("La multiplicacion es: " + multipli);
		leer.close();
	}
}
