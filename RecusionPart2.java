/*
* Created by: Michael balcerzak
* Created on: 11-Nov-2016
* Created for: ICS3U
* weekly Assignment #5
* This program use recursion to make a tree dagram in a line
*/

import java.util.Scanner;

public class RecusionPart2 {

	public static void TreeGraph(int treePoints) {
		//this displays all the number in the grath
		if (0 < treePoints) {
			TreeGraph(treePoints - 1);
			System.out.print(" " + treePoints);
			TreeGraph(treePoints - 1);
		}
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int treePoints;
		
		System.out.println("put a number that will split to the number you put");
		treePoints = input.nextInt();
		
		TreeGraph(treePoints);

	}

}
