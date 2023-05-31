/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciosinterface;

/**
 * Crie uma interface chamada Redimensionavel com um método redimensionar(double fator) que redimensiona um objeto geométrico. 
 * Em seguida, implemente essa interface em uma classe chamada Circulo para redimensionar o raio do círculo pelo fator fornecido.
 */
public class Ex4 {
     public interface Redimensionavel{
        void redimensionar(double fator);
     }
     public class Circulo implements Redimensionavel{
         @Override
         public void redimensionar(double fator){
             double raio = fator/3.14;
             System.out.println("O raio foi redimensionado para "+ raio);
         }
     }
}
