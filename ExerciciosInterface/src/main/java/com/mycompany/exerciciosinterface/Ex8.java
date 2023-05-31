/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exerciciosinterface;

/**
* Crie uma interface chamada Renderizavel com um método renderizar() que renderiza um objeto gráfico na tela. 
* Em seguida, implemente essa interface em uma classe chamada RenderizadorOpenGL que utiliza a biblioteca OpenGL para renderização gráfica.
 */
public class Ex8 {
    public interface Renderizavel{
        void redenrizar();
    }
    public class RenderizadorOpenGL implements Renderizavel{
        @Override
        public void redenrizar(){
            
        }
    }
}
