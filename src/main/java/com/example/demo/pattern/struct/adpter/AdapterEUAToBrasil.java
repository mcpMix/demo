package com.example.demo.pattern.struct.adpter;

public class AdapterEUAToBrasil extends TomadaBrasileira{

    public String conecta(PlugAmericano plug) {
        return plug.obterEletricidade() + this.getNomeRede();
    }
}
