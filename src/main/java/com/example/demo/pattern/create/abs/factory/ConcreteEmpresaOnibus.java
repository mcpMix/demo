package com.example.demo.pattern.create.abs.factory;

import java.util.Calendar;

public class ConcreteEmpresaOnibus extends EmpresaOnibus{
    @Override
    public PassagemOnibusUrbano emitePassagemOnibusUrbano(String origem, String destino, Calendar dataHoraPartida) {
        return new ConcretePassagemOnibusUrbano( origem, destino,dataHoraPartida );
    }

    @Override
    public PassagemOnibusInterestadual emitePassagemOnibusInterestadual(String origem, String destino, Calendar dataHoraPartida) {
        return new ConcretePassagemOnibusInterestadual(origem, destino,dataHoraPartida);
    }
}
