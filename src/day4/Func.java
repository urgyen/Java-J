package day4;

public class Func {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// sayHi("ASmita", "Uma",100);
		// sum
//		int dataFromMethod = sum(100, 20);
//		
//		System.out.println(dataFromMethod-5);
//		

		// Urgyen is a good Boy
		// System.out.println(sayMyName());

//		char dataFromMethod = sayMyName();
//		System.out.println(dataFromMethod + " is a good boy");

		printPIyHi();

	}

	// no return type and no arguments
	public static void printPIyHi() {
		System.out.println("3.1416");
	}

	public static char sayMyName() {

		return 'a';

	}

	public static int sum(int a, int b) {

		int sum = a + b;

		return sum;

	}

	// name1= Asmita
	// name2= Uma
	// loop=100
	public static void sayHi(String name1, String name2, int loop) {

		// decision control statemnets
		// loops
		for (int i = 0; i < loop; i++) {
			System.out.println(i + " " + name1 + " " + name2);
		}

	}

	public static void printName() {

		System.out.println("Nepal");
		System.out.println("We Nepali");

	}

// return type ,,, and arguments

//	1.
//	Function with return
//	type and
//	argument okokokok 
//	2.
//	Function with return
//	type and
//	no arguments  okokok
//	3.
//	Function with no return
//	and arguments okok 
//	4.
//	function with no return
//	and no arguments
}
