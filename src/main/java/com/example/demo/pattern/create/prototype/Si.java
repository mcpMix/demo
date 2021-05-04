package com.example.demo.pattern.create.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Si extends NotaMusical{
    private static final Logger LOG = LoggerFactory.getLogger(Si.class);

    @Override
    public void desenha() {
        LOG.info( "SI" );
    }
}
