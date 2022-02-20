package com.problem2.dd;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

import com.problem2.dd.entity.Given;
import com.problem2.dd.impl.DiagonalDifference;

import java.util.stream.*;
import static java.util.stream.Collectors.toList;

public class DdApplication {

	public static void main(String[] args) throws IOException {
		
		BufferedReader bufferedReader = new BufferedReader(
				new InputStreamReader(System.in));
        
        int n = Integer.parseInt(bufferedReader.readLine().trim());
  
        Given given = new Given();
        
        given.setNumberOfRows(n);
               
        List<List<Integer>> arr = new ArrayList<>();

        IntStream.range(0, given.getNumberOfRows()).forEach(i -> {
            try {
                arr.add(Stream.of(bufferedReader.readLine()
                    	.replaceAll("\\s+$", "").split(" "))
                        .map(Integer::parseInt)
                        .collect(toList())
                );
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });
        bufferedReader.close();
        
        given.setSquareMatrix(arr);
        
        DiagonalDifference.diagonalDifference(
        		given.getSquareMatrix());

	}

}
