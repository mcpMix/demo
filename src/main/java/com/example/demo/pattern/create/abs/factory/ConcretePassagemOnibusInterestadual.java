package com.example.demo.pattern.create.abs.factory;

import java.util.Calendar;

public class ConcretePassagemOnibusInterestadual extends PassagemOnibusInterestadual {

    public ConcretePassagemOnibusInterestadual(String origem, String destino, Calendar dataHoraPartida) {
        super( origem, destino, dataHoraPartida );
    }

    @Override
    public void exibeDetalhes() {
        super.exibeDetalhes();
    }
}
