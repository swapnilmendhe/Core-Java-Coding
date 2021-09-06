package com.swap.realifeJavaCode;

import java.util.Scanner;

public class ATM {

	int withdraw;

	double initialBalance;
	Scanner in = new Scanner(System.in);

	public void accountBalance(Scanner in) {

		if (withdraw % 5 == 0 && initialBalance > (withdraw + 0.5)) {

			System.out.println(initialBalance - (withdraw + 0.5));
		} else {
			System.out.println(initialBalance);
		}
	}

	public static void main(String[] args) {
		ATM atm = new ATM();
		atm.withdraw = 300;
		atm.initialBalance = 120.0;
		atm.accountBalance(atm.in);
        
	}

}
