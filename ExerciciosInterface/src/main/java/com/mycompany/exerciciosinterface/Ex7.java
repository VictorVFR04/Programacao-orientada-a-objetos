/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciosinterface;

/**
 * Crie uma interface chamada Pesquisavel com um método pesquisar(String palavraChave) que realiza uma pesquisa em um determinado recurso (por exemplo, um banco de dados). 
 * Em seguida, implemente essa interface em uma classe chamada PesquisaBancoDados que realiza uma pesquisa em um banco de dados.
 */
public class Ex7 {
    public interface Pesquisavel{
        void pesquisar(String palavraChave);
    }
    public class PesquisaBancoDados implements Pesquisavel{
        @Override
        public void pesquisar(String palavraChave){
            System.out.println("Pesquisando "+ palavraChave);
        }
    }
}
