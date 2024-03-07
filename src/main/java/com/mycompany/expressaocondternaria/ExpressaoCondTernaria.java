package com.mycompany.expressaocondternaria;

import java.util.Scanner;

public class ExpressaoCondTernaria {

public static void main(String[] args) {
        
        Scanner teclado = new Scanner (System.in);
        
        
        
        System.out.println("Digite um valor");
        
        double preco = teclado.nextDouble();
        double desconto;
        
   
    desconto = (preco < 20.0) ? (preco * 0.1) : (preco * 0.05);
    System.out.println("R$" + desconto + " de desconto ");   
        
        
        
        
    }
}
