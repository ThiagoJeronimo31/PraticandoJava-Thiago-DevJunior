
package exercicio_092;

import java.util.Scanner;

public class Exercicio_092 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    
    double div;
        System.out.println("Vamos ver se o numero é divizivel por 3 e 7");
        System.out.println("Digite um numero aleatorio");
        div = teclado.nextDouble();
        
        if((div%3==0) && (div%7==0)){
            System.out.println("O numero é divizivel");
        }
        else{
            System.out.println("Ele não é divizivel meu amigo");
        }
        
    }
    
}
