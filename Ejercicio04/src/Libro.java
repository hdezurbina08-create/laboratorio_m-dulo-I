public class Libro extends Material {
    private int numeroPaginas;

    public Libro(String titulo, String autor, int numeroPaginas) {
        super(autor, autor);
        this.numeroPaginas = numeroPaginas;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Páginas: " + numeroPaginas);
    }
}