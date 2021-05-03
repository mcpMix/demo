package com.example.demo.pattern.create.builder;

public class FishBuilder extends SanduicheBuilder {

    private Sanduiche sanduiche =  new FishBurguer();

    @Override
    public void abrePao() {
        System.out.println("Abre o pão de fishburguer");
    }

    @Override
    public void insereIngredientes() {
        System.out.println("Insere file de peixe e queijo");
    }

    @Override
    public void fechaPao() {
        System.out.println("Abre o pão  de fishburguer");
    }

    @Override
    public Sanduiche getSanduiche() {
        System.out.println("Fishburguer pronto");
        return sanduiche;
    }
}
