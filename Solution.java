package com;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);

		Calculator cal=new CalculatorImpl();
		while(true) {
			System.out.println("1.Addition\n2.Subtraction\n3.Multiplication\n4.Division\n5.EXIT\nEnter your choice: ");
			int choice =scn.nextInt();

			int a=0;
			int b=0;

			if(choice>=1 && choice<=4) {
				System.out.println("Enter your value");
				a=scn.nextInt();
				b=scn.nextInt();
			}
			switch(choice){
			case 1:
				System.out.println("Sum of "+a+"&"+b+" is:"+cal.add(a,b));
				break;

			case 2:
				System.out.println("Difference of "+a+"&"+b+" is:"+cal.sub(a,b));
				break;

			case 3:
				System.out.println("Product of "+a+"&"+b+" is:"+cal.mul(a,b));
				break;

			case 4:
				int result=cal.div(a, b);   //cal.div(10,0) & cal.div(0,10)
				if(result!=0) {
				System.out.println("Division of "+a+"&"+b+" is:"+cal.div(a,b));
				}
				else {
					System.out.println("Cannot perform Division");
				}
				break;

			case 5:System.out.println("Thank You");
			System.exit(0);
			
			default:
				System.out.println(cal.displayErrorMessage());
			}
			System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		}
	}
}
