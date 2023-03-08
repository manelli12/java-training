import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class SetAndHashSet {
	public static void main(String[] args){
		Set<String> names = new HashSet<>();
		names.add("Luffy");
		names.add("Zoro");
		names.add("Kaido");
		names.add("Brook");
		names.add("Luffy");
		
		//linkedHashSet will return in same order
		Set<String> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add("Luffy");
		linkedHashSet.add("Zoro");
		linkedHashSet.add("Kaido");
		linkedHashSet.add("Brook");
		System.out.println("LinkedHashSet: " + linkedHashSet);
		
		//names.clear();
		/* 
		for(String name : names){
			System.out.println(name);
		} */
		names.forEach(System.out::println);
		System.out.println(names);
		System.out.println(names.contains("zoro"));
		
		//using iterator
		/* Iterator<String> namesIterator = names.iterator();
		while(namesIterator.hasNext()){
			System.out.print(namesIterator.next());
		} */
	}
}