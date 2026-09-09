public abstract class Persona {

    private String nombre;
    private int dni;
    private int legajo;
    private double salario;

    public Persona(String nombre, int dni, int legajo, double salario) {
        this.nombre = nombre;
        this.dni = dni;
        this.legajo = legajo;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getLegajo() {
        return legajo;
    }

    public void setLegajo(int legajo) {
        this.legajo = legajo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


    public abstract void trabajar();

    public void aumentarSalario(double porcentaje) {
        if (porcentaje > 0) {
            salario = salario + salario * porcentaje / 100;
            System.out.println("El salario de " + nombre + " se actualizó correctamente.");
            System.out.println("Nuevo salario:" +salario);
        } else {
            System.out.println("El porcentaje debe ser mayor a 0.");
        }
    }

    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DNI: " + dni);
        System.out.println("Legajo: " + legajo);
        System.out.println("Salario: $" + salario);
    }

    @Override
    public String toString() {
        return "Persona: " + nombre +
                " - Legajo: " + legajo;
    }
}


