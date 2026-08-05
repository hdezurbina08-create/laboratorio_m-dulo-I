public class PagoEfectivo extends Pago {
    public PagoEfectivo(double monto) {
        super(monto);
    }

    @Override
    public void procesarPago() {
        System.out.println("Procesando pago en Efectivo por un monto de: $" + getMonto());
    }
}