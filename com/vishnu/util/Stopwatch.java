package com.vishnu.util;

public class Stopwatch {
	
	private static double startTime;
	
	public static void start()
	{
		startTime = System.currentTimeMillis();
	}

	public static double end() {
        return (System.currentTimeMillis() - startTime) / 1000.0000000000;
    }
}
