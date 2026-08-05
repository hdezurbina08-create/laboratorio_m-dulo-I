public class ProductoFisico extends Producto {
    private double pesoKg;

    public ProductoFisico(String nombre, double precio, double pesoKg) {
        super(nombre, precio);
        this.pesoKg = pesoKg;
    }

    @Override
    public void mostrarDetalles() {
        super.mostrarDetalles();
        System.out.println("Tipo: Físico | Peso: " + pesoKg + " kg");
    }
}