import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Por favor, ingrese un número entero: ");
            int numero = scanner.nextInt();
            System.out.println("¡Número ingresado con éxito!: " + numero);

        } catch (InputMismatchException e) {
            System.out.println("Error: El dato ingresado contiene texto o caracteres no válidos. Debe ser un número entero.");
        } finally {
            scanner.close();
        }
    }
}
