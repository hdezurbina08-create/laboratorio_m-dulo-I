import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numeros = new double[5];

        System.out.println("--- Ingrese 5 números ---");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextDouble();
        }

        double suma = 0;
        double mayor = numeros[0];
        double menor = numeros[0];

        for (double num : numeros) {
            suma += num;
            if (num > mayor) {
                mayor = num;
            }
            if (num < menor) {
                menor = num;
            }
        }

        double promedio = suma / numeros.length;

        System.out.println("\n--- RESULTADOS ESTADÍSTICOS ---");
        System.out.println("Suma total: " + suma);
        System.out.println("Promedio: " + promedio);
        System.out.println("Número mayor: " + mayor);
        System.out.println("Número menor: " + menor);

        scanner.close();
    }
}