package org.main.MyPrograms;

import java.util.Scanner;

public class SimpleCalculator {
public static void main(String []args) {
	int res;
	Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
	int b = sc.nextInt();
			
		System.out.println("Sum is "+(a+b));		
		System.out.println("Sub is "+(a-b));
		System.out.println("Product is "+(a*b));
		System.out.println("div is "+(a/b));	
		System.out.println("Modulus of"+a+" and "+b +"is  "+(a%b));
//	else {
//		System.out.println("Give a valid input");
//	}

sc.close();
}

}
