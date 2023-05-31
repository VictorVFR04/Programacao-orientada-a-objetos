/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciosinterface;
import java.util.Arrays;

/**
* Crie uma interface chamada Ordenavel com um método ordenar() que recebe um array de inteiros e o ordena em ordem crescente.
* Em seguida, implemente essa interface em uma classe chamada BubbleSort que implementa o algoritmo de ordenação Bubble Sort.
 */
public class Ex2 { 
    public interface Ordenavel{
        void ordenar(int num[]);
    }
    
    public class BubbleSort implements Ordenavel{
        @Override
        public void ordenar(int num[]){
            int numeros = num.length;
            for(int i = 0; i < numeros - 1; i++){
                for (int j = 0; j < numeros - i - 1; j++)
                    if (num[j] > num[j + 1]){
                
                  int temp = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = temp;
                }
            }
        }
    } 
    
}
