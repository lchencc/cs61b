public class LeapYear {

	/** IsLeapYear function*/
	public static boolean isLeapYear(int year) {
		boolean res = true;

		if (year % 400 == 0) {
			System.out.println(year + " is a leap year.");
		} else {
			if (year % 4 == 0 && year % 100 != 0) {
				System.out.println(year + " is a leap year.");
			} else {
				System.out.println(year + " is not a leap year.");
				res = false;
			}
		}

		return(res);
	}
	
	public static void main(String[] args) {
		int year = Integer.parseInt(args[0]);
		isLeapYear(year);
	}
}