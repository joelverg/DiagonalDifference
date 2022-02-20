package com.problem2.dd.impl;

import java.util.List;

public class DiagonalDifference {
	
	public static void diagonalDifference (List<List<Integer>> arr) {
		
	    
	    int diagonal = 0;
	    for (int i = 0; i < arr.size(); i++) {
	        diagonal += arr.get(i).get(i);
	        diagonal -= arr.get(i).get(arr.size() - (i + 1));
	    }

	    
	    System.out.println(Math.abs (diagonal));
	}
		    
}
