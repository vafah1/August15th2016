package com.assignmentaugfifteen;

public class CountryValidator {

	public static boolean validator(String menuInput) {
		if (menuInput.equals("1") || menuInput.equals("2") || menuInput.equals("3") ) {
			try {
				int number = Integer.parseInt(menuInput);
				return false;
			} catch (NumberFormatException e) {
				e.printStackTrace();
				return true;
			}
		}
		return false;
	}
}	



