/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pii_exercicio;

import java.util.Scanner;


public class Pii_exercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double raio; 
        double perimetro;
        double area;
        double pi = Math.PI; 
        System.out.println("Calculo do Perimetro e a Area de um circulo");
        
        System.out.println("Digite o valor do raio: ");
        raio = teclado.nextDouble();
        
        area = pi * (raio*raio);
        perimetro = (pi*2) * raio;
        
        System.out.println("O valor do perimetro é =" + perimetro+"cm²");
        System.out.println("O resultado da area é ="+ area+"cm²");
        
    }
    
}
