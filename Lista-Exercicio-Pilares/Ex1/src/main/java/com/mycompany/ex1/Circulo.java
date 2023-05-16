/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex1;
import java.lang.Math;

/**
 *
 * @author aluno
 */
public class Circulo extends FormaGeometrica {
    double Area;
    double Raio = 7;
    double Pi = 1.14;
    
    @Override
    public void CalcularArea(){        
        Area = Pi * Math.pow(Raio,2);
        System.out.println("A Area do Circulo é: "+ Area);
    }
}
