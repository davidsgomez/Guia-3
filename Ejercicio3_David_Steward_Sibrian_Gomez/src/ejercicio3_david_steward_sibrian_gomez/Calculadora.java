package ejercicio3_david_steward_sibrian_gomez;

/**
 *
 * @author david
 */

import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("Seleccione una operacion:");
            System.out.println("1- Suma");
            System.out.println("2- Resta");
            System.out.println("3- Multiplicacion");
            System.out.println("4- Division");
            System.out.println("5- Salir");

            System.out.print("Escribir el numero de la operacion: ");
            int opcion = scanner.nextInt();

            if (opcion == 5) {
                System.out.println("Saliendo de la calculadora.");
                break;
            }

            System.out.print("Ingresar el primer numero: ");
            double num1 = scanner.nextDouble();

            System.out.print("Ingresar el segundo numero: ");
            double num2 = scanner.nextDouble();

            switch (opcion) {
                case 1:
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("No se puede dividir entre cero. Por favor, ingrese un divisor distinto de cero.");
                    }
                    break;
                default:
                    System.out.println("Opcion no valida. Por favor, ingrese un numero del 1 al 5.");
            }
        }

        scanner.close();
    }
}