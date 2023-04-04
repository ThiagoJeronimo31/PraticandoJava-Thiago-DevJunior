package exercicio_1;

import java.util.Scanner;


public class Exercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
     Scanner teclado = new Scanner(System.in);   
     
     double n1;
     double n2; 
     
        System.out.println("Descobrindo se o numero está entre 100 e 200");
        System.out.println("e se é par");
        
        System.out.println("E o segundo numero descobriremos se é impar");
        System.out.println("e menor que zero");
        
        System.out.println("Digite o primeiro numero");
        n1 = teclado.nextDouble();
        
        System.out.println("Digite agora o segundo numero");
        n2 = teclado.nextDouble();
        
        if(n1%2==0 && n1>100 && n1<200){
            System.out.println("O numero digitado é par e está entre 100 e 200");
        }
        
        else if(n1%2==0 && n1>100 != n1<200 ){
            System.out.println("O numero é par, mas não está entre 100 e 200");
        }
        
        else if(n1%2==1 && n1>100 && n1<200){
            
            System.out.println("O numero não é par, mas está entre 100 e 200");
        }
        
        else{
            System.out.println("O numero não é par e nem está entre 100 e 200");
        }
        
        
        if (n2%2!=0 && n2<0){
            System.out.println("O numero é impar e menor que 0");
        }
        
        else if(n2%2==1 && n2>0){
            System.out.println("O numero é impar e maior que zero");
        }
        
        else if(n2%2!=1 && n2<0){
            System.out.println("O numero não é impar, mas é menor que zero");
        }
        else{
            System.out.println("O numero não é impar e nem menor que zero ");
        }
    }
    
    // RA: 2090782221009
    // Nome: Thiago Pereira Jeronimo
    // Data: 26/09/2022
    
    
}
