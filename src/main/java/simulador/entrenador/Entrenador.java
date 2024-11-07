package simulador.entrenador;

import simulador.pokemon.Pokemon;
import java.util.ArrayList;
import java.util.List;


public class Entrenador {
   private final String nombre;
    private final List<Pokemon> equipo;

   
    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.equipo = new ArrayList<>(); 
    }

    // Métodos
    public String getNombre() {
        return nombre;
    }

    public void agregarPokemon(Pokemon pokemon) {
        if (equipo.size() < 6) { // Máximo de 6 Pokémon en el equipo
            equipo.add(pokemon);
            System.out.println(nombre + " ha agregado a " + pokemon.getNombre() + " al equipo.");
        } else {
            System.out.println("El equipo ya está completo. No se pueden agregar más Pokémon.");
        }
    }

    public void entrenarPokemon(Pokemon pokemon) {
        if (equipo.contains(pokemon)) {
            pokemon.entrenar();
            System.out.println(pokemon.getNombre() + " ha sido entrenado por " + nombre + ".");
        } else {
            System.out.println("El Pokémon no está en el equipo de " + nombre + ".");
        }
    }

    public void mostrarEquipo() {
        System.out.println("Equipo de " + nombre + ":");
        for (Pokemon pokemon : equipo) {
            System.out.println("- " + pokemon.getNombre() + " (Salud: " + pokemon.getSalud() + ", Ataque: " + pokemon.getPuntosDeAtaque() + ", Tipo: " + pokemon.getTipo() + ")");
        }
    }

    public Pokemon seleccionarPokemon(int indice) {
        if (indice >= 0 && indice < equipo.size()) {
            return equipo.get(indice);
        } else {
            System.out.println("Índice no válido. Selecciona un índice entre 0 y " + (equipo.size() - 1));
            return null;
        }
    }
}
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
