package org.example.factories;

import org.example.Lanche;
import org.example.lanches.Pizza;

public class PizzariaFactory extends LanchoneteFactory {
    @Override
    public Lanche criarLanche() {
        return new Pizza();
    }
}
