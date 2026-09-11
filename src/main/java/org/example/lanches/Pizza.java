package org.example.lanches;

import org.example.Lanche;

public class Pizza extends Lanche {
    public Pizza() {
        this.nome = "Pizza";
    }

    @Override
    public void preparar() {
        System.out.println("Assando a pizza no forno...");
    }
}