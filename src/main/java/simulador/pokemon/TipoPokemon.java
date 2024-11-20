package simulador.pokemon;

public enum TipoPokemon {
    
    
    FUEGO,
    AGUA,
    PLANTA,
    VENENO,
    ELECTRICO,
    PSIQUICO,
    ROCA,
    TIERRA,
    NORMAL,
    VOLADOR,
    HADA,
    LUCHA;
    
 
     private static final double[][] Multiplicador = {
        // FUE  AGU  PLA  VEN  ELE  PSI  ROC  TIE  NOR  VOL  HADA LUCHA
        {  1,  0.5, 2.0, 1.0, 1.0, 1.0, 0.5, 1.0, 1.0, 1.0, 1.0, 1.0}, // FUEGO
        {  2,   1,  0.5,  1,   1,   1,   2,   1,   1,   1,   1,   1 }, // AGUA
        { 0.5,  2,   1,  0.5,  1,   1,   2,   2,   1,   1,   1,   1 }, // PLANTA
        {  1,   1,   2,   1,   1,   1,  0.5,  1,   1,   1,   2,   1 }, // VENENO
        {  1,   2,  0.5,  1,   1,   1,   1,   0,   1,   2,   1,   1 }, // ELECTRICO
        {  1,   1,   1,   2,   1,   1,   1,   1,   1,   1,   1,   2 }, // PSIQUICO
        {  2,   1,   1,   1,   1,   1,   1,   1,   1,   2,   1,  0.5}, // ROCA
        {  2,   1,   1,   2,   0,   1,   2,   1,   1,  0.5,  1,   1 }, // TIERRA
        {  1,   1,   1,   1,   1,   1,   1,   1,   1,   1,   1,   1 }, // NORMAL
        {  1,   1,   2,   1,   2,   1,  0.5,  1,   1,   1,   1,   1 }, // VOLADOR
        {  1,   1,   1,   1,   1,   2,   1,   1,   1,   1,   1,   1 }  // HADA
    };
      public int obtenerCasilla(TipoPokemon Tipo) {
        switch (Tipo) {
            case FUEGO: return 0;
            case AGUA: return 1;
            case PLANTA: return 2;
            case VENENO: return 3;
            case ELECTRICO: return 4;
            case PSIQUICO: return 5;
            case ROCA: return 6;
            case TIERRA: return 7;
            case NORMAL: return 8;
            case VOLADOR: return 9;
            case HADA: return 10;
            case LUCHA: return 11;
                
            }       
         return 0;   
        }   
        
      private static int obtenerIndice(TipoPokemon tipo) {
        return tipo.ordinal();
    }

    public static double obtenerMultiplicadorDeDaño(TipoPokemon atacante, TipoPokemon defensor) {
        return Multiplicador[obtenerIndice(atacante)][obtenerIndice(defensor)];
    } 
}
