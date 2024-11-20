package simulador.pokemon;

import simulador.pokemon.TipoPokemon;

public abstract class Pokemon {
    private String nombre;
    private int salud;
    private int puntosDeAtaque;
    private TipoPokemon tipo;
    private String estado;

    public Pokemon(String nombre, int salud, int puntosDeAtaque, TipoPokemon tipo) {
        this.nombre = nombre;
        this.salud = salud;
        this.puntosDeAtaque = puntosDeAtaque;
        this.tipo = tipo;
        this.estado = "Normal";
    }

    public String getNombre() {
        return nombre;
    }

    public int getSalud() {
        return salud;
    }

    public void setSalud(int salud) {
        this.salud = salud;
    }

    public int getPuntosDeAtaque() {
        return puntosDeAtaque;
    }

    public void setPuntosDeAtaque(int puntosDeAtaque) {
        this.puntosDeAtaque = puntosDeAtaque;
    }

    public TipoPokemon getTipo() {
        return tipo;
    }

    public void atacar(Pokemon oponente) {
        double multiplicador = TipoPokemon.obtenerMultiplicadorDeDaño(this.tipo, oponente.getTipo());
        int daño = (int) (this.puntosDeAtaque * multiplicador);
        System.out.println(this.nombre + " ataca a " + oponente.getNombre() + " causando " + daño + " de daño.");
        oponente.recibirDaño(daño);
    }

    public void recibirDaño(int daño) {
        this.salud -= daño;
        if (this.salud <= 0) {
            this.salud = 0;
            this.estado = "Debilitado";
            System.out.println(this.nombre + " ha sido debilitado.");
        } else {
            System.out.println(this.nombre + " ahora tiene " + this.salud + " de salud.");
        }
    }

    public void entrenar() {
        this.puntosDeAtaque += 10;
        this.salud += 5;
        System.out.println(this.nombre + " ha sido entrenado. Salud: " + this.salud + ", Ataque: " + this.puntosDeAtaque);
    }
}

