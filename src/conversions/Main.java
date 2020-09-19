/*
 * This program performs binary to hexadecimal conversions
 * Created by Michael Janks
 * September 19, 2020
 */


package conversions;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BinaryDecimal bd = new BinaryDecimal();
		BinaryHexadecimal bh = new BinaryHexadecimal();
		int response;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter 1 to convert binary to decimal");
		System.out.println("Enter 2 to convert binary to hexadecimal");
		System.out.println("Enter any other integer to quit");
		System.out.print("Enter choice: ");
		response = keyboard.nextInt();
	
		while(response == 1 || response == 2 ) {
			switch(response) {
			case 1:
				System.out.print("Enter binary, up to 16 bits (non-binary characters treated as zeros): ");
				String bin;
				bin = keyboard.next();
				if(bin.length() > 16) {
					System.out.println("Too many bits!");
					break;
				}
					System.out.println("The number in decimal is: " + bd.binToDec(bin));
					System.out.print("Again (y/n)? ");
					if(!keyboard.next().equals("y")) {
						response =-1;
						break;
					}
					System.out.println("Enter 1 to convert binary to decimal");
					System.out.println("Enter 2 to convert binary to hexadecimal");
					System.out.println("Enter any other integer to quit");
					System.out.print("Enter choice: ");
					response = keyboard.nextInt();
					break;
					
			case 2:
				System.out.print("Enter binary: ");
				String bin2 = keyboard.next();
				System.out.println("The number in hexadecimal is: " + bh.binToHex(bin2));
				System.out.print("Again (y/n)? ");
				if(!keyboard.next().equals("y")) {
					response =-1;
					break;
				}
				System.out.println("Enter 1 to convert binary to decimal");
				System.out.println("Enter 2 to convert binary to hexadecimal");
				System.out.println("Enter any other integer to quit");
				System.out.print("Enter choice: ");
				response = keyboard.nextInt();
				break;
			}
		}
		System.out.println("Program Terminated.");
		keyboard.close();
	}
}
