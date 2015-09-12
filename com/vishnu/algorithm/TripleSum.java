package com.vishnu.algorithm;

import java.util.Scanner;

import com.vishnu.util.Stopwatch;

/***
 * 
 * @author vishnu
 *
 */

public class TripleSum {
	
	public static void main(String[] args)
	{
		int noOfInput;
		Scanner sc;
		int[] integers;
		
		System.out.println("Enter number of integers");
		sc = new Scanner(System.in);
		noOfInput = sc.nextInt();
		integers = new int[noOfInput];
		
		System.out.println("Enter " + noOfInput + " integers");
		
		for(int i = 0; i<noOfInput; i++)
		{
			integers[i] = sc.nextInt();
		}
		
		sc.close();
		
		Stopwatch.start();
		System.out.println("Number of Triple Sums are: " + calculateTripleSum(integers));
		System.out.println("Total time elapsed = " + Stopwatch.end());
	}
	
	/***
	 * This is a Brute force algorithm.
	 * Checks all the elements of the array to check for triple.
	 * @param integers
	 * @return 
	 */
	private static int calculateTripleSum(int[] integers)
	{
		int count = 0;
		
		for(int i = 0; i<integers.length; i++)
		{
			for(int j = i+1; j<integers.length; j++)
			{
				for(int k = j+1; k<integers.length; k++)
				{
					if(integers[i] + integers[j] + integers[k] == 0)
					{
						count++;
					}
				}
			}
		}
		
		return count;
	}
}
