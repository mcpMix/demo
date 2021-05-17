package com.example.demo.pattern.struct.adpter;

public class MyApp {

    public static void main(String args[]){
        TomadaBrasileira tomadaBr = new TomadaBrasileira();

        PlugAmericano plugAmericano= new PlugAmericano();

        AdapterEUAToBrasil adapter =  new AdapterEUAToBrasil();
        System.out.println(adapter.conecta(plugAmericano));


    }
}
