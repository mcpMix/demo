package com.example.demo.lambda.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Stream;

public class OneStreamExemplo {

    public static void main(String[] args){



        //consumer foreach
        Stream.generate(()-> new Random().nextInt() ) //supplier fornecedor
                .limit( 5 )
                .forEach( System.out::println);

        List<Integer> list  = Arrays.asList(1,2,3,4,5);

        //predicte
        list.stream()
                .filter( e-> e %  2 ==0)
                .forEach( System.out::println);//foreach tipo de  consumer

        //function
        list.stream()
                .map( e-> e.doubleValue() )
                .forEach( System.out::println);

        //unaryOperator
        list.stream()
                .map( e-> e.doubleValue() )
                .reduce( (e1,e2) ->e1 + e2 )//bynaryoperation
                .ifPresent( System.out::println );


    }
}
