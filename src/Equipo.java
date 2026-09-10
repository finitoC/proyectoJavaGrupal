import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.Scanner;

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
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el deporte:");
        String nombreDeporte = scanner.nextLine();

        // Esto depende de cómo esté hecha tu clase Deporte
        Deporte deporte = new Deporte(nombreDeporte);

        System.out.println("Ingrese el nombre del entrenador:");
        String nombreEntrenador = scanner.nextLine();

        System.out.println("Ingrese el DNI del entrenador:");
        int dni = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese la fecha de nacimiento (AAAA-MM-DD):");
        String fechaTexto = scanner.nextLine();

        LocalDate fechaNacimiento = LocalDate.parse(fechaTexto);

        Entrenador entrenador =
                new Entrenador(nombreEntrenador, fechaNacimiento, dni);

        System.out.println("Ingrese el deporte del jugador:");
        String deporteJugador = scanner.nextLine();

        System.out.println("Ingrese numero de camiseta:");
        int camiseta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Ingrese categoria:");
        String categoriaTexto = scanner.nextLine();

        Categoria categoria = Categoria.valueOf(categoriaTexto.toUpperCase());

        Jugador jugador =
                new Jugador(deporteJugador, camiseta, categoria);

        Equipo equipo =
                new Equipo(nombre, deporte, entrenador, jugador);

        equipos.add(equipo);

        System.out.println("Equipo cargado correctamente.");
    }
