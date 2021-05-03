package com.example.demo.pattern.create.abs.factory;

import com.example.demo.pattern.commons.CommonsText;



import java.util.Calendar;

public abstract class PassagemOnibusInterestadual  {

    private String origem;
    private String destino;
    private Calendar dataHoraPartida;

    public PassagemOnibusInterestadual(String origem, String destino, Calendar dataHoraPartida) {
        this.origem = origem;
        this.destino = destino;
        this.dataHoraPartida = dataHoraPartida;
    }

    public void exibeDetalhes(){
        StringBuilder textOut =  new StringBuilder();
        textOut.append( CommonsText.TEXT_ONIBUS_INTER_ESTATDUAL);
        textOut.append(getOrigem());
        textOut.append( CommonsText.TEXT_PARA );
        textOut.append( getDestino() );
        textOut.append( CommonsText.TEXT_DATA_HORA );
        textOut.append( CommonsText.df.format(getDataHoraPartida().getTime()) );
        System.out.println(textOut.toString());

    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Calendar getDataHoraPartida() {
        return dataHoraPartida;
    }

    public void setDataHoraPartida(Calendar dataHoraPartida) {
        this.dataHoraPartida = dataHoraPartida;
    }
}
