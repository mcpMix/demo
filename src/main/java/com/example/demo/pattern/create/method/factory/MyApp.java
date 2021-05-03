package com.example.demo.pattern.create.method.factory;

import java.util.*;

public class MyApp {

    public static void main(String[] args){
        Empresa turb =  new EmpresaOnibusUrbano();

        Empresa interestadual =  new EmpresaOnibusInterestadual();

        TimeZone tz = new SimpleTimeZone(Calendar.ZONE_OFFSET, "GMT-03:00");
        Calendar cal1 = GregorianCalendar.getInstance(tz);
        cal1.add(Calendar.DAY_OF_MONTH,1 );
        cal1.add( Calendar.HOUR,1 );

        Calendar cal2 = GregorianCalendar.getInstance(tz);

       turb.emitePassagem("Centro", "Terminal Correias",cal1)
                .exibeDetalhes();

        interestadual.emitePassagem("Petrópolis", "Castelo",cal2 )
        .exibeDetalhes();


    }
}
