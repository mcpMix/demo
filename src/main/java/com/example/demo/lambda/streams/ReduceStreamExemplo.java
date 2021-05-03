package com.example.demo.lambda.streams;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.*;
import java.util.concurrent.TimeUnit;
import java.util.stream.DoubleStream;

public class ReduceStreamExemplo {

    public static void main(String[] args) throws InterruptedException {

        //reduce para objetos imutaveis

        String s = "Inscreva-se no canal e compartilhe";

        String[] s1 = s.split( " " );

        List<String> lisStr = Arrays.asList( s1 );

        List<Integer> list  = Arrays.asList(1,2,3,4,5,6);


        //unaryOperator
//        list.stream()
//                .map( e-> e.doubleValue() )
//                .reduce( (e1,e2) ->e1 + e2 )//bynaryoperation
//                .ifPresent( System.out::println );

        //reduce funcao de acumulação
        Optional<Integer> soma = list.stream()
                .reduce( (e1, e2) -> e1 + e2 );

        System.out.println(soma);

        //reduce funcao de acumulação
        Optional<Integer> multiplicacao = list.stream()
                .reduce( (e1, e2) -> e1 * e2 );

        System.out.println(multiplicacao);

        //reduce concatenando
        Optional<String> concatenando = lisStr.stream()
                .reduce( (str1, str2) -> str1.concat( str2 ) );

        System.out.println(concatenando);

        //reduce funcao de subtracao - obs não e associativa
        Optional<Integer> subtracao = list.stream()
                .reduce( (e1, e2) -> e1 - e2 );
        System.out.println(subtracao);

        //qual a solução ? Não Use.


        //reduce - menor valor usando identidade
        double doubleStream = DoubleStream.of( 1.5, 2.9, 6.9 )
                .reduce( Double.POSITIVE_INFINITY,(d1, d2) ->Math.min(d1,d2) );
        System.out.println(doubleStream);


        //Ex com combinação
        Integer soma3 = list.stream()
                .reduce( 0, (e1, e2) -> e1 + e2,(e1, e2) -> e1 + e2 );
        System.out.println(soma3);

        //reduce + map +combine
        Optional<String> reduce = list.stream()
                .map( n1 -> n1.toString() )
                .reduce( (n1, n2) -> n1.concat( n2 ) );

        System.out.println(reduce);

        //reduce + map +combine com ganho de performance
        String reduce2 = list.stream()
                .parallel()
                .reduce("",
                        (n1, n2) -> n1.toString().concat( n2.toString()),
                        (n1, n2) -> n1.concat( n2 ));

        System.out.println(reduce2);

//        System.out.println( Calendar.getInstance().getTime().toInstant().plus( 2l, Calendar.MINUTE ));
       // TimeUnit.SECONDS.sleep( 10L );




        LocalDateTime dateTime = LocalDateTime.now().plus( Duration.of(2, ChronoUnit.MINUTES));
        Date tmfn = Date.from(dateTime.atZone( ZoneId.systemDefault()).toInstant());
        System.out.println(tmfn);




    }
}
