package exceptionhandling;

import java.util.Scanner;

public class Calculator {
	
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
	
		System.out.println("please enter a number:");
		int num1 = k.nextInt();
		
		System.out.println("please enter another number:");
		int num2 = k.nextInt();
		
		System.out.println("result of division =" +(num1/num2));
	}

}
