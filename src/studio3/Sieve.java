package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter an n value");
		int n = scan.nextInt();
		
		int[] array = new int[n];
		
		//System.out.println(array[0]+" "+array[1]);
		
		for (int value = 0; value < array.length; value++) {
			if (array[value] == 0) {
				for (value; value < n; value++) {
					
				}
			}
		}
		
	}

}
