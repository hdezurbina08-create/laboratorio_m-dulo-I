import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la edad: ");
        int edad = scanner.nextInt();

        if (edad < 0) {
            System.out.println("Edad no válida.");
        } else if (edad <= 11) {
            System.out.println("Clasificación: Niño");
        } else if (edad <= 17) {
            System.out.println("Clasificación: Adolescente");
        } else {
            System.out.println("Clasificación: Adulto");
        }

        scanner.close();
    }
}