package model;

public class Assassino extends Personagem {

    private int danoCritico;

    public Assassino(String nome, int vidaMaxima, int danoCritico) {
        super(nome, vidaMaxima);
        this.danoCritico = danoCritico;
    }

    @Override
    public int atacar() {
        System.out.println("O assassino " + getNome() + " desfere um ataque furtivo! ");
        return this.danoCritico;
    }
}
