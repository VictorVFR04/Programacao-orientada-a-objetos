/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.redefinicao.de.metodos;

/**
 *
 * @Aula 09/05/2023
 */
public class RedefinicaoDeMetodos {
    public static void main(String[] args) {
        
    class Animal{
        public void emitirSom(){
            System.out.println("O Animal emitiu um som.");
        }
    }
    
    class Cachorro extends Animal{
        public void emitirSom(){
            System.out.println("O cachorro latiu.");
        }
    }
    
    class Gato extends Animal{
        public void emitirSom(){
            System.out.println("O gato miou.");
            }
        }
    
    class Elefante extends Animal{
        
    }
    
    Animal animal = new Cachorro();
    animal.emitirSom();
    
    animal = new Gato();
    animal.emitirSom();
    
    animal = new Animal();
    animal.emitirSom();
    
    animal = new Elefante();
    animal.emitirSom();
    }
}
