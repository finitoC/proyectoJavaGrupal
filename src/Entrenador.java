import java.time.LocalDate;

public class Entrenador {
    private String Nombre;
    private LocalDate FechaNacimiento;
    private int Dni;

    public Entrenador(String nombre, LocalDate fechaNacimiento, int dni) {
        Nombre = nombre;
        FechaNacimiento = fechaNacimiento;
        Dni = dni;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public LocalDate getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        FechaNacimiento = fechaNacimiento;
    }

    public int getDni() {
        return Dni;
    }

    public void setDni(int dni) {
        Dni = dni;
    }
}
