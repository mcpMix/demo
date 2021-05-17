package com.example.demo.pattern.struct.adpter;

public class PlugBrasileiro extends Plug{

    @Override
    public String obterEletricidade() {
        return "Plug brasileiro conectado à";
    }

}
