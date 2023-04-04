
package exercicio_2;

import java.util.Scanner;


public class Exercicio_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Scanner teclado = new Scanner(System.in);
        double num1;
        double num2; 
        
        System.out.println("Vendo se os numeros digitados são....");
        System.out.println("Multiplos de 5 e 8 ");
        
        System.out.println("Digite o primeiro numero");
        num1 = teclado.nextDouble();
        
        System.out.println("Digite o segundo numero");
        num2 = teclado.nextByte();
        
        if((num1%5==0 && num1%8==0) && (num2%8==0 && num2%5==0)){
            
            System.out.println("Os numero são diviziveis por 5 e 8");
            
        }
        
        else if((num1%5==1 && num1%8==1) && (num2%8==0 && num2%5==0 )){
            
            System.out.println("O "+num1+" não é divizivel por 5 e 8, mas "+num2+" é divizivel por eles");
        }
       
        else if((num1%5==0 && num1%8==0) && (num2%8==1 && num2%5==1 )){
            
            System.out.println("O "+num1+" é divizivel por 5 e 8, mas "+num2+" não é divizivel por eles");
        }
    
        else{
            System.out.println("Os numeros não são diviziveis por 5 e 8 ");
        }
        
    // RA: 2090782221009
    // Nome: Thiago Pereira Jeronimo
    // Data: 26/09/2022
    
        
        
    }
    
}
