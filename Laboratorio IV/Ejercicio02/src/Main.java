public class Main {
    public static void main(String[] args) {
        Vehiculo carro = new Carro("Toyota", "Corolla", 4);
        Vehiculo moto = new Moto("Yamaha", "MT-07", 689);

        System.out.println("--- Datos del Carro ---");
        carro.mostrarDatos();

        System.out.println("\n--- Datos de la Moto ---");
        moto.mostrarDatos();
    }
}