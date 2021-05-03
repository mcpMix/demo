package com.example.demo.files.domain.converter;

import com.example.demo.files.domain.StoreCsv;
import org.apache.commons.lang3.StringUtils;

import java.util.Base64;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StoreToBase64Converter implements Function<List<StoreCsv>, String> {

    @Override
    public String apply(List<StoreCsv> storeCsvs) {
        if(null == storeCsvs || storeCsvs.isEmpty()){
            return StringUtils.EMPTY;
        }
        String base64 = storeCsvs.stream()
                .map( n -> n.getStore_uuid().concat(StringUtils.LF) )
                .collect( Collectors.joining() );
        return Base64.getEncoder().encodeToString(base64.getBytes());
    }
}
