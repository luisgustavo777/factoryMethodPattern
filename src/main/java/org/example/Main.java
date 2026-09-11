package org.example;

import org.example.factories.HamburgueriaFactory;
import org.example.factories.HotDogFactory;
import org.example.factories.LanchoneteFactory;
import org.example.factories.PizzariaFactory;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        LanchoneteFactory fabricaHamburguer = new HamburgueriaFactory();
        fabricaHamburguer.pedir();

        System.out.println();

        LanchoneteFactory fabricaHotDog = new HotDogFactory();
        fabricaHotDog.pedir();

        System.out.println();

        LanchoneteFactory fabricaPizza = new PizzariaFactory();
        fabricaPizza.pedir();
    }
}