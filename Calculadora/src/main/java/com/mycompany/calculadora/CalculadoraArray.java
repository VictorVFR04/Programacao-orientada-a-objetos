/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculadora;
import java.util.Arrays;

/**
 *
 * @author victor.ramos1
 */
public class CalculadoraArray {
    int[] numeros = {10, 4, 6, 2, 8};
    int resultadoArray = 0;
    
    public void CalcularArray(){
        resultadoArray = Arrays.stream(numeros).sum(); 
        System.out.println("O resultado é " + resultadoArray); // O RESULTADO PRECISA DAR 30
    }
    
}
