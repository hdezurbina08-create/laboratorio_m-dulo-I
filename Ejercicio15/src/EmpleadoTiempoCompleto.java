public class EmpleadoTiempoCompleto extends Empleado {
    private double bono;
   
    public EmpleadoTiempoCompleto(String nombre, double salarioBase, double bono) {
        super(nombre, salarioBase);
        if (bono < 0) {
            throw new IllegalArgumentException("El bono no puede ser negativo.");
        }
        this.bono = bono;
    }

    @Override
    public double calcularPago() {
        return getSalarioBase() + bono;
    }
}
