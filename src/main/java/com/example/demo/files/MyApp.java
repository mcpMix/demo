package com.example.demo.files;

import com.example.demo.files.domain.StoreCsv;
import com.example.demo.files.domain.converter.StoreCsvConverter;
import com.example.demo.files.domain.converter.StoreToBase64Converter;
import com.example.demo.files.domain.converter.StoreToSqlInConverter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

import static com.example.demo.files.CommonsFilesDemo.FORMAT_VALUE;
import static com.example.demo.files.CommonsFilesDemo.PATH;

public class MyApp {

    private static final Logger LOG = LoggerFactory.getLogger( MyApp.class);

    public static void main(String args[]) throws IOException {

        StoreCsvConverter storeCsvConverter =  new StoreCsvConverter();
        StoreToSqlInConverter storeToSqlInConverter = new StoreToSqlInConverter();
        StoreToBase64Converter storeToBase64Converter =  new StoreToBase64Converter();


        List<StoreCsv> stores = storeCsvConverter.apply(Paths.get(PATH)).orElse(new ArrayList<>());

        statisticsPositive(stores);

        statisticsNegative(stores);

//        System.out.println( storeToSqlInConverter.apply(stores));
//
//        System.out.println(storeToBase64Converter.apply(stores));

    }

    private static  void statisticsPositive(List<StoreCsv> stores){

        DoubleSummaryStatistics statistics= stores.stream()
                .filter( n -> n.getValor().doubleValue() >0 )
                .collect( Collectors.summarizingDouble( n -> n.getValor().doubleValue() ) );

        LOG.info("---ESTATÍSTICA POSITIVO---");
        LOG.info("Total={}",statistics.getCount());
        LOG.info("Soma={}",formatValue(statistics.getSum()));
        LOG.info("Max={}",formatValue(statistics.getMax()));
        LOG.info("Min={}",formatValue(statistics.getMin()));
        LOG.info("Media={}",formatValue(statistics.getAverage()));

    }

    private static void statisticsNegative(List<StoreCsv> stores){

        DoubleSummaryStatistics statistics= stores.stream()
                .filter( n -> n.getValor().doubleValue() <0 )
                .collect( Collectors.summarizingDouble( n -> n.getValor().doubleValue() ) );

        LOG.info("---ESTATÍSTICA NEGATIVO---");
        LOG.info("Total={}",statistics.getCount());
        LOG.info("Soma={}",formatValue(statistics.getSum()));
        LOG.info("Max={}",formatValue(statistics.getMax()));
        LOG.info("Min={}",formatValue(statistics.getMin()));
        LOG.info("Media{}",formatValue(statistics.getAverage()));

    }


    private static String formatValue(double valor){
        return String.format(
                Locale.ITALY, FORMAT_VALUE, valor);
    }
}
