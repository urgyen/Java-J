package topicSix;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//object creation
		Student asmita= new Student();
		
		//Object data deko
		asmita.name	= 	"Asmita";
		asmita.age	=	22;
		asmita.address=	"Pokhara";
		
		//Object ko data line
		System.out.println("----");
		System.out.println(asmita.address);
		
		asmita.isReading();
		
		System.out.println("----");
		Person p1= new Person();
		p1.name="Uma";
		p1.sayHi();
		
		Person p2= new Person();
		p2.name="Umaa";
		p2.sayHi();
		
	}

}
