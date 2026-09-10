import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class Equipo {

    private String nombre;
    private Deporte deporte;
    private Entrenador entrenador;
    private ArrayList<Jugador> jugadores;


    // CONSTRUCTOR
    public Equipo(String nombre, Deporte deporte) {
        this.nombre = nombre;
        this.deporte = deporte;
        this.jugadores = new ArrayList<>();
    }


    // GETTERS
    public String getNombre() {
        return nombre;
    }

    public Deporte getDeporte() {
        return deporte;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }


    // AGREGAR ENTRENADOR
    public void agregarEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }


    // AGREGAR JUGADOR
    public void agregarJugador(Jugador jugador) {
        jugadores.add(jugador);
    }


    // CARGAR EQUIPO
    public static void cargarEquipo(ArrayList<Equipo> equipos, Scanner scanner) {

        System.out.println("Ingrese el nombre del equipo:");
        String nombreEquipo = scanner.nextLine();

        // DEPORTE
        System.out.println("Ingrese el nombre del deporte:");
        String nombreDeporte = scanner.nextLine();

        System.out.println("Ingrese una descripcion:");
        String descripcion = scanner.nextLine();

        System.out.println("¿Usa pelota? Si/No:");
        String pelotaSiNo = scanner.nextLine();

        System.out.println("Ingrese el largo de la cancha:");
        int largo = scanner.nextInt();

        System.out.println("Ingrese el ancho de la cancha:");
        int ancho = scanner.nextInt();
        scanner.nextLine();

        Deporte deporte = new Deporte(
                nombreDeporte,
                descripcion,
                pelotaSiNo,
                largo,
                ancho
        );

        // CREAR EQUIPO
        Equipo equipo = new Equipo(
                nombreEquipo,
                deporte
        );

        // GUARDARLO
        equipos.add(equipo);

        System.out.println("Equipo cargado correctamente.");
    }


    // CARGAR ENTRENADOR EN UN EQUIPO EXISTENTE
    public static void cargarEntrenador(ArrayList<Equipo> equipos, Scanner scanner) {

        System.out.println("Ingrese el nombre del equipo:");
        String nombreEquipo = scanner.nextLine();

        for (Equipo equipo : equipos) {

            if (equipo.getNombre().equalsIgnoreCase(nombreEquipo)) {

                System.out.println("Nombre del entrenador:");
                String nombre = scanner.nextLine();

                System.out.println("DNI:");
                int dni = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Fecha de nacimiento (AAAA-MM-DD):");
                LocalDate fecha = LocalDate.parse(scanner.nextLine());

                Entrenador entrenador = new Entrenador(
                        nombre,
                        fecha,
                        dni
                );

                equipo.agregarEntrenador(entrenador);

                System.out.println("Entrenador agregado correctamente.");
                return;
            }
        }

        System.out.println("No se encontro el equipo.");
    }
}