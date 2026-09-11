package org.example.factories;

import org.example.Lanche;
import org.example.lanches.Hamburguer;

public class HamburgueriaFactory extends LanchoneteFactory {
    @Override
    public Lanche criarLanche() {
        return new Hamburguer();
    }
}
