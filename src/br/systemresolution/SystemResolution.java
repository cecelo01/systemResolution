/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package br.systemresolution;

import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author Marce
 */
public class SystemResolution {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Toolkit Resolucao = Toolkit.getDefaultToolkit();
        Dimension d = Resolucao.getScreenSize();
        System.out.println("A altura da tela é: " + d.height);
        System.out.println("A largura da tela é: " + d.width);
    }

}
