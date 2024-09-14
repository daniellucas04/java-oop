/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a05ex04;

/**
 *
 * @author ALUNO
 */
public class A05ex04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if(args.length < 4) {
            System.out.println("São necessários 4 argumentos: duas notas do aluno, numero de aulas e o numero de faltas.");
        }else{
            float nota1 = Float.parseFloat(args[0]);
            float nota2 = Float.parseFloat(args[1]);
            int aulas = Integer.parseInt(args[2]);
            int faltas = Integer.parseInt(args[3]);
            
            float media = (nota1+nota2)/2;
            float porcentagem = (100*faltas)/aulas;
            float frequencia = 100 - porcentagem;
            
            String res = "Aprovado!";
            
            if(media < 6)
                res = "Reprovado!";
            
            if(frequencia < 75)
                res = "Reprovado!";
            
            System.out.println("Media: " + media  + " / Frequência: " + frequencia + " / Resultado: " + res);
        }
    }
    
}
