package com.example.demo.pattern.create.singleton;

import javax.swing.*;
import java.awt.*;

public class Janela extends JFrame {

    private static Janela J = null;

    private Janela(){
        setPreferredSize( new Dimension(640,480) );
    }

    public static Janela getInstance(){
        if(null == J){
            J = new Janela();
        }
        return J;
    }
}
