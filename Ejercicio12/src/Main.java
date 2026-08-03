import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== MENÚ DE OPCIONES ===");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.print("Seleccione una opción (1 o 2): ");
        int opcion = scanner.nextInt();

        if (opcion == 1 || opcion == 2) {
            System.out.print("Ingrese el primer número: ");
            double num1 = scanner.nextDouble();

            System.out.print("Ingrese el segundo número: ");
            double num2 = scanner.nextDouble();

            switch (opcion) {
                case 1:
                    System.out.println("Resultado de la Suma: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado de la Resta: " + (num1 - num2));
                    break;
            }
        } else {
            System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}
