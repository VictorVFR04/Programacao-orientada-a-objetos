/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex10;

/**
 * Crie uma classe chamada "Veiculo" com atributos privados, como "marca" e "ano".
 * Utilize encapsulamento para permitir o acesso a esses atributos por meio de métodos getters e setters.
 * Em seguida, crie uma classe chamada "Carro" que herda da classe "Veiculo" e possui um atributo privado "cor". 
 * Utilize encapsulamento para permitir o acesso ao atributo "cor" por meio de métodos getters e setters.
 */
public class Carro extends Veiculo{
    private String cor;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}
