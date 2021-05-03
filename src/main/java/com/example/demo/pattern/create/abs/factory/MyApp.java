package com.example.demo.pattern.create.abs.factory;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;

public class MyApp {

    public static void main(String[] args){
        EmpresaOnibus empresaOnibus =  new ConcreteEmpresaOnibus();

        TimeZone tz = new SimpleTimeZone( Calendar.ZONE_OFFSET, "GMT-03:00");
        Calendar cal1 = GregorianCalendar.getInstance(tz);
        cal1.add(Calendar.DAY_OF_MONTH,1 );
        cal1.add( Calendar.HOUR,1 );

        Calendar cal2 = GregorianCalendar.getInstance(tz);

        (empresaOnibus.emitePassagemOnibusInterestadual("Petrópolis", "Rio", cal1 )).exibeDetalhes();

        (empresaOnibus.emitePassagemOnibusUrbano("Centro", "Quitandinha", cal2 )).exibeDetalhes();
    }
}
