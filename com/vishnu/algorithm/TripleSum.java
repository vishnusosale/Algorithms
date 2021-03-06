/**
 * The MIT License (MIT)

Copyright (c) 2015 Vishnu Sosale

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
 */

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
		int size;
		Scanner sc;
		int[] integers;
		
		System.out.println("Enter number of integers");
		sc = new Scanner(System.in);
		size = sc.nextInt();
		integers = new int[size];
		
		System.out.println("Enter " + size + " integers");
		
		for(int i = 0; i<size; i++)
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
	 * Checks all the elements of the array for a triple.
	 * Returns number of triples in a given array
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
