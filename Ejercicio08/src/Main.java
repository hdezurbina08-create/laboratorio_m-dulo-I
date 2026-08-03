import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[5];
        double suma = 0;

        System.out.println("--- Ingrese las 5 notas ---");
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            suma += notas[i];
        }

        double promedio = suma / notas.length;
        System.out.printf("El promedio de las notas es: %.2f\n", promedio);

        scanner.close();
    }
}
