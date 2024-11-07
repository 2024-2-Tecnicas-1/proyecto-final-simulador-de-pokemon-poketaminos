package simulador.batalla;
import simulador.pokemon.Pokemon;
import simulador.pokemon.TipoPokemon;


public class Batalla{
    
    Pokemon Charmander = new Pokemon("Charmander", 39, 52, TipoPokemon.FUEGO) {};
    Pokemon Squirtle = new Pokemon("Squirtle", 44, 48, TipoPokemon.AGUA) {};
    Pokemon Bulbasaur = new Pokemon("Bulbasaur", 45, 49, TipoPokemon.PLANTA) {};
    Pokemon Pikachu = new Pokemon("Pikachu",35 , 52, TipoPokemon.ELECTRICO) {};
    Pokemon Abra = new Pokemon("Abra", 25, 20, TipoPokemon.PSIQUICO) {};
    Pokemon Geodude = new Pokemon("Geodude", 40, 80, TipoPokemon.ROCA) {};
    Pokemon Pidgey = new Pokemon("Pidgey", 40, 45, TipoPokemon.VOLADOR) {};
    Pokemon Jigglypuff = new Pokemon("Jigglypuff", 115, 45, TipoPokemon.HADA) {};
    Pokemon Machop = new Pokemon("Machop", 39, 52, TipoPokemon.LUCHA) {};
    Pokemon Grimer = new Pokemon("Grimer", 80, 80, TipoPokemon.VENENO) {};
    

public void iniciarBatalla(Pokemon pokemon1, Pokemon pokemon2) {
        System.out.println("¡La batalla comienza entre " + pokemon1.getNombre() + " y " + pokemon2.getNombre());
        
        while (pokemon1.getSalud() > 0 && pokemon2.getSalud() > 0) {
            
            ejecutarTurno(pokemon1, pokemon2);
            if (pokemon2.getSalud() <= 0) {
                System.out.println(pokemon2.getNombre() + " ha sido derrotado. ¡" + pokemon1.getNombre() + " gana la batalla!");
                break;
            }

            // Turno del segundo Pokémon
            ejecutarTurno(pokemon2, pokemon1);
            if (pokemon1.getSalud() <= 0) {
                System.out.println(pokemon1.getNombre() + " ha sido derrotado. ¡" + pokemon2.getNombre() + " gana la batalla!");
                break;
            }
        }
    }

    
    private void ejecutarTurno(Pokemon atacante, Pokemon defensor) {
        double multiplicador = TipoPokemon.obtenerMultiplicadorDeDaño(atacante.getTipo(), defensor.getTipo());
        int daño = (int) (atacante.atacar() * multiplicador);

        System.out.println(atacante.getNombre() + " ataca a " + defensor.getNombre() + " con un multiplicador de " + multiplicador + " causando " + daño + " puntos de daño.");
        defensor.recibirDaño(daño);
    }
}







