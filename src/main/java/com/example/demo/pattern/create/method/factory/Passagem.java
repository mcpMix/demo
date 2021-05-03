package com.example.demo.pattern.create.method.factory;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public abstract class Passagem {

    private String origem;
    private String destino;
    private Calendar dataHoraPartida;

    protected SimpleDateFormat df =  new SimpleDateFormat("dd/MM/yyyy HH:mm");

    public Passagem(String origem, String destino, Calendar dataHoraPartida) {
        this.origem = origem;
        this.destino = destino;
        this.dataHoraPartida = dataHoraPartida;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public Calendar getDataHoraPartida() {
        return dataHoraPartida;
    }

    public Passagem withOrigem(String origem) {
        this.origem = origem;
        return this;
    }

    public Passagem withDestino(String destino) {
        this.destino = destino;
        return this;
    }

    public Passagem withDataHoraPartida(Calendar dataHoraPartida) {
        this.dataHoraPartida = dataHoraPartida;
        return this;
    }

    public abstract void exibeDetalhes();
}
