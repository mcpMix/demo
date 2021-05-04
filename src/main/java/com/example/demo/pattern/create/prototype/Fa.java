package com.example.demo.pattern.create.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Fa extends NotaMusical{

    private static final Logger LOG = LoggerFactory.getLogger(Fa.class);
    @Override
    public void desenha() {
        LOG.info( "FA" );
    }
}
