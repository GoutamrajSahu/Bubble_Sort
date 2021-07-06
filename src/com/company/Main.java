package com.company;

import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
        System.out.println("Input the number of elements going to be there: ");
        int length = Sc.nextInt();
        int arr[] = new int[length];
        for(int i=0; i<length; i++){
            arr[i] = Sc.nextInt();
        }
        System.out.println("The original array: ");
        for(int i=0; i<length; i++){
            System.out.print(arr[i]);
        }
        System.out.println("\n");

        for(int i = 0; i < length-1; i++){
            for(int j = 0; j < length-1 - i; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("The Sorted arr: ");
        for(int i = 0; i < length; i++){
            System.out.println(arr[i]);
        }
    }
}
