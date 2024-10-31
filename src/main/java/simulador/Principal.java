package simulador;
import simulador.pokemon.TipoPokemon;

public class Principal{
public static void main (String[] args){
    TipoPokemon Atacante = TipoPokemon.FUEGO;
    TipoPokemon Defensor = TipoPokemon.AGUA;
    double resultado = Atacante.obtenerMultiplicadorDeDaño(Atacante, Defensor);
    System.out.println("el daño de "+Atacante+" hacia "+Defensor+" es: "+ resultado);
}

    
}
