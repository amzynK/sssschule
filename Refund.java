package refund;

import java.util.Scanner;

public class Refund {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Is your flight in 72 hours from now?");
		System.out.println("Answer 1 for yes and 0 for no.");
		int hour = input.nextInt();
		
		while (hour !=1 && hour !=0) {
			System.out.println("Invalid option. Please select the following number");
			hour = input.nextInt();
		}
		
		if (hour == 1) {
			System.out.println("Select your flight class.");
			System.out.println("1. First Class Suite \n2. Business Class \n3. Economy Class");
			int flightClass = input.nextInt();
			
			String className = "";
			
			if (flightClass == 1) {
				className = "First Class Suite";
			}else if (flightClass == 2) {
				className = "Business Class";
			}else if (flightClass == 3) {
				className = "Economy Class";
			}
			
				while (flightClass !=1 && flightClass !=2 && flightClass !=3) {
					System.out.println("Invalid option. Please select the following number");
					flightClass = input.nextInt();
				}
				
					if (flightClass == 1 && flightClass == 2 && flightClass == 3) 
						System.out.println("Choose your preffered refund method.");
						System.out.println("Choose your preffered refund method. \n1. Cash \n2. Cheque \n3. Travel Point");
						int refund = input.nextInt();
						
						String refundType = "";
						
						if (refund == 1) {
							refundType = "Cash";
						}else if (refund == 2) {
							refundType = "Cheque";
						}else if (refund == 3) {
							refundType = "Travel Point";
						}
							
							while (refund !=1 && refund !=2 && refund !=3) {
								System.out.println("Invalid option. Please select the following number");
								refund = input.nextInt();
							}
							
					
					
					
			
							System.out.println("Your " + className + " ticket will be refunded in " + refundType);	
		} 
		else if (hour ==0) {
			System.out.println("Your flight cannot be refunded");
		}
		
			
		

	}

}
