public class Deporte {
    private String nombre;
    private String descripcion;
    private String PelotaSiNo;
    private int largo;
    private int ancho;

    public Deporte(String nombre, String descripcion, String pelotaSiNo, int largo, int ancho) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        PelotaSiNo = pelotaSiNo;
        this.largo = largo;
        this.ancho = ancho;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPelotaSiNo() {
        return PelotaSiNo;
    }

    public void setPelotaSiNo(String pelotaSiNo) {
        PelotaSiNo = pelotaSiNo;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
}
