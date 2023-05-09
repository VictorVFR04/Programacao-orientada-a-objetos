/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exercicio.redefinicao.de.metodo;

/**
 *
 * @author aluno
 */
public class ExercicioRedefinicaoDeMetodo {

    public static void main(String[] args) {
        
        class Animal{
           public void fazerBarulho(){
               System.out.println("O animal está fazendo barulho");
           }
        }
        
        class Cachorro extends Animal{
            public void fazerBarulho(){
                System.out.println("O cachorro está latindo");
            }
        }
        
        class Gato extends Animal{
            public void fazerBarulho(){
                System.out.println("O gato está miando");
            }
        }
        
        Animal animal = new Cachorro();
        animal.fazerBarulho();
        
        animal = new Gato();
        animal.fazerBarulho();
        
        animal = new Animal();
        animal.fazerBarulho();
    }
}
