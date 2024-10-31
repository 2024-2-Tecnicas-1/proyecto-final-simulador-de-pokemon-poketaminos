package simulador.pokemon;

public abstract class Pokemon {
        private String nombre;
        private int salud;
        private int puntosDeAtaque;
        private TipoPokemon tipo;
        

    public Pokemon(String nombre, int salud, int puntosDeAtaque, TipoPokemon tipo) {
        this.nombre = nombre;
        this.salud = salud;
        this.puntosDeAtaque = puntosDeAtaque;
        this.tipo = tipo;
        
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(TipoPokemon tipo) {
        this.tipo = tipo;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public void setPuntosDeAtaque(int puntosDeAtaque) {
        this.puntosDeAtaque = puntosDeAtaque;
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }

    public int getPuntosDeAtaque() {
        return puntosDeAtaque;
    }

    public TipoPokemon getTipo() {
        return tipo;
    }
    
    public int atacar(){
        System.out.println(this.nombre+ "Está atacando con un daño de "+ this.puntosDeAtaque);
        return this.puntosDeAtaque;
    }
    public void recibirDaño(int ataqueRecibido){
        System.out.println(this.nombre+ "recibió un ataque");
        
    }
    public int entrenar()    {
        return 0;
    }



    
    }
