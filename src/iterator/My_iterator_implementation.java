package iterator;

import java.util.List;

public class My_iterator_implementation implements My_iterator<Object> {
	private List<?> elements;
	private int current_element;
	
	public My_iterator_implementation(List<?> elements) {
		this.elements = elements;
	}

	@Override
	public boolean has_next_element() {
		return current_element < elements.size();
	}

	@Override
	public Object next_element() {
		return elements.get(current_element++);
	}

}
