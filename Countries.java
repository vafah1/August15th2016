package com.assignmentaugfifteen;

import java.util.Scanner;

public class Countries {

	Scanner sc = new Scanner(System.in);
	String cRead = null;
	String cWrite = null;
	String menu = null;
	int choice = 0;

	public static void main(String[] args) {
		Countries newCountriesRun = new Countries();
		newCountriesRun.runCountries();

	}

	public void runCountries() {
		System.out.println("\n" + menu);

		choice = sc.nextInt();

		switch (choice) {
		case 1:
			ReadAndWrite read = new ReadAndWrite();
			read.reader();
			runCountries();

		case 2:
			ReadAndWrite write = new ReadAndWrite();
			write.writer();
			runCountries();
		case 3:
			System.exit(0);
		}

	}
	public Countries(){
		menu = "Countries List"
				+ "\n Please select from the list: "
				+ "\n(1) Display a list of countries"
				+ "\n(2) Add a country to the list"
				+ "\n(3) Exit the application";
	}
}

