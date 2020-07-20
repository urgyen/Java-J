package topic9;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StudentDetails s1= new StudentDetails();
//		s1.name = "Ram";
//		s1.age  = 150;
//		System.out.println(s1.name);
		
		s1.setName("Ram");
		
		s1.setAge(150);
		
		System.out.println(s1.getName());
		System.out.println(s1.getAge());
		
		//s1.setName= "Sita";
				
				
		
		//Encapsulation?
//		1. data private; public to private
//		2. method ko through bata acceess; getter and setter
//		3. Logic check or control over data;
		
	}

}
