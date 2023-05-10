/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciocio_override;

/**
 *
 * @author aluno
 */
public class Animal {
    public void emitirSom(){
        System.out.println("O animal emitiu um som!");
    }
    
    public void mover(){
        System.out.println("O animal se moveu!");
    }
 }

class Cachorro extends Animal{
    @Override
    public void emitirSom(){
        System.out.println("Auau!");
    } 
    @Override
    public void mover(){
        System.out.println("Vop");
    }
}

class Gato extends Animal{
    @Override
    public void emitirSom(){
        System.out.println("MiauMiau!");
    }
    
    @Override
    public void mover(){
        System.out.println("Vup");
    }
    
}
