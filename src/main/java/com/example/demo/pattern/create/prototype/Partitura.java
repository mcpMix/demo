package com.example.demo.pattern.create.prototype;

import java.util.Hashtable;

public class Partitura {

    private static Hashtable<String, NotaMusical> notaMusicalHashtable = new Hashtable<>();

    public static void carregaNotas(){
        Do notaDo = new Do();
        notaMusicalHashtable.put("Do",notaDo);

        Re notaRe = new Re();
        notaMusicalHashtable.put("Re",notaRe);

        Mi notaMi = new Mi();
        notaMusicalHashtable.put("Mi",notaMi);

        Fa notaFa = new Fa();
        notaMusicalHashtable.put("Fa",notaFa);

        Sol notaSol = new Sol();
        notaMusicalHashtable.put("Sol",notaSol);

        La notaLa = new La();
        notaMusicalHashtable.put("La",notaLa);

        Si notaSi = new Si();
        notaMusicalHashtable.put("Si",notaSi);

    }

    public static NotaMusical getNota(String nome){
        NotaMusical nota = notaMusicalHashtable.get(nome);
        return nota.clone();
    }
}
