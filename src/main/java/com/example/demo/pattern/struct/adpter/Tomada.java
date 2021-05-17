package com.example.demo.pattern.struct.adpter;

public abstract class Tomada <T>{


    public abstract String conecta(T plug);

    public abstract  String getNomeRede();
}
