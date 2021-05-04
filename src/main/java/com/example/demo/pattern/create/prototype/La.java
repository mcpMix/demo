package com.example.demo.pattern.create.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class La extends NotaMusical{
    private static final Logger LOG = LoggerFactory.getLogger(La.class);

    @Override
    public void desenha() {
        LOG.info( "LA" );
    }
}
