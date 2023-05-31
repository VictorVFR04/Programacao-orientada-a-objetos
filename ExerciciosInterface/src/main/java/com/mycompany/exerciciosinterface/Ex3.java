/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciosinterface;

/**
* Crie uma interface chamada Armazenavel com dois métodos: salvar() e carregar(). 
* Em seguida, implemente essa interface em uma classe chamada ArquivoCache que salva e carrega dados de um arquivo no sistema de arquivos.
 */
public class Ex3 {
    
    public interface Armazenavel{
        void salvar();
        void carregar();
    }
    public class ArquivoCache implements Armazenavel{
        public String dados;
        @Override
        public void salvar(){
            System.out.println("Salvando " + dados);
        }
        @Override
        public void carregar(){
            System.out.println("Carregando " + dados);
        }
    }
}
