package projects;

public class LeapYear {

	public static void main(String[] args) {
		//Finding Leap Year.
		//Rule is, the year should be divided by 4 or 400.
		
		int y = 1947;
		
		if (y%4==0 || y%400==0){
			System.out.println(y + " Is a Leap Year.");
		}
		else
			System.out.println(y + " Is not a Leap Year.");
	}

}
