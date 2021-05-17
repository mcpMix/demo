package com.example.demo.pattern.struct.bridge;

public class MyApp {

    public static void main(String args[]){
        Professor professor =  new ProfessorGraduacao( new ProfessorGraduacaoImpl() );
        professor.op();
    }
}
