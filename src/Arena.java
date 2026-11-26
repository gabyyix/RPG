import model.*;

import java.util.Random;

public class Arena {
    public static void main(String[] args) {

        System.out.println(" A Batalha  Vai Começar! ");

        Guerreiro ryu = new Guerreiro("Ryu", 100, 80);

        Mago gendai = new Mago("Gendai", 75, 40);

        Curandeiro salazar = new Curandeiro("Salazar", 36);

        Arqueira ada = new Arqueira("Ada", 60, 80);

        Assassino leon = new Assassino("Leon",120,95);

        Necromante undertaker = new Necromante("Undertaker", 100,90);

        Troll krates = new Troll("Krates", 130,200);


        int danoMago = gendai.atacar();
        ryu.receberDano(danoMago);
        System.out.println();
        int danoGuerreiro =  ryu.atacar();
        gendai.receberDano(danoGuerreiro);
        System.out.println();
        int danoCurandeiro = ryu.atacar();
        salazar.receberDano(danoCurandeiro);
        System.out.println();
        salazar.curar();


    }
}