public abstract class Animal {
    private String nombre;
    private String especie;
    private boolean hambre;
    private boolean salud;
    private boolean higiene;

    public Animal(String nombre, String especie, boolean hambre, boolean salud, boolean higiene) {
        this.nombre = nombre;
        this.especie = especie;
        this.hambre = hambre;
        this.salud = salud;
        this.higiene = higiene;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public boolean getHambre() {
        return hambre;
    }

    public void setHambre(boolean hambre) {
        this.hambre = hambre;
    }

    public boolean getSalud() {
        return salud;
    }

    public void setSalud(boolean salud) {
        this.salud = salud;
    }

    public boolean getHigiene() {
        return higiene;
    }

    public void setHigiene(boolean higiene) {
        this.higiene = higiene;
    }

    public void comer() {

        if (hambre == true) {
            hambre = false;
            System.out.println(nombre + " comió y ya no tiene hambre.");
        } else {
            System.out.println(nombre + " no tiene hambre.");
        }
    }

    public void enfermarse() {

        if (salud == true) {
            salud = false;
            System.out.println(nombre + " se enfermó.");
        } else {
            System.out.println(nombre + " ya está enfermo.");
        }
    }

    public void ensuciarse() {

        if (higiene == true) {
            higiene = false;
            System.out.println(nombre + " se ensució.");
        } else {
            System.out.println(nombre + " ya está sucio.");
        }
    }

    public void recuperarSalud() {

        if (salud == false) {
            salud = true;
            System.out.println(nombre + " recuperó su salud.");
        } else {
            System.out.println(nombre + " ya está saludable.");
        }
    }

    public void limpiar() {

        if (higiene == false) {
            higiene = true;
            System.out.println(nombre + " fue limpiado.");
        } else {
            System.out.println(nombre + " ya está limpio.");
        }
    }
}


