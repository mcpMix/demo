package com.example.demo.pattern.create.builder;

public class HamburguerBuilder extends SanduicheBuilder {

    private Sanduiche sanduiche = new Hamburguer();

    @Override
    public void abrePao() {
        System.out.println("Abre o pão  de Hamburguer");
    }

    @Override
    public void insereIngredientes() {
        System.out.println("Insere carne e queijo");

    }

    @Override
    public void fechaPao() {
        System.out.println("Fecha o pão  de Hamburguer");
    }

    @Override
    public Sanduiche getSanduiche() {
        System.out.println("Hamburguer esta pronto");
        return sanduiche;
    }
}
