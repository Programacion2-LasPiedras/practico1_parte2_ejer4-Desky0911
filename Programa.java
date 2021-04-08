import java.util.Scanner;

public class Programa {
	
	void iniciar(){
		//escribe aquí tú código
    Scanner entrada = new Scanner(System.in);
		double a, b, c;
		boolean salir = false;
		int opcion;

		System.out.print("Ingrese el valor de a: ");
		a = entrada.nextDouble();
		System.out.print("Ingrese el valor de b: ");
		b = entrada.nextDouble();
		System.out.print("Ingrese el valor de c: ");
		c = entrada.nextDouble();

    while (!salir) {
			System.out.println("Seleccione una opción:" + "\n 1 - Cuadrado y raíz cuadrada" + "\n 2 - bhaskara"
					+ "\n 3 - Mayor" + "\n 4 - Circunferencia" + "\n 0 - Salir");
			opcion = entrada.nextInt();
			switch (opcion) {
			case 1:
				raiz(a);
				raiz(b);
				raiz(c);
				break;
			case 2:
				bhaskara(a, b, c);
				break;
			case 3:
				max(a, b, c);
				break;
			case 4:
				circunferencia(a, "a");
				circunferencia(b, "b");
				circunferencia(c, "c");
				break;
			case 0:
				entrada.close();
				salir = true;
				break;
			}

		}
	}
	//METODOS
	public static void raiz(double a) {
		double raiz = Math.sqrt(a);
		double cuadrado = Math.pow(a, 2);
		System.out.println("La raiz cuadrada de " + a + " es " + raiz + " y el cuadrado es " + cuadrado);
	}

	public static void max(double a, double b, double c) {
		double maxNum = Math.max(Math.max(a, b), Math.max(b, c));
		System.out.println("El numero mayor entre " + a + " , " + b + " y " + c + " es: " + maxNum);
		System.out.println("Entre a: " + a + " y b: " + b + " el mayor es: ");
	}

	public static void circunferencia(double a, String letra) {
		double area = Math.PI * Math.pow(a, 2);
		double longit = 2 * Math.PI * a;
		System.out.println("El area de la circunferencia con radio " + letra + ": " + a + " es: " + area);
		System.out.println("La longitud de la circunferencia con radio " + letra + ": " + a + " es: " + longit + "\n");
	}

	public static void bhaskara(double a, double b, double c) {
		double determinante = Math.pow(b, 2) - (4 * a * c);
		System.out.println("determinante: " + determinante);
		if (determinante <0 );{ 
			System.out.println("No se puede continuar ya que el determinante es 0 o menor");
			
		}
		if (determinante > 0);	{
			double x1 = ((b * (-1)) + Math.sqrt(determinante)) / (2 * a);
			double x2 = ((b * (-1)) - Math.sqrt(determinante)) / (2 * a);
			System.out.println("Las raices son x:" + x1 + " y x:" + x2);
		}
		
	}
	

}
	
