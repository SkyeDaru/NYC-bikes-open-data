package edu.cs.nyu.hsd262;



import java.util.Arrays;


/* Welcome to the Manhattan Bike Count app. The data source for this app can be found here:
 * https://data.cityofnewyork.us/Transportation/NYCDCP-Manhattan-Bike-Counts-On-Street-Weekday/qfs9-xn8t
 * This program will show you the total number of bike users on the street during the weekday
 * per year in Manhattan
  */

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;




public class OpenData {
	

	public static void main(String[] args) {
		
		String csvFile = "src/bike_count.csv";
		String str = "";
		String csvSplit = ",";
		String[][] data = new String[108][8];
		int counter = 0;
		
		

		try  (BufferedReader foo = new BufferedReader(new FileReader("src/bike_count.csv"))) {
			
			while ((str = (String) foo.readLine()) != null) {
				String[] values = str.split(csvSplit);
				
				
				for(int i = 0; i < data[0].length; i++) {
					data[counter][i] = values[i];
				}

				counter++;
				
			} //end of while loop	
		}	
	 catch (IOException x) {
		x.printStackTrace();
	}
	
		for (int i = 0; i < data.length; i++) {
			for(int j = 0; j < data[0].length; j++) {
				
				  // System.out.print(data[i][j]);
				  // System.out.print("    ");
			}
			  System.out.println();
		}
		
		System.out.println("Please enter one of the following streets to search: Second Avenue, Lafayette Street, Fifth Avenue at 14 St., Sixth Avenue at W23 St., Broadway at W28 St., Eigth Avenue at W28 St., Fifth Avenue at E85 St., Central Park at W93 St.");
		Scanner response = new Scanner(System.in);
		String input = response.nextLine();

		
		System.out.println("SHOWING RESULTS FOR THE NUMBER OF BIKES ON " + input + "..." );
		
		for (int i = 0; i < data.length; i++) {
		if (input.trim().equalsIgnoreCase(data[i][3].trim())) {
			
			System.out.println("Year: " + data[i][6] + "    " + "Number of Bikes: " + data[i][7]);	
		}
		}
		response.close();

		
	}//end of main
} //end of program



				
				
					
					
					
				
				
				
		
				
				
				
				
				
				
				
		
	
	

	
	

	
		

	

	
	

	
	
	
	
	
	
	

	

	
	
	
	
	


		


		

