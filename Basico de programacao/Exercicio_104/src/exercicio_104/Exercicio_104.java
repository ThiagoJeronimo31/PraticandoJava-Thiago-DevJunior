/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio_104;

import java.util.Scanner;

/**
 *
 * @author Thiago Jeronimo
 */
public class Exercicio_104 {
    private static Object scanner;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      char s;
      int idade;
      String nome; 
      
      
        System.out.println("Bem vindo ao nosso sistema, para verificar a sua situação");
        
        System.out.println("Digite o seu nome?");
        nome = teclado.nextLine();
        
        System.out.println("Digite a sua idade");
        idade = teclado.nextInt();
        
        System.out.println("Seu sexo (Utilizar F ou M)");
        s = teclado.next().charAt(0);
        
        if(s == 'F' && idade < 25 || s == 'f' && idade <25 ){
            
            System.out.println(nome + " Você foi aceita, Parabéns!");
            
        }
          
        else{
            System.out.println(nome + " Infelizmente não foi aceita.");
        }
        
        
       
    }
    
}
