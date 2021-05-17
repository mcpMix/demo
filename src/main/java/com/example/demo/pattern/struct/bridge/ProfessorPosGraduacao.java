package com.example.demo.pattern.struct.bridge;

public class ProfessorPosGraduacao extends Professor{

    public ProfessorPosGraduacao(Implementador imp) {
        super( imp );
    }

    @Override
    public void op() {
        imp.optImpl();
    }
}
