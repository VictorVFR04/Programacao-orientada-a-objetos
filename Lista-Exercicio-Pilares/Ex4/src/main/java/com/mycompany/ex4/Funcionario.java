/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex4;

/**
 * Crie uma classe chamada "Funcionario" com atributos privados, como "nome" e "salario". 
 * Utilize encapsulamento para permitir o acesso a esses atributos por meio de métodos getters e setters.
 */
public class Funcionario {
    private String nome;
    private double salario;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
}
