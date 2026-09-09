public class Mamifero extends Animal{
    private TipoPelaje tipoPelaje;

    public Mamifero(String nombre, String especie, boolean hambre, boolean salud, boolean higiene, TipoPelaje tipoPelaje) {
        super(nombre, especie, hambre, salud, higiene);
        this.tipoPelaje = tipoPelaje;
    }

    public TipoPelaje getTipoPelaje() {
        return tipoPelaje;
    }

    public void setTipoPelaje(TipoPelaje tipoPelaje) {
        this.tipoPelaje = tipoPelaje;
    }

    public void amamantar() {
        System.out.println(getNombre() + " está amamantando.");
    }

    public void caminar() {
        System.out.println(getNombre() + " está caminand");
    }

    public void correr() {
        System.out.println(getNombre() + " está corriendo.");
    }

    @Override
    public void hacerSonidos() {
        System.out.println(getNombre() + " emite un sonido de mamífero");
    }

    @Override
    public String toString() {
        return "Mamífero: " + getNombre() +
                " - Pelaje: " + tipoPelaje;
    }
}
