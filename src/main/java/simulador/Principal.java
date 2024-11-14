package simulador;
import simulador.pokemon.Pokemon;
import simulador.pokemon.TipoPokemon;

public class Principal{
public static void main (String[] args){
    
    Pokemon Charmander = new Pokemon("Charmander", 39, 52, TipoPokemon.FUEGO);
    Pokemon Squirtle = new Pokemon("Squirtle", 44, 48, TipoPokemon.AGUA) {};
    Pokemon Bulbasaur = new Pokemon("Bulbasaur", 45, 49, TipoPokemon.PLANTA) {};
    Pokemon Pikachu = new Pokemon("Pikachu",35 , 52, TipoPokemon.ELECTRICO) {};
    Pokemon Abra = new Pokemon("Abra", 25, 20, TipoPokemon.PSIQUICO) {};
    Pokemon Geodude = new Pokemon("Geodude", 40, 80, TipoPokemon.ROCA) {};
    Pokemon Pidgey = new Pokemon("Pidgey", 40, 45, TipoPokemon.VOLADOR) {};
    Pokemon Jigglypuff = new Pokemon("Jigglypuff", 115, 45, TipoPokemon.HADA) {};
    Pokemon Machop = new Pokemon("Machop", 39, 52, TipoPokemon.LUCHA) {};
    Pokemon Grimer = new Pokemon("Grimer", 80, 80, TipoPokemon.VENENO) {};
    
    
    TipoPokemon Atacante = TipoPokemon.FUEGO;
    TipoPokemon Defensor = TipoPokemon.AGUA;
    double resultado = TipoPokemon.obtenerMultiplicadorDeDaño(Atacante, Defensor);
    System.out.println("el daño de "+Atacante+" hacia "+Defensor+" es: "+ resultado);
}

    
}
