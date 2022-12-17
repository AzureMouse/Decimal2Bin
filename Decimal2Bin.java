/**
 * File:		Decimal2Bin.java
 * Project:		Learning:
 * Date:		12/17/22
 * Author:		AzureMouse
 * Description:
 * Takes positive integer numbers and converts them to their binary representation
 *
**/

import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Stack;

public class Decimal2Bin{

	public static int inputValidation(Scanner obj){
		boolean isRunning = true;
		int stdin = 0;

		do{
			System.out.println("Please enter a valid number");

			try{
				stdin = obj.nextInt();
				break;

			} catch(Exception e){
				System.out.println("Invalid input, try again!");
				isRunning = false;
				obj.next();

			}

		} while(!isRunning);

		return stdin;
	}

	public static void binaryNumber(int number){
		int currentNumber = number;
		Stack<Integer> stack = new Stack();

		while(number > 0){
			int remainder = number % 2;
			stack.push(remainder);
			number /= 2;
		}
		
		System.out.println("Binary Number represnetation of " + currentNumber) ;

		while(!stack.empty()){
			System.out.print(stack.peek());
			stack.pop();
		}
	}


	// Main entry point of the program 
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int val = inputValidation(input);
		binaryNumber(val);
	}
}
