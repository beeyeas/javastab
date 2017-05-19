/**
 * Author : beeyeas@gmail.com
 * Generate prime number for entered number
 */

package com.workspace;

import java.util.Scanner;
public class PrimeGenerator{
    public static void main (String args[]){
        PrimeGenerator gen = new PrimeGenerator();
        System.out.println("Enter the number of prime to generate : ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        int count = 1;
        int feeder = 1;
        while (count <= value){
            boolean isPrimeN = gen.isPrime(feeder);
            if (isPrimeN){
                count++;
            }
            System.out.println("Check if the number " + feeder + " is prime " + isPrimeN);
            feeder++;
        }
    }

    private boolean isPrime(int value){
        if (value<0) return false;
        if (value == 0 || value == 1) return false;
        if (value == 2 | value == 3) return true;
        for (int i=2; (i*i) <= value;i++ ){
            //System.out.println("Working on iteration : " + i);
            if (value%i == 0 ){
                return false;
            }
        }
        return true;
    }
}
