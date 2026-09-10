import java.util.Scanner;
import java.time.LocalDate;

public class Equipo {

    private String nombre;
    private Deporte deporte;
    private Entrenador entrenador;
    private Jugador[] jugadores;
    private int validosJugadores;



    public Equipo(String nombre, Deporte deporte) {
        this.nombre = nombre;
        this.deporte = deporte;
        this.jugadores = new Jugador[20];
        this.validosJugadores = 0;
    }


    public String getNombre() {
        return nombre;
    }

    public Deporte getDeporte() {
        return deporte;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }


    public void agregarEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }


    public static int cargarEquipo(Equipo[] equipos, int validos, Scanner scanner) {

        if (validos >= equipos.length) {
            System.out.println("No hay espacio para mas equipos.");
            return validos;
        }

        System.out.println("Ingrese el nombre del equipo:");
        String nombreEquipo = scanner.nextLine();

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

        Equipo equipo = new Equipo(
                nombreEquipo,
                deporte
        );

        equipos[validos] = equipo;
        validos++;

        System.out.println("Equipo cargado correctamente.");

        return validos;
    }


    public static void cargarEntrenador(Equipo[] equipos, int validos, Scanner scanner) {

        System.out.println("Ingrese el nombre del equipo:");
        String nombreEquipo = scanner.nextLine();

        for (int i = 0; i < validos; i++) {

            if (equipos[i].getNombre().equalsIgnoreCase(nombreEquipo)) {

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

                equipos[i].agregarEntrenador(entrenador);

                System.out.println("Entrenador agregado correctamente.");
                return;
            }
        }

        System.out.println("No se encontro el equipo.");
    }


    public boolean agregarJugador(Jugador agregado) {

        if (this.deporte.getNombre().equals(
                agregado.getDeporte().getNombre())) {

            if (validosJugadores < jugadores.length) {

                jugadores[validosJugadores] = agregado;
                validosJugadores++;

                return true;
            }
        }

        return false;
    }


    public static void cargarJugador(Equipo[] equipos, int validosEquipos, Scanner scanner) {

        System.out.println("Ingrese el nombre del equipo:");
        String nombreEquipo = scanner.nextLine();

        for (int i = 0; i < validosEquipos; i++) {

            if (equipos[i].getNombre().equalsIgnoreCase(nombreEquipo)) {

                System.out.println("Nr de camiseta del jugador:");
                int camiseta = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Que nombre tiene este jugador:");
                String nombreJugador = scanner.nextLine();


                int opcionCategoria;

                do {
                    System.out.println("De que categoria es?");
                    System.out.println("1 - INFANTILES");
                    System.out.println("2 - JUVENILES");
                    System.out.println("3 - ADULTOS");
                    System.out.println("4 - VITALICIOS");

                    opcionCategoria = scanner.nextInt();
                    scanner.nextLine();

                } while (opcionCategoria < 1 || opcionCategoria > 4);


                Categoria categoria;

                switch (opcionCategoria) {

                    case 1:
                        categoria = Categoria.INFANTILES;
                        break;

                    case 2:
                        categoria = Categoria.JUVENILES;
                        break;

                    case 3:
                        categoria = Categoria.ADULTOS;
                        break;

                    default:
                        categoria = Categoria.VITALICIOS;
                        break;
                }


                Jugador jugador = new Jugador(
                        equipos[i].getDeporte(),
                        categoria,
                        camiseta,
                        nombreJugador
                );


                if (equipos[i].agregarJugador(jugador)) {

                    System.out.println("Jugador agregado correctamente.");

                } else {

                    System.out.println(
                            "El jugador no se pudo agregar."
                    );
                }

                return;
            }
        }

        System.out.println("No se encontro el equipo.");
    }
}