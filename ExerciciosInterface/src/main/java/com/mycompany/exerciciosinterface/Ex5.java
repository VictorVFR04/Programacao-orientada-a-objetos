/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciosinterface;

/**
* Crie uma interface chamada Registravel com um método registrar(String mensagem) que registra uma mensagem de log.
* Em seguida, implemente essa interface em uma classe chamada RegistroConsole que exibe a mensagem de log no console.
 */
public class Ex5 {
    public interface Registravel{
        void registrar(String mensagem);
    }
    
    public class RegistroConsole implements Registravel{
        @Override
        public void registrar(String mensagem){
            System.out.println(mensagem);
        }
    }
    
}
