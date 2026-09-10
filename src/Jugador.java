import java.util.ArrayList;

public class Jugador {
    private Deporte deporte;
    private Categoria categoria;
    private int  NroCamiseta;
    private String nombre;

    


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

    public Deporte getDeporte() {
        return deporte;
    }

    public Jugador(Deporte deporte, Categoria categoria, int nroCamiseta, String nombre) {
        this.deporte = deporte;
        this.categoria = categoria;
        NroCamiseta = nroCamiseta;
        this.nombre = nombre;
    }


    public void Entrenar(){
        System.out.println("El jugador"+nombre+" esta entrenando \n");
    }


    public void JugarPartido(){
        System.out.println("El jugador"+nombre+" esta jugando un partido \n");
    }


    public void descansar(){
        System.out.println("El jugador"+nombre+" esta descansando\n");
    }

    public void PracticaFisica(){
        System.out.println("El jugador"+nombre+" esta Entrenando en el gimnasio\n");
    }






}
