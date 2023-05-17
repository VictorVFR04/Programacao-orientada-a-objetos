/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex5;

/**
 * Crie uma classe chamada "Gerente" que herda da classe "Funcionario" e possui um atributo privado "bonus". 
 * Utilize encapsulamento para permitir o acesso ao atributo "bonus" por meio de métodos getters e setters.
 */
public class Gerente extends Funcionario{
    private double bonus;
    
    public double getBonus(){
        return bonus;
    }
    
    public void setBonus(double bonus){
        this.bonus = bonus;
    }
}
