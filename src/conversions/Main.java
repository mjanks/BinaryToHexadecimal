package conversions;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		BinaryDecimal bd = new BinaryDecimal();
		int response;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("Enter 1 to convert binary to decimal");
		//System.out.println("Enter 2 to convert decimal to binary");
		System.out.println("Enter any other integer to quit");
		System.out.print("Enter choice: 1");
		//response = keyboard.nextInt();
		response = 1;
		System.out.println();
	
		while(response == 1 /* || response == 2 */ ) {
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
						response = 2;
						break;
					}
					break;
					
//			case 2:
//				System.out.print("Enter decimal: ");
//				int dec = keyboard.nextInt();
//				System.out.println("The number in binary is: " + bd.decToBin(dec));
//				System.out.println();
//				break;
					
			}
		}
		System.out.println("Program Terminated.");
		keyboard.close();
	}
}
