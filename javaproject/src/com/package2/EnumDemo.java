package com.package2;

import java.io.Console;
import java.util.Scanner;

enum Year2023MonthDays {
	January(31), February(28), March(31), April(30), May(31), June(30), July(31), August(31), September(30),
	October(31), November(30), December(31);

	int daysForAmonth;

	Year2023MonthDays(int daysForAmonth) {
		this.daysForAmonth = daysForAmonth;
	}

	public int getDaysForAmonth() {
		return daysForAmonth;
	}

}

public class EnumDemo {

	public static void main(String[] args) {
		new DaysInaMonthForAYear().daysInAmonth();
		Scanner input = new Scanner(System.in);

		Console console = System.console();
		String username = "";
		String password = "";
		if (console == null) {
			System.out.print("Enter username: ");
			username = input.nextLine();
			System.out.print("Enter password: ");
			password = input.nextLine();
		} else {
			username = console.readLine("Enter username: ");
			password = new String(console.readPassword("Enter password: "));
		}
	}

}

class DaysInaMonthForAYear {

	void daysInAmonth() {
		System.err.println("2023 Year");
		for (Year2023MonthDays days : Year2023MonthDays.values()) {
			System.out.println(days.getDaysForAmonth() + " Days in the month of " + days);
		}
	}
}