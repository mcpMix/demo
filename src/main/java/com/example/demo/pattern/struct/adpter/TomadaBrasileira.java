package com.example.demo.pattern.struct.adpter;

public class TomadaBrasileira extends Tomada<PlugBrasileiro>{

    @Override
    public String conecta(PlugBrasileiro plug) {
        return plug.obterEletricidade().concat(getNomeRede(  ) );
    }

    @Override
    public String getNomeRede() {
        return " Tomada Brasileira";
    }
}
