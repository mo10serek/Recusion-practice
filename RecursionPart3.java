/*
* Created by: Michael balcerzak
* Created on: 11-Nov-2016
* Created for: ICS3U
* weekly Assignment #5
* This program use recursion to produce all the letters in a phone number
*/

import java.util.Arrays;
import java.util.Scanner;

public class RecursionPart3 {

	public static int enter = 0;
	
	public static void ConvertToMessage(int counter, int[] phoneNumber, String message) {
		//This displays all the mesages that it produce
		
		if (phoneNumber.length < counter) {
			System.out.print(message + " ");
			enter = enter + 1;
			if (enter > 20) {
				System.out.println("");
				enter = 0;
			}
		} else {	
			if (phoneNumber[counter - 1] == 2) {
				ConvertToMessage(counter + 1, phoneNumber, message + "A");
				ConvertToMessage(counter + 1, phoneNumber, message + "B");
				ConvertToMessage(counter + 1, phoneNumber, message + "C");
			} else if (phoneNumber[counter - 1] == 3) {
				ConvertToMessage(counter + 1, phoneNumber, message + "D");
				ConvertToMessage(counter + 1, phoneNumber, message + "E");
				ConvertToMessage(counter + 1, phoneNumber, message + "F");
			}  else if (phoneNumber[counter - 1] == 4) {
				ConvertToMessage(counter + 1, phoneNumber, message + "G");
				ConvertToMessage(counter + 1, phoneNumber, message + "H");
				ConvertToMessage(counter + 1, phoneNumber, message + "I");
			} else if (phoneNumber[counter - 1] == 5) {
				ConvertToMessage(counter + 1, phoneNumber, message + "J");
				ConvertToMessage(counter + 1, phoneNumber, message + "K");
				ConvertToMessage(counter + 1, phoneNumber, message + "L");
			} else if (phoneNumber[counter - 1] == 6) {
				ConvertToMessage(counter + 1, phoneNumber, message + "M");
				ConvertToMessage(counter + 1, phoneNumber, message + "N");
				ConvertToMessage(counter + 1, phoneNumber, message + "O");	
			} else if (phoneNumber[counter - 1] == 7) {
				ConvertToMessage(counter + 1, phoneNumber, message + "P");
				ConvertToMessage(counter + 1, phoneNumber, message + "Q");
				ConvertToMessage(counter + 1, phoneNumber, message + "R");	
				ConvertToMessage(counter + 1, phoneNumber, message + "S");
			} else if (phoneNumber[counter - 1] == 8) {
				ConvertToMessage(counter + 1, phoneNumber, message + "T");
				ConvertToMessage(counter + 1, phoneNumber, message + "U");
				ConvertToMessage(counter + 1, phoneNumber, message + "V");		
			} else if (phoneNumber[counter - 1] == 9) {
				ConvertToMessage(counter + 1, phoneNumber, message + "W");
				ConvertToMessage(counter + 1, phoneNumber, message + "X");
				ConvertToMessage(counter + 1, phoneNumber, message + "Y");	
				ConvertToMessage(counter + 1, phoneNumber, message + "V");	
			}
		}
	}		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int[] phoneNumber = new int[7]; 
		int counter2 = 1;
		String message = " ";

		for (int counter = 1; counter <= phoneNumber.length; counter++) {
			System.out.println("put a number between 2 to 9 in digit " + counter);
			
			phoneNumber[counter - 1] = input.nextInt(); 
		}
		
		if ((phoneNumber[0] < 2) || (9 < phoneNumber[0]) || (phoneNumber[1] < 2) || (9 < phoneNumber[1]) || (phoneNumber[2] < 2) || (9 < phoneNumber[2]) || (phoneNumber[3] < 2) || (9 < phoneNumber[3]) || (phoneNumber[4] < 2) || (9 < phoneNumber[4]) || (phoneNumber[5] < 2) || (9 < phoneNumber[5]) || (phoneNumber[6] < 2) || (9 < phoneNumber[6])) {
			System.out.println("one of the digits is invaled");
		} else {
			System.out.println(Arrays.toString(phoneNumber));
			
			ConvertToMessage(counter2, phoneNumber, message);
		}
	}
}
