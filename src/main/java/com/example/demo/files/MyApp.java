package com.example.demo.files;

import com.example.demo.files.domain.StoreCsv;
import com.example.demo.files.domain.converter.StoreCsvConverter;
import com.example.demo.files.domain.converter.StoreToBase64Converter;
import com.example.demo.files.domain.converter.StoreToSqlInConverter;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.example.demo.files.CommonsFilesDemo.PATH;

public class MyApp {



    public static void main(String args[]) throws IOException {

        StoreCsvConverter storeCsvConverter =  new StoreCsvConverter();
        StoreToSqlInConverter storeToSqlInConverter = new StoreToSqlInConverter();
        StoreToBase64Converter storeToBase64Converter =  new StoreToBase64Converter();


        List<StoreCsv> stores = storeCsvConverter.apply(Paths.get(PATH)).orElse(new ArrayList<>());

        List<StoreCsv> stores10 = stores.stream()
                .skip(0)
                .limit(3)
                .collect( Collectors.toList());

//        System.out.println( storeToSqlInConverter.apply(stores));

//        System.out.println(storeToBase64Converter.apply(stores));

        System.out.println( storeToSqlInConverter.apply(stores10));

        System.out.println(storeToBase64Converter.apply(stores10));
    }
}
