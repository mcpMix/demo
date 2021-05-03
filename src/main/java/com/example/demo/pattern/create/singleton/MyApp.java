package com.example.demo.pattern.create.singleton;

public class MyApp {

    public static void main(String[] args){
        Janela janela = Janela.getInstance();
        janela.pack();
        janela.setVisible( Boolean.TRUE );
    }
}
