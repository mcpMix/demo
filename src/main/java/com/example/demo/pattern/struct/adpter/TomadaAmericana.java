package com.example.demo.pattern.struct.adpter;

public class TomadaAmericana extends Tomada<PlugAmericano>{

    @Override
    public String conecta(PlugAmericano plug) {
        return plug.obterEletricidade().concat(getNomeRede());
    }

    @Override
    public String getNomeRede() {
        return " Tomada Americana";
    }
}
