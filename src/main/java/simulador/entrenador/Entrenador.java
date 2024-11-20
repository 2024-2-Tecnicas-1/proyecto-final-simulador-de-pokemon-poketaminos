package simulador.entrenador;

import simulador.pokemon.Pokemon;

import java.util.ArrayList;
import java.util.List;

public class Entrenador {
    private String nombre;
    private List<Pokemon> pokemones;

    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.pokemones = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public List<Pokemon> getPokemones() {
        return pokemones;
    }

    public void agregarPokemon(Pokemon pokemon) {
        if (pokemones.size() < 6) {
            pokemones.add(pokemon);
            System.out.println(pokemon.getNombre() + " ha sido añadido al equipo de " + nombre);
        } else {
            System.out.println("El equipo de " + nombre + " ya está completo.");
        }
    }

    public void entrenarPokemon(Pokemon pokemon) {
        if (pokemones.contains(pokemon)) {
            pokemon.entrenar();
        } else {
            System.out.println("El Pokémon no está en el equipo.");
        }
    }

    public void mostrarPokemones() {
        System.out.println("Pokémones de " + nombre + ":");
        for (Pokemon pokemon : pokemones) {
            System.out.println("- " + pokemon.getNombre() + " (Salud: " + pokemon.getSalud() + ", Ataque: " + pokemon.getPuntosDeAtaque() + ")");
        }
    }

    public Pokemon prepararBatalla(int indice) {
        if (indice >= 0 && indice < pokemones.size()) {
            return pokemones.get(indice);
        } else {
            System.out.println("Índice inválido.");
            return null;
        }
    }
}



    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

