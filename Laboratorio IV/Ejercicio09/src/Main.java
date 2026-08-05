import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        double n1 = scanner.nextDouble();

        System.out.print("Ingrese el segundo número: ");
        double n2 = scanner.nextDouble();

        System.out.print("Ingrese el tercer número: ");
        double n3 = scanner.nextDouble();

        double mayor = n1;

        if (n2 > mayor) {
            mayor = n2;
        }
        if (n3 > mayor) {
            mayor = n3;
        }

        System.out.println("El número mayor ingresado es: " + mayor);

        scanner.close();
    }
}
