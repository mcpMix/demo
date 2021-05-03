package com.example.demo.files.domain.converter;

import com.example.demo.files.domain.StoreCsv;
import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class StoreCsvConverter implements Function<Path, Optional<List<StoreCsv>>> {

    @Override
    public Optional<List<StoreCsv>> apply(Path path) {
        try {
            Reader reader = Files.newBufferedReader(path);
            CSVReader csvReader = new CSVReaderBuilder(reader).withSkipLines(1).build();
            return Optional.of(parse(csvReader.readAll()));
        }catch (IOException e){
            return Optional.empty();
        }
    }

    private static List<StoreCsv> parse(List<String[]> lines) {
        List<StoreCsv> stores = new ArrayList<>();
        for (String[] item : lines) {
            stores.add(new StoreCsv(item[0]));
        }
        return stores;
    }
}
