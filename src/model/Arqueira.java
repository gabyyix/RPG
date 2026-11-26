package model;

public class Arqueira extends Personagem {

    private int precisao;

    public Arqueira(String nome, int vidaMaxima, int precisao) {
        super(nome, vidaMaxima);
        this.precisao = precisao;
    }

    @Override
    public int atacar() {
        System.out.println("🏹 O arqueiro " + getNome() + " dispara uma flecha certeira! 🎯");
        return this.precisao;
    }
}
