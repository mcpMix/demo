package com.example.demo.pattern.create.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public abstract class NotaMusical implements Cloneable {

    private static final Logger LOG = LoggerFactory.getLogger(NotaMusical.class);

    public NotaMusical clone() {
        Object clone = null;
        try {
                clone = super.clone();
        }catch (NotaMusicalException e){
            LOG.error(e.getMessage(),e );
        } catch (CloneNotSupportedException e) {
            LOG.error(e.getMessage(),e );
        }
        return (NotaMusical) clone;
    }

    public abstract void desenha();
}
