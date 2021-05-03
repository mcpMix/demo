package com.example.demo.pattern.create.abs.factory;

import java.util.Calendar;

public class ConcretePassagemOnibusUrbano extends PassagemOnibusUrbano{

    public ConcretePassagemOnibusUrbano(String origem, String destino, Calendar dataHoraPartida) {
        super( origem, destino, dataHoraPartida );
    }

    @Override
    public void exibeDetalhes() {
        super.exibeDetalhes();
    }
}
