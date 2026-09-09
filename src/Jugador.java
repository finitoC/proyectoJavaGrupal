public class Jugador {
    private String Deporte;
    private int  NroCamiseta;
    private Categoria categoria;

    public String getDeporte() {
        return Deporte;
    }

    public void setDeporte(String deporte) {
        Deporte = deporte;
    }

    public int getNroCamiseta() {
        return NroCamiseta;
    }

    public void setNroCamiseta(int nroCamiseta) {
        NroCamiseta = nroCamiseta;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public Jugador(String deporte, int nroCamiseta, Categoria categoria) {
        Deporte = deporte;
        NroCamiseta = nroCamiseta;
        this.categoria = categoria;
    }

    @Override
    public boolean equals(Object obj) {
        Jugador aux = (Jugador) obj;

        return this.Deporte.equals(aux.Deporte);
    }
}
