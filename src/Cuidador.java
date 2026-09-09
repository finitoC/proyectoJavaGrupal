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

    public void vacunar(Animal animal) {
        if (puedeCuidar(animal) == true) {
            if (animal.getSalud() == false) {
                animal.recuperarSalud();
            } else {
                System.out.println(animal.getNombre() + " ya está saludable.");
            }
        } else {
            System.out.println(getNombre() + "no puede vacunar a " + animal.getNombre() + " porque no es especialista en ese tipo de animal.");
        }
    }

    public void limpiar(Animal animal) {
        if (puedeCuidar(animal) == true) {
            animal.limpiar();
        } else {
            System.out.println(getNombre() + " no puede limpiar a " + animal.getNombre() + " porque no es especialista en ese tipo de animal.");
        }
    }

    @Override
    public String toString() {
        return "Cuidador: " + getNombre() +
                " - Especialidad: " + especialidad;
    }
}
