package model;

public class Necromante extends Personagem {

    private int poderSombrio;

    public Necromante(String nome, int vidaMaxima, int poderSombrio) {
        super(nome, vidaMaxima);
        this.poderSombrio = poderSombrio;
    }

    @Override
    public int atacar() {
        System.out.println("O necromante " + getNome() + " invoca espíritos das sombras! ");
        return this.poderSombrio;
    }
}
