import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();

            // Validar que la edad sea positiva
            if (edad < 0) {
                System.out.println("Error: La edad no puede ser un número negativo.");
            } else {
                System.out.println("Edad ingresada correctamente: " + edad + " años.");
            }

        } catch (InputMismatchException e) {
            System.out.println("Error: Debe ingresar un número entero válido.");
        } finally {
            scanner.close();
        }
    }
}
