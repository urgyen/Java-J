package day6;

public class Array101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//indexing
		//code optimize;
		
		//array is static
		int number[]= new int[5];
		
		
	//	| 0- Urgyen  | 1- Sabin | 2 - Uma | 3 - Yash | 
	//	4 - Asmita 
		String names[]= new String[4];
		
		names[0] = "Urgyen";
		names[1] = "Sabin";
		names[2]= "Uma";
		names[3]= "Yash";
		//names[4]= "Asmita";
		
		//ArrayIndexOutOfBoundsException
		
	//	String names[]= {"A", "B" , "C", "D" , "E"};
		
		System.out.println("----");
		
//		System.out.println(names[0]);
//		System.out.println(names[1]);
//		System.out.println(names[2]);
//		System.out.println(names[3]);

		//Loop Data fetch
//		for(int i=0; i<names.length ; i++ ) {
//			System.out.println(names[i]);
//		}
		
	//	For Each Loop?
		for( String data : names) {
			System.out.println(data + " is from Array");
		}
		
		//0.01
		
		// Class and Object
		
		// Inheritance
		
		// Encapsualtion
		
		// Polymorphism
		
		int a=5;
		int b= 6.5;
		
		
		for(int i=1; i<=5; i++) {
			b++;
		}
		
		System.out.println("Sum= "+ b);
//		Sum=11;
//		a+b;
//		
		
		// Abstarction
		
		
		
		// Collection
		// ArrayList Dynamic;
		
	}

}
