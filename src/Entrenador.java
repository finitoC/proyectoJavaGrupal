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

    public void CambioDePLantilla(){
        System.out.println("El Entrenador"+Nombre+"cambio la plantilla \n");
    }

    public void  Entrenamiento(){
        System.out.println("El Entrenador"+Nombre+"puso a los jugadores a hacer burpees \n");
    }

    public void tacticasDefesiva(){
        System.out.println("El Entrenador"+Nombre+"cambio la tactica a una defensiva \n");
    }


    public void tacticasAtaque (){
        System.out.println("El Entrenador"+Nombre+"cambio la tactica a una priorizando el ataque  \n");
    }

    public void tacticasHARAMBALL(){
        System.out.println("El Entrenador"+Nombre+"cambio la tactica a la HARAMBALL \n");
    }
}
