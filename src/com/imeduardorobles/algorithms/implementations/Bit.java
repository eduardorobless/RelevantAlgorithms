package com.imeduardorobles.algorithms.implementations;

public class Bit{
    public static int brianKernighan(int n){
        int count = 0;
        while(n!=0){
            count++; 
            n = n & (n -1); 
        }
        return count; 
    }
}