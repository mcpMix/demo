package com.example.demo.pattern.create.method.factory;

import java.util.Calendar;

public class EmpresaOnibusUrbano extends Empresa{
    @Override
    public Passagem emitePassagem(String origem, String destino, Calendar dataHoraPartida) {
        return new PassagemOnibusUrbano( origem,destino, dataHoraPartida);
    }
}
