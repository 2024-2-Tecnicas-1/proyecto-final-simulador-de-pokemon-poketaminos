package simulador;

import simulador.pokemon.*;
import simulador.entrenador.Entrenador;
import simulador.batalla.Batalla;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {
    private static List<Entrenador> entrenadores = new ArrayList<>();
    private static List<Pokemon> pokemones = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        pokemones.add(new Charmander());
        pokemones.add(new Squirtle());
        pokemones.add(new Bulbasaur());
        pokemones.add(new Pikachu());
        pokemones.add(new Abra());
        pokemones.add(new Geodude());
        pokemones.add(new Pidgey());
        pokemones.add(new Jiggypluff());
        pokemones.add(new Machop());
        pokemones.add(new Grimer());

        int opcion;
        do {
            System.out.println("Menú Principal");
            System.out.println("Simulador de Batallas Pokémon");
            System.out.println("1. Gestionar Entrenadores");
            System.out.println("2. Gestionar Pokémones");
            System.out.println("3. Iniciar Batalla");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();


            switch (opcion) {
                case 1:
                    gestionarEntrenadores();
                    break;
                case 2:
                    gestionarPokemones();
                    break;
                case 3:
                    iniciarBatalla();
                    break;
                case 4:
                    System.out.println("GAME OVER");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 4);
    }

    private static void gestionarEntrenadores() {
        int opcion;
        do {
            System.out.println("Gestionar Entrenadores");
            System.out.println("1. Registrar nuevo entrenador");
            System.out.println("2. Ver lista de entrenadores");
            System.out.println("3. Seleccionar un entrenador");
            System.out.println("4. Volver al menú principal");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    registrarEntrenador();
                    break;
                case 2:
                    verEntrenadores();
                    break;
                case 3:
                    seleccionarEntrenador();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 4);
    }

    private static void registrarEntrenador() {
        System.out.print("Nombre del Entrenador: ");
        String nombre = scanner.nextLine();
        entrenadores.add(new Entrenador(nombre));
        System.out.println("Entrenador " + nombre + " registrado.");
    }

    private static void verEntrenadores() {
        System.out.println("Lista de entrenadores:");
        for (Entrenador entrenador : entrenadores) {
            System.out.println("- " + entrenador.getNombre());
        }
    }

    private static void seleccionarEntrenador() {
        System.out.print("Nombre del Entrenador: ");
        String nombre = scanner.nextLine();
        for (Entrenador entrenador : entrenadores) {
            if (entrenador.getNombre().equalsIgnoreCase(nombre)) {
                gestionarEntrenador(entrenador);
                return;
            }
        }
        System.out.println("Entrenador no encontrado.");
    }

    private static void gestionarEntrenador(Entrenador entrenador) {
        int opcion;
        do {
            System.out.println("Nombre del Entrenador: " + entrenador.getNombre());
            System.out.println("1. Ver equipo de Pokémones");
            System.out.println("2. Agregar Pokémon al equipo");
            System.out.println("3. Entrenar Pokémon");
            System.out.println("4. Volver a Gestionar Entrenadores");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();


            switch (opcion) {
                case 1:
                    entrenador.mostrarPokemones();
                    break;
                case 2:
                    agregarPokemonEntrenador(entrenador);
                    break;
                case 3:
                    entrenarPokemon(entrenador);
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 4);
    }

    private static void agregarPokemonEntrenador(Entrenador entrenador) {
        System.out.println("Elige un Pokémon para agregar al equipo:");
        for (int i = 0; i < pokemones.size(); i++) {
            System.out.println(i + 1 + ". " + pokemones.get(i).getNombre());
        }
        System.out.print("Elige un Pokémon: ");
        int opcionPokemon = scanner.nextInt() - 1;


        if (opcionPokemon >= 0 && opcionPokemon < pokemones.size()) {
            entrenador.agregarPokemon(pokemones.get(opcionPokemon));
        } else {
            System.out.println("Opción no válida.");
        }
    }

    private static void entrenarPokemon(Entrenador entrenador) {
        System.out.println("Elige un Pokémon para entrenar:");
        entrenador.mostrarPokemones();
        System.out.print("Elige un Pokémon por su índice: ");
        int opcionPokemon = scanner.nextInt() - 1;


        if (opcionPokemon >= 0 && opcionPokemon < entrenador.getPokemones().size()) {
            Pokemon pokemon = entrenador.getPokemones().get(opcionPokemon);
            entrenador.entrenarPokemon(pokemon);
        } else {
            System.out.println("Opción no válida.");
        }
    }

    private static void gestionarPokemones() {
        System.out.println("Gestionar Pokémones");
        System.out.println("1. Ver lista de Pokémones disponibles");
        System.out.println("2. Volver al menú principal");
        System.out.print("Elige una opción: ");
        int opcion = scanner.nextInt();


        if (opcion == 1) {
            verPokemones();
        } else {
            System.out.println("Opción no válida.");
        }
    }

    private static void verPokemones() {
        System.out.println("Lista de Pokémones disponibles:");
        for (Pokemon pokemon : pokemones) {
            System.out.println("- " + pokemon.getNombre());
        }
    }

    private static void iniciarBatalla() {
        System.out.println("Iniciar Batalla");
        if (entrenadores.size() < 2) {
            System.out.println("Se necesitan al menos dos entrenadores para iniciar una batalla.");
            return;
        }

        System.out.print("Selecciona el entrenador 1: ");
        String nombreEntrenador1 = scanner.nextLine();
        Entrenador entrenador1 = encontrarEntrenador(nombreEntrenador1);
        if (entrenador1 == null) {
            System.out.println("Entrenador 1 no encontrado.");
            return;
        }

        System.out.print("Selecciona el entrenador 2: ");
        String nombreEntrenador2 = scanner.nextLine();
        Entrenador entrenador2 = encontrarEntrenador(nombreEntrenador2);
        if (entrenador2 == null) {
            System.out.println("Entrenador 2 no encontrado.");
            return;
        }

        System.out.println("Selecciona el Pokémon de " + entrenador1.getNombre() + ":");
        Pokemon pokemon1 = seleccionarPokemon(entrenador1);
        if (pokemon1 == null) return;

        System.out.println("Selecciona el Pokémon de " + entrenador2.getNombre() + ":");
        Pokemon pokemon2 = seleccionarPokemon(entrenador2);
        if (pokemon2 == null) return;

        Batalla batalla = new Batalla();
        batalla.iniciarBatalla(pokemon1, pokemon2);
    }

    private static Entrenador encontrarEntrenador(String nombre) {
        for (Entrenador entrenador : entrenadores) {
            if (entrenador.getNombre().equalsIgnoreCase(nombre)) {
                return entrenador;
            }
        }
        return null;
    }

    private static Pokemon seleccionarPokemon(Entrenador entrenador) {
        entrenador.mostrarPokemones();
        System.out.print("Elige un Pokémon por su posición en la lista ");
        int indice = scanner.nextInt() - 1;

        return entrenador.prepararBatalla(indice);
    }
}
      