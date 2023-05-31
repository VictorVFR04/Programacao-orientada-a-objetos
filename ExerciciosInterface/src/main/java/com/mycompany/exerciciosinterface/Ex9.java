/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciosinterface;

/**
 * Crie uma interface chamada Validavel com um método validar() que verifica se um objeto é válido. 
 * Em seguida, implemente essa interface em uma classe chamada ValidadorEmail que verifica se uma string é um endereço de e-mail válido.
 */
public class Ex9 {
    public interface Validavel{
        void validar();
    }
    public class ValidadorEmail implements Validavel{
        public boolean validacao; 
        @Override
        public void validar(){
            if(validacao == true){
                System.out.println("Email válido");
            }else{
                System.out.println("Email não válido");
            }
        }
    }
}
