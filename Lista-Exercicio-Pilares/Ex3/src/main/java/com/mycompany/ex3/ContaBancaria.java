/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex3;

/**
 *Crie uma classe chamada "ContaCorrente" que herda da classe "ContaBancaria" e possui 
 *um método para calcular o valor do cheque especial disponível para o titular da conta.
 */
public class ContaBancaria {
    
    private double saldo;
    private String titular;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }
    
}
