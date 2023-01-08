package com.example;

import java.util.Scanner;

/**
* Hello world!
*/
public final class App {
    static Scanner entry = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        
        int primeiroNumero = entryIntAndPrint("digite o primeiro numero");
        int segundoNumero = entryIntAndPrint("digite o segundo numero");
        
        char[] primeiro = String.valueOf( primeiroNumero ).toCharArray();
        char[] segundo = String.valueOf( segundoNumero ).toCharArray();
        
        int somaPrimeiroDigitos = somaChar(primeiro);
        int somaSegundoDigitos = somaChar(segundo);

        if(somaPrimeiroDigitos > somaSegundoDigitos)
            System.out.println("1");
            
        else if(somaPrimeiroDigitos < somaSegundoDigitos)
        System.out.println("2");

        else System.out.println("0");

        
    }
    public static int entryIntAndPrint(String s){
        System.out.println(s);
        return entry.nextInt();
    }
    
    public static int somaChar(char[] digitos){
        int soma = 0;
        for(char i : digitos)
            soma += Character.getNumericValue(i);
        
        return soma;
    }
}
