package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Use_my_iterator {
	public static void main(String[] args) {
		List<String> objects = new ArrayList<String>();
		objects.add("String0");
		objects.add("String1");
		objects.add("String2");
		
		Iterator<String> iterator = objects.iterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		My_iterator_implementation my_iterator = new My_iterator_implementation(objects);
		while (my_iterator.has_next_element()) {
			System.out.println(my_iterator.next_element());
		}
	}
}
