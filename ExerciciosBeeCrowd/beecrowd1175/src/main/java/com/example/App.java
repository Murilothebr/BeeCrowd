package com.example;

import java.io.IOException;
import java.lang.Thread.State;
import java.util.Scanner;

public final class App {
    static final int TAM = 20; //uso de constaints facilita a manutenção, se eu quisesse posteriormente mudar para 30, mudaria somente esta variavel
    static final int TAMArr = TAM - 1;

    public static void main(String[] args) throws IOException {
        int[] vetor = new int[TAM];

        vetor = insertData(vetor);
        vetor = invertVector(vetor);

        for(int i = 0; i < TAM; i++)
            System.out.println("index " +i+ " of vector = " +vetor[i]);
    }

    public static int[] insertData(int[] vetor){
        Scanner entry = new Scanner(System.in);

        for(int i = 0; i < TAM; i++){
            System.out.println("Digite o index: "+i);
            vetor[i] = entry.nextInt();
        }
        return vetor;
    }

    public static int[] invertVector(int[] vetor){
        int[] newVetor = vetor;
        for(int start = 0, end = TAMArr; start < (TAM / 2); start++, end--){
            int auxStart = vetor[start]; //Poderia usar só uma variavel, mas assim fica mais legivel
            int auxEnd = vetor[end];

            newVetor[start] = auxEnd;
            newVetor[end] = auxStart;
        }
        return newVetor;
    }
}
