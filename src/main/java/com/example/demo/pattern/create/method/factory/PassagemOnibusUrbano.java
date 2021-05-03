package com.example.demo.pattern.create.method.factory;

import com.example.demo.pattern.commons.CommonsText;

import java.util.Calendar;

public class PassagemOnibusUrbano extends Passagem{
    public PassagemOnibusUrbano(String origem, String destino, Calendar dataHoraPartida) {
        super( origem, destino, dataHoraPartida );
    }

    public void exibeDetalhes(){
        StringBuilder textOut =  new StringBuilder();
        textOut.append( CommonsText.TEXT_ONIBUS_INTER_URBANO);
        textOut.append(getOrigem());
        textOut.append( CommonsText.TEXT_PARA );
        textOut.append( getDestino() );
        textOut.append( CommonsText.TEXT_DATA_HORA );
        textOut.append( df.format(getDataHoraPartida().getTime()) );
        System.out.println(textOut.toString());

    }
}
