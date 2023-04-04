
package exercicio_084;

import java.util.Scanner;


public class Exercicio_084 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);

double n1; 

        System.out.println("Vendo se um numero é impar ou par");
        
        System.out.println("Digite um numero ");
        n1 = teclado.nextDouble();
        
        if(n1%2==0){
            System.out.println("O numero digitado é par");
        }
        else{
            System.out.println("O numero digitado é impar");
        }

    }
    
}
