public class Main {
    public static void main(String[] args) {
        Producto p1 = new ProductoFisico("Teclado Mecánico", 75.0, 1.2);
        Producto p2 = new ProductoDigital("Licencia Antivirus", 29.99, 150.0);

        System.out.println("--- DETALLES DEL PRODUCTO 1 ---");
        p1.mostrarDetalles();

        System.out.println("\n--- DETALLES DEL PRODUCTO 2 ---");
        p2.mostrarDetalles();
    }
}
