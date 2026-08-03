public class Main {
    public static void main(String[] args) {
        Pago pago1 = new PagoTarjeta(150.75, "1234-5678-9012-3456");
        Pago pago2 = new PagoEfectivo(45.50);

        // Polimorfismo en acción
        pago1.procesarPago();
        pago2.procesarPago();
    }
}