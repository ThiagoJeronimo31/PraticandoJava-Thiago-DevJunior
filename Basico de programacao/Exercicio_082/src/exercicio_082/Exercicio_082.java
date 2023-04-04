
package exercicio_082;

import java.util.Scanner;


public class Exercicio_082 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Scanner teclado = new Scanner(System.in);
      
      int n1; 
      
        System.out.println("Lendo um numero e informando se é menor que 20");
        
        System.out.println("Digite um numero, Querido Usuario");
        n1 = teclado.nextInt();
        
        if(n1 < 20){
            System.out.println("O numero informado é menor que 20");
        }
        else {
            System.out.println("O numero digitado é igual ou maior que 20");
        }

    }
    
}
