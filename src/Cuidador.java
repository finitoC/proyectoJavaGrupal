public class Cuidador extends Persona {
    private Especialidad especialidad;
    public Cuidador(String nombre, int dni, int legajo, double salario, Especialidad especialidad) {
        super(nombre, dni, legajo, salario);
        this.especialidad = especialidad;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    @Override
    public void trabajar() {
        System.out.println(getNombre() + " está trabajando como cuidador.");
    }

    //**Ni idea si esto se puede hacer más simple**//
    private boolean puedeCuidar(Animal animal) {
        if (especialidad == Especialidad.MAMIFERO && animal instanceof Mamifero) {
            return true;
        }
        if (especialidad == Especialidad.REPTIL && animal instanceof Reptil) {
            return true;
        }
        if (especialidad == Especialidad.AVE && animal instanceof Ave) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Cuidador: " + getNombre() +
                " - Especialidad: " + especialidad;
    }

}
