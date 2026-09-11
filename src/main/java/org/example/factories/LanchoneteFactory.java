package org.example.factories;

import org.example.Lanche;

public abstract class LanchoneteFactory {

    public abstract Lanche criarLanche();

    public Lanche pedir() {
        Lanche lanche = criarLanche();
        System.out.println("Pedido recebido: " + lanche.getNome());
        lanche.preparar();
        System.out.println(lanche.getNome() + " pronto para entrega!");
        return lanche;
    }
}