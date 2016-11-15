/*
* Created by: Michael balcerzak
* Created on: 11-Nov-2016
* Created for: ICS3U
* weekly Assignment #5
* This program use recursion to make a hourglass with stars
*/

import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class RecusionPart1 extends JFrame {
	
	public static void PrintDots(int numberOfDots, int space) {
		//This function prints the number of dots
		if (numberOfDots > 1) {
			//number of starting spaces
			for (int counter = 0; counter < space; counter++) {
				System.out.print(" ");
			}
			//number of dots
			for (int counter = 0; counter < numberOfDots; counter++) {

				System.out.print("* ");
			}
			System.out.println("");
			numberOfDots = numberOfDots - 1;
			PrintDots(numberOfDots, space + 1 );
			space = space + 1;
			//number of starting spaces
			for (int counter = 0; counter < space; counter++) {
				System.out.print(" ");
			}
			//number of dots
			for (int counter = 0; counter < numberOfDots; counter++) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int numberOfDots;
		int space = 1;
		
		System.out.println("put the number of dots that are on the top");
		
		numberOfDots = input.nextInt();
		
		PrintDots(numberOfDots, space);
		
		for (int counter = 1; counter <= numberOfDots; counter++) {
			System.out.printf(" *");
		}
		System.out.println("");
	}

}
