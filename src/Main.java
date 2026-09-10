void main() {
    Mamifero perro = new Mamifero( "TomasBarrosMorales", "Perro", true, true, true, TipoPelaje.CORTO );
    Reptil serpiente = new Reptil("Kaa", "Serpiente", true, true, true, true, false);
    Ave aguila = new Ave("Hera", "Águila", true, true, true, EstadoPlumaje.BUENO, CapacidadVuelo.ALTA);
    Animal animalesArray[] = new Animal[3];
    animalesArray[0] = perro;
    animalesArray[1] = serpiente;
    animalesArray[2] = aguila;
    int cantAnimales = 3;
    Cuidador cuidador1 = new Cuidador( "Carlos", 12345678,  500000, Especialidad.MAMIFERO );
    Cuidador cuidador2 = new Cuidador( "Laura", 23456789,  500000, Especialidad.REPTIL );
    Cuidador cuidador3 = new Cuidador( "Pedro", 34567890,  500000, Especialidad.AVE );
    Cuidador cuidadoresArray[] = new Cuidador[3];
    cuidadoresArray[0] = cuidador1;
    cuidadoresArray[1] = cuidador2;
    cuidadoresArray[2] = cuidador3;
    int cantCuidadores = 0;
    int opcion = 1;
    Scanner scanner = new Scanner(System.in);
    ArrayList<Equipo> equipos = new ArrayList<>();



  do{
      System.out.println("¿A que sistema desea ingresar?");
      System.out.println("1-Sistema zoologico");
      System.out.println("2-Club Deportivo");
      opcion = scanner.nextInt();
      switch (opcion){
          case 1:
              do {
                  System.out.println("\n===== SISTEMA DEL ZOOLÓGICO =====");
                  System.out.println("1. Gestionar animales");
                  System.out.println("2. Gestionar cuidadores");
                  System.out.println("3. Probar especialidades");
                  System.out.println("4. Probar comportamientos");
                  System.out.println("0. Salir");
                  System.out.print("Elegí una opción: ");
                  opcion = scanner.nextInt();
                  switch (opcion) {
                      case 1:
                          int opcionAnimal;
                          do { System.out.println("\n===== ANIMALES =====");
                              System.out.println("1. Ver animales");
                              System.out.println("2. Alimentar al león");
                              System.out.println("3. Enfermar al león");
                              System.out.println("4. Ensuciar al águila");
                              System.out.println("0. Volver");
                              System.out.print("Elegí una opción: ");
                              opcionAnimal = scanner.nextInt();
                              switch (opcionAnimal) {
                                  case 1: for (int cont = 0; cont < animalesArray.length; cont++){
                                      System.out.println(animalesArray[cont]);
                                  }
                                      break;
                                  case 2:
                                      cuidador1.alimentar(perro);
                                      break;
                                  case 3:
                                      perro.enfermarse();
                                      break;
                                  case 4:
                                      aguila.ensuciarse();
                                      break;
                                  case 0:
                                      System.out.println("Volviendo...");
                                      break;
                                  default: System.out.println("Opción inválida.");
                              }
                          } while (opcionAnimal != 0);
                          break;

                      case 2:
                          int opcionCuidador;
                          do {
                              System.out.println("\n===== CUIDADORES =====");
                              for (int cont2 = 0; cont2 < cuidadoresArray.length; cont2++) {
                                  System.out.println( (cont2 + 1) + ". " + cuidadoresArray[cont2].getNombre() + " - Legajo: " + cuidadoresArray[cont2].getLegajo() + " - Salario: $" + cuidadoresArray[cont2].getSalario() + " - Especialidad: " + cuidadoresArray[cont2].getEspecialidad() );
                              }
                              System.out.println("0. Volver");
                              System.out.print("Elegí un cuidador: ");
                              opcionCuidador = scanner.nextInt();
                              if (opcionCuidador >= 1 && opcionCuidador <= cuidadoresArray.length) {
                                  Cuidador cuidadorSeleccionado = cuidadoresArray[opcionCuidador - 1];
                                  int opcionModificar;
                                  do {
                                      System.out.println( "\n===== " + cuidadorSeleccionado.getNombre() + " =====" );
                                      System.out.println("Legajo: " + cuidadorSeleccionado.getLegajo());
                                      System.out.println("Salario: $" + cuidadorSeleccionado.getSalario());
                                      System.out.println("Especialidad: " + cuidadorSeleccionado.getEspecialidad());
                                      System.out.println("\n1. Cambiar nombre");
                                      System.out.println("2. Cambiar DNI");
                                      System.out.println("3. Cambiar legajo");
                                      System.out.println("4. Cambiar salario");
                                      System.out.println("5. Cambiar especialidad");
                                      System.out.println("6. Aumentar salario");
                                      System.out.println("0. Volver");
                                      System.out.print("Elegí una opción: ");
                                      opcionModificar = scanner.nextInt();
                                      switch (opcionModificar) {
                                          case 1: System.out.print("Nuevo nombre: ");
                                              scanner.nextLine();
                                              String nuevoNombre = scanner.nextLine();
                                              cuidadorSeleccionado.setNombre(nuevoNombre);
                                              break;
                                          case 2: System.out.print("Nuevo DNI: ");
                                              int nuevoDni = scanner.nextInt();
                                              cuidadorSeleccionado.setDni(nuevoDni);
                                              break;
                                          case 3: System.out.print("Nuevo legajo: ");
                                              int nuevoLegajo = scanner.nextInt();
                                              cuidadorSeleccionado.setLegajo(nuevoLegajo);
                                              break;
                                          case 4: System.out.print("Nuevo salario: $");
                                              double nuevoSalario = scanner.nextDouble();
                                              if (nuevoSalario >= 0) {
                                                  cuidadorSeleccionado.setSalario(nuevoSalario);
                                              } else {
                                                  System.out.println( "El salario no puede ser negativo." );
                                              } break;
                                          case 5:
                                              System.out.println("\nEspecialidades:");
                                              System.out.println("1. MAMIFERO");
                                              System.out.println("2. REPTIL");
                                              System.out.println("3. AVE");
                                              System.out.print( "Elegí una especialidad: " );
                                              int especialidad = scanner.nextInt();
                                              if (especialidad == 1) {
                                                  cuidadorSeleccionado.setEspecialidad(Especialidad.MAMIFERO);
                                              } else if (especialidad == 2) {
                                                  cuidadorSeleccionado.setEspecialidad(Especialidad.REPTIL);
                                              } else if (especialidad == 3) {
                                                  cuidadorSeleccionado.setEspecialidad(Especialidad.AVE);
                                              } else {
                                                  System.out.println( "Especialidad inválida." );
                                              }
                                              break;
                                          case 6:
                                              System.out.print( "Porcentaje de aumento: " );
                                              double porcentaje = scanner.nextDouble();
                                              cuidadorSeleccionado.aumentarSalario(porcentaje);
                                              break;
                                          case 0:
                                              System.out.println("Volviendo...");
                                              break;
                                          default: System.out.println( "Opción inválida." );
                                      }
                                  } while (opcionModificar != 0);
                              } else if (opcionCuidador != 0) {
                                  System.out.println("Cuidador inválido.");
                              }
                          } while (opcionCuidador != 0); break;
                      case 3:
                          System.out.println("\n===== PRUEBA DE ESPECIALIDADES =====");
                          System.out.println( "Cuidador de mamíferos intenta limpiar al león:" );
                          cuidadoresArray[0].limpiar(animalesArray[0]);
                          System.out.println( "\nCuidador de mamíferos intenta limpiar a la serpiente:" );
                          cuidadoresArray[0].limpiar(animalesArray[1]);
                          System.out.println( "\nCuidador de reptiles limpia a la serpiente:" );
                          cuidadoresArray[1].limpiar(animalesArray[1]);
                          System.out.println( "Cuidador de aves limpia al águila:");
                          cuidadoresArray[2].limpiar(animalesArray[2]);
                          break;

                      case 0:
                          System.out.println("Saliendo del sistema...");
                          break;
                      default: System.out.println("Opción inválida.");
                  }
              } while (opcion != 0);
           break;

           case 2:
               System.out.println("-----SISTEMA DE GESTION CLUB DEPORTIVO-----");
               System.out.println("Agregar un equipo__1");
               System.out.println("Agregar un jugador a un equipo ya creado__2");
               System.out.println("agregar un entrenador a un equipo ya creado__3");
               System.out.println("--------------------------------------------");
               System.out.println("su opcion: "); opcion = scanner.nextInt();
               scanner.nextLine();
               do{
                   switch (opcion){
                       case 1:
                          Equipo.cargarEquipo(equipos,scanner);
                                  ///(equipos,scanner);
                           break;
                       case 2:

                           Equipo.cargarJugador(equipos,scanner);

                           break;
                       case 3:
                           Equipo.cargarEntrenador(equipos, scanner);
                           break;
                   }
               }while (opcion != 0);
               break;
      }


  }while (opcion != 0);
}