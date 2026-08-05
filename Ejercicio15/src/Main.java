public class Main {
    public static void main(String[] args) {
        try {
            Empleado emp1 = new EmpleadoTiempoCompleto("Carlos Gómez", 1200.0, 150.0);
            Empleado emp2 = new EmpleadoPorHoras("Ana Martínez", 40, 15.0);

            System.out.println("Pago total de " + emp1.getNombre() + ": $" + emp1.calcularPago());
            System.out.println("Pago total de " + emp2.getNombre() + ": $" + emp2.calcularPago());
        } catch (IllegalArgumentException e) {
            System.out.println("Error en datos de entrada: " + e.getMessage());
        }
    }
}