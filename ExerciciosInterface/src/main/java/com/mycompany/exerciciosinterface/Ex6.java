/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciosinterface;

/**
* Crie uma interface chamada Criptografavel com dois métodos: criptografar(String dados) e descriptografar(String dadosCriptografados). 
* Em seguida, implemente essa interface em uma classe chamada AESCryptografia que utiliza o algoritmo de criptografia AES para criptografar e descriptografar dados.
 */
public class Ex6 {
    public interface Criptografavel{
        void criptografar(String dados);
        void descriptografar(String dadosCriptografados);
    }
    public class AESCryptografia implements Criptografavel{
        @Override
        public void criptografar(String dados){
            System.out.println("Criptografando "+ dados);
        }
        @Override
        public void descriptografar(String dadosCriptografados){
            System.out.println("Descriptografando " +dadosCriptografados);
        }
    }
}
