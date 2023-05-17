/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex1;

/**
 * Crie uma classe abstrata chamada "FormaGeometrica" com um método abstrato "calcularArea()". Em seguida, 
 * crie duas subclasses chamadas "Retangulo" e "Circulo" que herdam da classe "FormaGeometrica" e implementam 
 * o método "calcularArea()" de maneiras diferentes.
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
