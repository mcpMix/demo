package com.example.demo.lambda.streams;

import java.util.*;
import java.util.stream.Collectors;

public class CollectExemplo {


    public static void main(String[] args){

        String s = "Inscreva-se no canal e compartilhe";

        String[] s1 = s.split( " " );

        List<String> lisStr = Arrays.asList( s1 );

        List<Integer> list  = Arrays.asList(1,2,3,4,5,6);

        //fornecedor(supplier) - acumulação (accumulator)- combinação(combine)
        ArrayList<Integer> ex1 = list.stream()
                .collect(
                        () -> new ArrayList<>(),
                        (l, e) -> l.add( e ),
                        (l1, l2) -> l1.addAll( l2 )
                );

        System.out.println(ex1);

        //toList

        List<Integer> ex2 = list.stream()
                .filter( n-> n % 2 == 0 )
                .collect( Collectors.toList() );

        System.out.println(ex2);

        Set<Integer> ex3 = list.stream()
                .filter( n-> n % 2 == 0 )
                .collect( Collectors.toSet() );

        System.out.println(ex3);

        List<Integer> ex4 = list.stream()
                .filter( n-> n % 2 == 0 )
                .collect( Collectors.toCollection(()->new LinkedList<Integer>() ) );

        System.out.println(ex4);

         String join = list.stream()
                 .map( n -> n.toString() )
                 .collect( Collectors.joining());

        System.out.println(join);

        Double averaging = list.stream()
                .collect( Collectors.averagingInt( n -> n.intValue() ) );

        System.out.println(averaging);

        Integer summing = list.stream()
                .collect( Collectors.summingInt( n -> n.intValue() ) );
        System.out.println(summing);




        IntSummaryStatistics summarizing = list.stream()
                .collect( Collectors.summarizingInt( n -> n.intValue() ) );
        System.out.println(summarizing.getMax());
        System.out.println(summarizing.getMin());
        System.out.println(summarizing.getSum());
        System.out.println(summarizing.getAverage());

        Long ex6 = list.stream()
                .collect( Collectors.counting() );
        System.out.println(ex6);

        Optional<Integer> ex7 = list.stream()
                .collect( Collectors.maxBy(Comparator.naturalOrder()) );
        System.out.println(ex7);

        list.stream()
                .filter( n -> n % 2 == 0 )
                .collect( Collectors.minBy(Comparator.naturalOrder()) )
                .ifPresent( System.out:: println );
        //groupby
        Map<Integer,List<Integer>> groupby1 = list.stream()
                .collect( Collectors.groupingBy( (n) -> n % 3 ) );

        System.out.println(groupby1);

        //partitioningBy
        Map<Boolean,List<Integer>> partitioningBy = list.stream()
                .collect( Collectors.partitioningBy( (n) -> n % 3 ==0) );

        System.out.println(partitioningBy);

        //toMap
        Map<Integer,Integer> toMap = list.stream()
                .collect( Collectors.toMap( n -> n, n -> n * 2 ));
        System.out.println(toMap);

        Map<Integer,Double> toMap2 = list.stream()
                .collect( Collectors.toMap(
                        n -> n,
                        n -> Math.pow( n.doubleValue(),5 )));
        System.out.println(toMap2);



    }
}
