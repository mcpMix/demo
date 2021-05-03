package com.example.demo.pattern.create.method.factory;

import java.util.Calendar;

public abstract class Empresa {

    public abstract Passagem emitePassagem(String origem, String destino, Calendar dataHoraPartida);
}
