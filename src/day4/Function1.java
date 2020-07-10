package day4;

public class Function1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//System.out.println(sayHi());
		
//		int number= 	sayHi();
//						//101
//		System.out.println(number);
//		]
		
//		printName("Urgyen");
//		printName("Asmita");
//		printName("Sabin");
//		printName("Uma");
//		printName("Yash");
		
		//Scanner
		String scannedFromUser="parrot";
		
		checkLetter(scannedFromUser);
		
		
		
		
	}
	
	public static void checkLetter(String word) {
		char first= word.charAt(0);
		//P
		
		//System.out.println(word.charAt(0));
		
		if(first=='P' || first == 'p') {
			System.out.println("Starts with P");
		}
		
		else{
			System.out.println("Doesnt start with P");
		}
	}
	
//	public static void printName(String name) {
//		
//		System.out.println("The student name is: " + name);
//	
//	}
	
	
//	
//	public static int sayHi() {
//		
////		System.out.println("Hi");
//		
//		return 101;
//		
//	//	return "Hello";
////		return 1;
//	}

}
