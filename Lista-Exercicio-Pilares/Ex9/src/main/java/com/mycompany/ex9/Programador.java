/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex9;

/**
 * Crie uma classe chamada "Programador" que herda da classe "Funcionario" e possui um atributo privado "linguagem". 
 * Utilize encapsulamento para permitir o acesso ao atributo "linguagem" por meio de métodos getters e setters.
 */
public class Programador extends Funcionario{
    private String linguagem;

    public String getLinguagem() {
        return linguagem;
    }

    public void setLinguagem(String linguagem) {
        this.linguagem = linguagem;
    }
}
