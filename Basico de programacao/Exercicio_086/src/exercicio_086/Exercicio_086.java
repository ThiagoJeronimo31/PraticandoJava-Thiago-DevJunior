
package exercicio_086;

import java.util.Scanner;

public class Exercicio_086 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.println("Vendo se o numero é negativo, positvo ou zero");
        
        System.out.println("Digite um numero aleatorio");
        num = teclado.nextInt();
        
        if(num==0){
            System.out.println("O numero é um zero gênio");
        }
        else if(num>0){
            System.out.println("O numero é positivo");
        }
        else{
            System.out.println("O numero é negativo");
        }
    }
    
}
