package org.example;

public abstract class Lanche {
    protected String nome;

    public abstract void preparar();

    public String getNome() {
        return nome;
    }
}