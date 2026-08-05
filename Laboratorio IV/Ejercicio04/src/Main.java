public class Main {
    public static void main(String[] args) {
        Material libro = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 471);
        Material revista = new Revista("National Geographic", "Varios Autores", 245);

        System.out.println("--- INFORMACIÓN DEL LIBRO ---");
        libro.mostrarInformacion();

        System.out.println("\n--- INFORMACIÓN DE LA REVISTA ---");
        revista.mostrarInformacion();
    }
}