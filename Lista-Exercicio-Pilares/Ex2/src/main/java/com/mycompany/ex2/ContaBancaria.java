/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex2;

/**
 * Crie uma classe chamada "ContaBancaria" com atributos privados, 
 * como "saldo" e "titular". Utilize encapsulamento para permitir o 
 * acesso a esses atributos por meio de métodos getters e setters.
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
