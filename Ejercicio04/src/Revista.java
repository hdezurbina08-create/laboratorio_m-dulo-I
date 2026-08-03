public class Revista extends Material {
    private int numeroEdicion;

    public Revista(String titulo, String autor, int numeroEdicion) {
        super(autor, autor);
        this.numeroEdicion = numeroEdicion;
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Número de Edición: #" + numeroEdicion);
    }
}