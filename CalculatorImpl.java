package com;

public class CalculatorImpl implements Calculator {
	@Override
	public int add(int a,int b) {
		return a+b;
	}
	
	@Override
	public int sub(int a, int b) {
		return a-b;
	}

	@Override
	public int mul(int a, int b) {
		return a*b;
	}

	@Override
	public int div(int a, int b) { //a=10 b=0  or a=0 y=10
		if(a!=0 && b!=0) {
		return a/b;
		}
		return 0;
	}

	@Override
	public String displayErrorMessage() {
		return "Invalid Choice";
	}
}
