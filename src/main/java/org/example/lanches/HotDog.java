package org.example.lanches;

import org.example.Lanche;

public class HotDog extends Lanche {
    public HotDog() {
        this.nome = "Cachorro-quente";
    }

    @Override
    public void preparar() {
        System.out.println("Cozinhando a salsicha e montando o pão...");
    }
}
