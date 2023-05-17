/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex6;

/**
 * Crie uma classe chamada "Pessoa" com atributos privados, como "nome" e "idade".
 * Utilize encapsulamento para permitir o acesso a esses atributos por meio de métodos getters e setters.
 */
public class Pessoa {
    private String nome;
    private int idade;
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    public void setIdade(int idade){
        this.idade = idade;
    }
}
