package com.example.demo.pattern.create.builder;

public class Cozinha {

    public void fazSanduiche(SanduicheBuilder sanduicheBuilder){
        sanduicheBuilder.abrePao();
        sanduicheBuilder.insereIngredientes();
        sanduicheBuilder.fechaPao();
    }

}
