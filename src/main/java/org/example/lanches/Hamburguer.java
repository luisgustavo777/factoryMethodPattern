package org.example.lanches;

import org.example.Lanche;

public class Hamburguer extends Lanche {
    public Hamburguer() {
        this.nome = "Hambúrguer";
    }

    @Override
    public void preparar() {
        System.out.println("Grelhando o pão e o hambúrguer...");
    }
}
