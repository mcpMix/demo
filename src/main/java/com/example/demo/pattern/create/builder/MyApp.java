package com.example.demo.pattern.create.builder;

public class MyApp {

    public static void main(String[] args){
        Cozinha cozinha = new Cozinha();

        SanduicheBuilder s1 = new HamburguerBuilder();
        SanduicheBuilder s2 = new FishBuilder();

        cozinha.fazSanduiche( s1 );
        s1.getSanduiche();
        cozinha.fazSanduiche( s2 );
        s2.getSanduiche();
    }
}
