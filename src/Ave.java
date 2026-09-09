public class Ave extends Animal{
    private EstadoPlumaje estadoPlumaje;
    private CapacidadVuelo capacidadDeVuelo;

    //banda de parametros
    public Ave(String nombre, String especie, boolean hambre, boolean salud, boolean higiene, EstadoPlumaje estadoPlumaje, CapacidadVuelo capacidadDeVuelo) {
        super(nombre, especie, hambre, salud, higiene);
        this.estadoPlumaje = estadoPlumaje;
        this.capacidadDeVuelo = capacidadDeVuelo;
    }

    public EstadoPlumaje getEstadoPlumaje() {
        return estadoPlumaje;
    }

    public void setEstadoPlumaje(EstadoPlumaje estadoPlumaje) {
        this.estadoPlumaje = estadoPlumaje;
    }

    public CapacidadVuelo getCapacidadDeVuelo() {
        return capacidadDeVuelo;
    }

    public void setCapacidadDeVuelo(CapacidadVuelo capacidadDeVuelo) {
        this.capacidadDeVuelo = capacidadDeVuelo;
    }

    public void volar() {
        if (capacidadDeVuelo != CapacidadVuelo.NO_VUELA) {
            System.out.println(getNombre() + "está volando.");
        } else {
            System.out.println(getNombre() + "no puede volar.");
        }
    }

    //cuando se limpian las plumas y se sacan algunas creo que era
    public void acicalarse() {
        if (estadoPlumaje == EstadoPlumaje.MALO || estadoPlumaje == EstadoPlumaje.REGULAR) {
            System.out.println(getNombre() + " se está acicalando");
            estadoPlumaje = EstadoPlumaje.BUENO;
        } else {
            System.out.println(getNombre() + "ya tiene en buen estado sus plumas.");
        }
    }

    public void moverAlas() {
        System.out.println(getNombre() + "está moviendo sus alas.");
    }

    @Override
    public void hacerSonidos() {
        System.out.println(getNombre() + "está cantando.");
    }

    @Override
    public String toString() {

        return "Ave: " + getNombre() +
                " - Especie: " + getEspecie() +
                " - Plumaje: " + estadoPlumaje +
                " - Capacidad de vuelo: " + capacidadDeVuelo;
    }
}
