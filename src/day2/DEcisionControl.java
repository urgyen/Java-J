package day2;

public class DEcisionControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Topic Decision Control;
		// Java
		// 1. We do something
//		String name="Apple";
//		System.out.println(name);

		// 2. We do something if that happens
		// Decision Control?
		// if condition
//		int age= 16;
//		//Condition check;
//		//true
//		if(age >= 18) {
//			System.out.println("Eligible to Vote");
//		}else {
//			System.out.println("Come when you are 18.");
//		}

		// if else condition
		// else if condition

		// Scenario
		// if age<= 15 child MEET
		// age 16-19 teen
		// 20 plus Adult
		
		
//		int age = 14;
//		if (age <= 15) {
//			System.out.println("Child");
//		} 
//		else if (age < 20) {
//			System.out.println("Teen");
//		} 
//		else {
//			System.out.println("Adult");
//		}

		//Scenario;
		//Electricity Bill
//		unit = 150 per unit 10 rupees
//		unit = 200	per unit 15
//		unit = 300 per unit 20
//		unit = 300 plus per unit 25
 		
//		int unit=150;
//		if(unit<=150) {
//			double amount=unit*10;
//			System.out.println(amount);
//		}
//		else if(unit<=200) {
//			double amount=unit*15;
//			System.out.println(amount);
//		}
//		else if(unit<=300) {
//			double amount= unit*20;
//			System.out.println(amount);
//		}
//		else {
//			double amount=unit*25;
//			System.out.println(amount);
//		}
//		
		
		// Switch condition
		//Scenario
//		if weekDay=1, Sunday
//				2, Monday
//				..
		
		// break;
		
		char weekDay='C';
		switch(weekDay) {
		
		case 'a':
			System.out.println("Sunday");	
			break;
			
		case 'b':
			System.out.println("Monday");	
			break;
			
		case 'c':
			System.out.println("Tuesday");
			break;
			
		case 'd':
			System.out.println("Wed");	
			break;
			
		case 'e':
			System.out.println("Thurs");
			break;
			
		case 'f':
			System.out.println("Friday Yyyy");
			break;
			
			
		case 'g':
			System.out.println("SAturday");
			break;
			
		default:
			System.out.println("Invalid Input");
			
		}
		
		
		

		// 3. We do something again and again

	}

}
