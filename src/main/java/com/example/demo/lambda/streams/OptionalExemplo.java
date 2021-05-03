package com.example.demo.lambda.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalExemplo {

    public static void main(String[] args){
       // String numero ="1";
        String numero ="lixo";

//        Integer retorno = OptionalExemplo.convertEmNumero(numero);
//        Optional<Integer> retorno = OptionalExemplo.convertEmNumero(numero);

//        System.out.println(retorno);
//        OptionalExemplo.convertEmNumero(numero)
//                .ifPresent( n->System.out.println(n));

//        Integer retorno = OptionalExemplo.convertEmNumero(numero).orElse( 2 );
//        System.out.println(retorno);

        //para operações pesadas
//        Integer retorno = OptionalExemplo.convertEmNumero(numero).orElseGet(()-> 2 );
//        System.out.println(retorno);

//        Integer retorno = OptionalExemplo.
//                convertEmNumero(numero).orElseThrow(()-> new NullPointerException() );
//        System.out.println(retorno);

    }
//v1
//    public static Integer convertEmNumero(String numeroStr){
//        return Integer.valueOf( numeroStr );
//    }

//    v2
//    public static Optional<Integer> convertEmNumero(String numeroStr){
//        return Optional.of( Integer.valueOf( numeroStr ));
//    }

//    v3
//    public static Optional<Integer> convertEmNumero(String numeroStr){
//        try {
//           Integer numero =Integer.valueOf( numeroStr );
//            return Optional.of(numero);
//        }catch (Exception e){
//            return Optional.empty();
//        }
//    }
//    v4
//    public static Optional<Integer> convertEmNumero(String numeroStr){
//        return Optional.ofNullable( null );
//    }
//    v5 ganho real
        public static Optional<Integer> convertEmNumero(String numeroStr) {
            try {
                Integer numero = Integer.valueOf( numeroStr );
                return Optional.of( numero );
            } catch (Exception e) {
                return Optional.empty();
            }
        }
}
