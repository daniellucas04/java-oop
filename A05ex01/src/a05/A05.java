/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a05;

import java.util.Scanner;

/**
 *
 * @author ALUNO
 */
public class A05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        float nota1 = input.nextFloat();
        
        System.out.println("Digite a segunda nota: ");
        float nota2 = input.nextFloat();
        
        float media = (nota1+nota2)/2;
        String res = "Aprovado!";
        
        if(media < 6)
            res = "Reprovado!";
        
        System.out.println("Média :" + media + " / Resultado: " + res);
    }
    
}
