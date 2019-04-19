package com.junitexamples;

import java.util.regex.Matcher; 
import java.util.regex.Pattern;

public class Vector {

	public int[][] multiplication(int[] firstVector, int[] secondVector) {
		
		int[][] multiplication = new int[firstVector.length][secondVector.length];
		for(int i = 0; i < firstVector.length; i++) {
		    for(int j = 0; j < secondVector.length; j++){
		    	multiplication[i][j] = firstVector[i] * secondVector[j];
		    }
		}
		
		return multiplication;
		
	}
	
	public int[] fibonacci(int arrayLength) {
		
		int previousNumber = 0;
		int nextNumber = 1;
		
		int[] fibonacciArray = new int[arrayLength];
		
		for (int i = 0; i < arrayLength; ++i)
        {

            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
            
            fibonacciArray[i] = sum;
            
        }
		
		return fibonacciArray;
		
	}
	
	public static void main(String args[]){
		
	}
	
}
