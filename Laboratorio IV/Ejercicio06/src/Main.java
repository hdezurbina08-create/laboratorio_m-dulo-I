import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el primer número (dividendo): ");
            double num1 = scanner.nextDouble();

            System.out.print("Ingrese el segundo número (divisor): ");
            double num2 = scanner.nextDouble();

            if (num2 == 0) {
                System.out.println("Error: No se puede dividir entre cero.");
            } else {
                double resultado = num1 / num2;
                System.out.println("El resultado de la división es: " + resultado);
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar valores numéricos válidos.");
        } finally {
            scanner.close();
        }
    }
}
