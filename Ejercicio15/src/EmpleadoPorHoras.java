public class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double tarifaxHora;

    public EmpleadoPorHoras(String nombre, int horasTrabajadas, double tarifaxHora) {
        super(nombre, 0); // Salario base 0, cobra por horas
        if (horasTrabajadas < 0 || tarifaxHora < 0) {
            throw new IllegalArgumentException("Las horas y la tarifa deben ser mayores o iguales a 0.");
        }
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaxHora = tarifaxHora;
    }

    @Override
    public double calcularPago() {
        return horasTrabajadas * tarifaxHora;
    }
}
