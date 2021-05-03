package com.example.demo.files.domain.converter;

import com.example.demo.files.domain.StoreCsv;
import org.apache.commons.lang3.StringUtils;

import java.util.Iterator;
import java.util.List;
import java.util.function.Function;

import static com.example.demo.files.CommonsFilesDemo.*;

public class StoreToSqlInConverter implements Function<List<StoreCsv>, String> {


    @Override
    public String apply(List<StoreCsv> storeCsvs) {
        if(null == storeCsvs || storeCsvs.isEmpty()){
            return StringUtils.EMPTY;
        }
        StringBuilder sqlIn = new StringBuilder(SQL_IN_INICIO);
        Iterator<StoreCsv> iterator = storeCsvs.iterator();
        while(iterator.hasNext()){
            sqlIn.append(ASPAS_SIMPLES);
            sqlIn.append(iterator.next().getStore_uuid());
            sqlIn.append(ASPAS_SIMPLES);
            if(!iterator.hasNext()){
                sqlIn.append(SQL_FINAL);
            }else{
                sqlIn.append(SEPARADOR);
            }
        }
        return sqlIn.toString();
    }
}
