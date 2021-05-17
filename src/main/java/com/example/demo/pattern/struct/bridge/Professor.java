package com.example.demo.pattern.struct.bridge;

public abstract class Professor {

    protected Implementador imp =  new ProfessorGraduacaoImpl();

    protected Professor (Implementador imp){
        this.imp = imp;
    }

    public abstract void op();
}
