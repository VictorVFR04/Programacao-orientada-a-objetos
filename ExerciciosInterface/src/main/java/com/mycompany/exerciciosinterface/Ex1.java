/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciosinterface;

/**
* Crie uma interface chamada Desenhavel com um método desenhar() que não retorna nada.
* Em seguida, implemente essa interface em três classes diferentes: Circulo, Retangulo e Triangulo. 
* Cada classe deve implementar o método desenhar() para exibir o nome da forma geométrica correspondente.
 */
public class Ex1 {
    
public interface Desenhavel{
    void desenhar();
}

public class Circulo implements Desenhavel{
    @Override
    public void desenhar(){
        System.out.println("Desenhando um Circulo!");
    }
}

public class Retangulo implements Desenhavel{
    @Override
    public void desenhar(){
        System.out.println("Desenhando um Retangulo!");
    }
}

public class Triangulo implements Desenhavel{
    @Override
    public void desenhar(){
        System.out.println("Desenhando um Triangulo!");
        }
    }
}

