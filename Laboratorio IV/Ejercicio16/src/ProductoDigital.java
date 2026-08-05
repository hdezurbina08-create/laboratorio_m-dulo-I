public class ProductoDigital extends Producto {
    private double tamanoMB;

    public ProductoDigital(String nombre, double precio, double tamanoMB) {
        super(nombre, precio);
        this.tamanoMB = tamanoMB;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tipo: Digital | Tamaño de Descarga: " + tamanoMB + " MB");
    }
}