
package exercicio_101;

import java.util.Scanner;


public class Exercicio_101 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner teclado = new Scanner(System.in);
       double n;
       
        System.out.println("O numero é compreendido entre 20 e 90? é o que veremos");
        System.out.println("Digite um numero, querido colega");
        n = teclado.nextDouble();
        
        if(n>20 && n<90){
            System.out.println("O numero é compreendido");
        }
        else{
            System.out.println("Não é compreendido");
        }
    }
    
}
