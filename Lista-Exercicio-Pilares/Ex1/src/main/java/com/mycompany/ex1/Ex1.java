/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ex1;

/**
 *
 * @Crie uma classe abstrata chamada "FormaGeometrica" com um método abstrato "calcularArea()". Em seguida, 
 * crie duas subclasses chamadas "Retangulo" e "Circulo" que herdam da classe "FormaGeometrica" e implementam 
 * o método "calcularArea()" de maneiras diferentes.
 */
public class Ex1 {

    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo();
        retangulo.CalcularArea();
        
        Circulo circulo = new Circulo();
        circulo.CalcularArea();
    }
}
