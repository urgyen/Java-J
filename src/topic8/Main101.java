package topic8;

public class Main101 {

//	// Method over loading
//	// addSum(10, 12);
//
//	// 10.5,20.5
//	double dataFromMethod = addSum(10, 20.5);
//	System.out.println(dataFromMethod);
//
//	// 10,10,10
//	addSum(10, 10, 10);
//	// 10,10.5
//
//	// Method over riding
//	// Inheritance
//
//	// Sum of two number
//	public static void addSum(int a, int b) {
//		System.out.println(a + b);
//	}
//
//	public static void addSum(int a, int b, int c) {
//		System.out.println(a + b + c);
//	}
//
//	public static void addSum(double a, double b) {
//		System.out.println(a + b);
//	}
//
//	public static double addSum(int a, double b) {
//		// System.out.println(a + b);
//		double sum = a + b;
//		return sum;
//	}

//	public static void printName(String name1) {
//		System.out.println(name1);
//		System.out.println("From 1st method");
//	}
//	
//	public static void printName(String name1, String name2) {
//		System.out.println(name1 + " "+ name2);
//		System.out.println("From 2nd method");
//	}
//	
//	
//	public static void printName(char char1) {
//		System.out.println(char1 );
//		System.out.println("From 3rd method");
//
//	}
//	
//	public static void printName(char char1, String name2) {
//		System.out.println(char1 + " "+ name2);
//		System.out.println("From 4th method");
//
//	}
//	
//	printName("Apple");
//	printName("Apple" ,"Banana");
//	printName('a');
//	printName('a', "Apple");
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Son s1= new Son();
		s1.age=7;
		s1.isEating();
		
		

	}

}
