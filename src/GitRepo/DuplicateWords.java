package GitRepo;

import java.util.HashMap;
import java.util.Map.Entry;

public class DuplicateWords {
	
	 void duplicate(String str) {
		System.out.println("String :  "+str);
		String [] words=str.split(" ");
		HashMap<String,Integer> hp = new HashMap<>();
		
		for (String word : words ) {
			if(hp.containsKey(word.toLowerCase())) {
				hp.put(word ,hp.get(word.toLowerCase())+1);
			}
			else
			{
				hp.put(word.toLowerCase(), 1);
			}
		}
			System.out.println("Duplicate Words");
			
			  for(Entry<String, Integer> entry : hp.entrySet()) {
				  if(entry.getValue()>1) {
			  System.out.println(entry.getKey()+" : "+entry.getValue());
			  }
			}
	}
}
