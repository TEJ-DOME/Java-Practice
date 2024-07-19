package projects;

public class Greater {

	public static void main(String[] args) {
		//Finding Greater Number among the all.
		int a = 4;
		int b = 60;
		int c = 80;
		int d = 70;
		int e = 75;
		
		if (a > b && a > c && a > d && a > e) {
			System.out.println("Greater Number is a = "+a);
		}
		
			else if (b > c && b > d && b > e) {
				System.out.println("Greater Number is b = "+b);
			}
		
				else if (c > d && c > e) {
					System.out.println("Greater Number is c = "+c);
				}
		
					
					else if (d > e) {
						System.out.println("Greater Number is d = "+d);
					}
						
						else
							System.out.println("Greater Number is e = "+e);
			
	}

}
