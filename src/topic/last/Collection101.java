package topic.last;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Collection101 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Collection;
		// ArrayList
			// array -- size fix;
		
//		ArrayList<String> namesOfStudents = new ArrayList<>();
//		
//		//a[0]=10; 
//		
//		namesOfStudents.add("Urgyen");
//		namesOfStudents.add("Asmita");
//		namesOfStudents.add("Sabin");
//		namesOfStudents.add("Uma");
//		namesOfStudents.add("Yash");
//		namesOfStudents.add("Sabin");
//		namesOfStudents.add("Uma");
//		namesOfStudents.add("Yash");
//		
//		System.out.println(namesOfStudents);
//		System.out.println("----");
//		

//		
//		namesOfStudents.set(0, "Ram");
//		
//
//		System.out.println(namesOfStudents.isEmpty());
//		
//		namesOfStudents.
		
		//
	//Insertion order maintain hunxa?
		
//		HashSet<String> set1= new HashSet<>();
//		set1.add("Apple");
//		set1.add("Banana");
//		set1.add("Cat");
//		set1.add("Dog");
//		set1.add("Egg");
//		set1.add("Fish");
//		
//		System.out.println(set1);
		
		
		HashMap<Integer, String> hm= new HashMap<>();
		
//		0= Urgyen
//				2= Asmita
//				4- Uma
//				6- Yash
//				8= Sabin
		
		hm.put(0, "Uma");
		hm.put(2, "ASmita");
		hm.put(4, "Uma");
		hm.put(6, "Yash");
		hm.put(8, "Sabin");
		
//		System.out.println(hm.values());
		//Loop?
		
//		for(String data: namesOfStudents) {
//		System.out.println(data);
//	}
		//Map.Entry   ->> String
	//	System.out.println(hm.entrySet());
		
		for(Map.Entry data : hm.entrySet()) {
			
			System.out.println("Key: "+ data.getKey());
			System.out.println("Value: "+data.getValue());
			System.out.println("------");
			
		}
		
		System.out.println(hm.size());
		
		// Hash Set
		// Hash Map
				
	}

}
