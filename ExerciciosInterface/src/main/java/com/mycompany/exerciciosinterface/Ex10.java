/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciosinterface;

import java.util.Scanner;

/**
* Crie uma interface chamada Executavel com um método executar() que realiza uma determinada ação.
* Em seguida, implemente essa interface em uma classe chamada ExecutorComandos que executa comandos do sistema operacional fornecidos como strings.
 */
    public class Ex10 {
        public interface Executavel{
            void executar();
        }
        public class ExecutorComandos implements Executavel{
            @Override
            public void executar(){
                Scanner ler = new Scanner(System.in);
                System.out.println("Digite alguma coisa: ");
                String resp = ler.nextLine();
                if(resp != null){
                   System.out.println(); 
                }
            }
        }
    }
