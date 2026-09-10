import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;

public class Equipo {

    private String nombre;
    private Deporte deporte;
    private Entrenador entrenador;
    private ArrayList<Jugador> jugadores;

    public Equipo(String nombre, Deporte deporte, Entrenador entrenador) {
        this.nombre = nombre;
        this.deporte = deporte;
        this.entrenador = entrenador;
        this.jugadores = new ArrayList<>();
    }
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

        // ENTRENADOR
        System.out.println("Ingrese el nombre del entrenador:");
        String nombreEntrenador = scanner.nextLine();

        System.out.println("Ingrese el DNI:");
        int dni = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese fecha de nacimiento AAAA-MM-DD:");
        String fecha = scanner.nextLine();

        LocalDate fechaNacimiento = LocalDate.parse(fecha);

        Entrenador entrenador = new Entrenador(
                nombreEntrenador,
                fechaNacimiento,
                dni
        );

        // JUGADOR
        System.out.println("Ingrese el deporte del jugador:");
        String deporteJugador = scanner.nextLine();

        System.out.println("Ingrese numero de camiseta:");
        int camiseta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese categoria:");
        System.out.println("INFANTILES - JUVENILES - ADULTOS - VITALICIOS");
        String categoriaTexto = scanner.nextLine();

        Categoria categoria =
                Categoria.valueOf(categoriaTexto.toUpperCase());

        Jugador jugador = new Jugador(
                deporteJugador,
                camiseta,
                categoria
        );

        // CREAR EQUIPO
        Equipo equipo = new Equipo(
                nombreEquipo,
                deporte,
                entrenador
        );

        equipo.jugadores.add(jugador);

        equipos.add(equipo);

        System.out.println("Equipo cargado correctamente.");
    }
}