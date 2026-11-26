package model;

public class Troll extends Personagem {

    private int forcaBruta;


    public Troll(String nome, int vidaMaxima, int forcaBruta)
    {
        super(nome, vidaMaxima);
        this.forcaBruta = forcaBruta;
    }

    @Override
    public int atacar() {
        System.out.println("O troll" +getNome()+ "arremessa o oponente para longe o machucando gravemente");
        return this.forcaBruta;


    }
}
