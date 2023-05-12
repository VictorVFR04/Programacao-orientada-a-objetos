/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculadora;

/**
 *
 * @author victor.ramos1
 */
public class Calculadora {

    public static void main(String[] args) {
        CalculadoraInt calculadoraInt = new CalculadoraInt();
        calculadoraInt.CalcularInt();
        
        CalculadoraDouble calculadoraDouble = new CalculadoraDouble();
        calculadoraDouble.CalcularDouble();
        
        CalculadoraArray calculadoraArray = new CalculadoraArray();
        calculadoraArray.CalcularArray();
    }
}
