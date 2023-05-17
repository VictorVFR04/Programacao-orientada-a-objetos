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
public class Veiculo {
    private String marca;
    private int ano;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
