package model;

public class Mago extends Personagem {

    private int poderMagico;


    public Mago(String nome, int vidaMaxima, int poderMagico)
    {
        super(nome, vidaMaxima);
        this.poderMagico = poderMagico;
    }

    @Override
    public int atacar() {
        System.out.println("️ 🧙‍♂️ O mago " +getNome()+ "lança uma bola de fogo explosiva! 🔥 ");
        return this.poderMagico;
    }
}
