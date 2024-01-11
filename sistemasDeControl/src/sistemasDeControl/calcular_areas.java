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

		System.out.println("Ingrese el radio de la base del cilindro:");
		double radio = scanner.nextDouble();

		System.out.println("Ingrese la altura del cilindro:");
		double altura = scanner.nextDouble();

		double area2 = calcularAreaCilindro(radio, altura);

		System.out.println("El área del cilindro es: " + area2);

		System.out.println("Ingrese la longitud de un lado del cubo:");
		double lado = scanner.nextDouble();

		double volumen = calcularVolumenCubo(lado);

		System.out.println("El volumen del cubo es: " + volumen);
		
		
    	
    	System.out.println("Introduce el radio de la cricunferencia: ");
    	radio = scanner.nextDouble();
    	
    	System.out.println("El área de la circunferenia es: " + CalcularAreaCircunferencia (radio));
    	
    	System.out.println("Introduce el radio de la cricunferencia: ");
    	radio = scanner.nextDouble();
    	System.out.println("El área de la circunferenia es: " + CalcularPerimetroCircunferencia(radio));
    	

	}

	public static double calcularArea(int lado1, int lado2) {
		return (double) (lado1 * lado2) / 2;
	}

	public static double calcularAreaCilindro(double radio, double altura) {

		double areaBases = 2 * Math.PI * Math.pow(radio, 2);

		double areaLateral = 2 * Math.PI * radio * altura;

		return areaBases + areaLateral;
	}

	public static double calcularVolumenCubo(double lado) {

		return Math.pow(lado, 3);
	}
	public static double CalcularAreaCircunferencia (double radio) {
		
    	double area = 3.14 * radio * radio;
    	 
		return area;
	}
	public static double CalcularPerimetroCircunferencia(double radio) {
		
    	double area = 2 * 3.14 * radio;
    	
		return area;
	}
}
