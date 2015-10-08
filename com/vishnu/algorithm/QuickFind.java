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

/***
 * 
 * @author vishnu
 *
 */

public class QuickFind {
	
	private int[] id;
	
	/**
	 * Quick Find is an Eager algorithm which is used to solve dynamic connectivity problems
	 * Two nodes are said to be connected iff they have same entry points, here same ids
	 * @param arraySize
	 */
	public QuickFind(int arraySize)
	{
		id = new int[arraySize];
		for(int i = 0; i<arraySize; i++)
		{
			id[i] = i;
		}
	}
	
	public boolean isConnected(int m, int n)
	{
		return id[m] == id[n];
	}
	
	public void union(int m, int n)
	{
		int mId = id[m];
		int nId = id[n];
		for(int i = 0; i<id.length; i++)
		{
			if(id[i] == mId)
			{
				id[i] = nId;
			}
		}
	}

}
