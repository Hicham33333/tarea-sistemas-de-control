package sistemasDeControl;

import java.util.Scanner;

public class calcular_areas {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Ingrese el lado 1 del triángulo:");
	        int lado1 = scanner.nextInt();

	        System.out.println("Ingrese el lado 2 del triángulo:");
	        int lado2 = scanner.nextInt();

	        double area = calcularArea(lado1, lado2);

	        System.out.println("El área del triángulo es: " + area);

	        scanner.close();
	    }

	    public static double calcularArea(int lado1, int lado2) {
	        return (double) (lado1 * lado2) / 2;
	    }
}
