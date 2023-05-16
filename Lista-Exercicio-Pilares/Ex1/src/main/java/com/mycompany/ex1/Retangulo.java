/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex1;

/**
 *
 * @author aluno
 */
public class Retangulo extends FormaGeometrica {
    double Area;
    double Base = 3;
    double Altura = 5;
    
     @Override
    public void CalcularArea(){
        Area = Base * Altura;
         System.out.println("A Area do Retangulo é: "+Area);
    }
}
