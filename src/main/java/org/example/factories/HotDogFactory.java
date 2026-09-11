package org.example.factories;

import org.example.Lanche;
import org.example.lanches.HotDog;

public class HotDogFactory extends LanchoneteFactory {
    @Override
    public Lanche criarLanche() {
        return new HotDog();
    }
}
