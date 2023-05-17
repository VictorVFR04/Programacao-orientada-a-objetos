/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex3;

/**
 *Crie uma classe chamada "ContaCorrente" que herda da classe "ContaBancaria" e possui 
 *um método para calcular o valor do cheque especial disponível para o titular da conta.
 */
public class ContaCorrente extends ContaBancaria{
    
    public void CalcularChequeEspecial(){
        System.out.println("Titular: "+getTitular()+"Valor Cheque Especial: ");
    }
}
