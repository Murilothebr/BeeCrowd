package com.example;

import java.util.Scanner;

public final class App {
    
    public static void main(String[] args) {
        final int TAM = 5;
        Scanner entry = new Scanner(System.in);
        
        int[] even = new int[TAM];
        int[] odd = new int[TAM];
        
        int evenCount = 0, oddCount = 0;
        for(int i = 0; i < 15; i++){
            int value = entry.nextInt();

            if (value % 2 == 0) {
        		even[evenCount] = value; 
        		evenCount++;
        	} else {
        		odd[oddCount] = value;
        		oddCount++;
        	}
        	
        	if (evenCount == 5) {
        		evenCount = 0;
                printArr(even, "par");
        	} 
            if (oddCount == 5) {
        		oddCount = 0;
        		printArr(odd, "impar");
        	}
        }
        
        for (int i = 0; i < evenCount; i++) 
			System.out.println("par[" + i + "] = " + even[i]);
        
        for (int i = 0; i < oddCount; i++) 
			System.out.println("impar[" + i + "] = " + odd[i]);
        
        entry.close();
    }
    
    public static void printArr(int[] arr, String evenOrOdd){
        for (int i = 0; i < arr.length; i++) 
        System.out.println(evenOrOdd + "[" +i+ "]" + "=" + arr[i]);
    }
}
