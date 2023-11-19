package decorator;

public class Use_decorator {
	public static void main(String[] args) {
		Base_component base_component = new Base_component();
		Decorator decorator = new Decorator(base_component);
		
		decorator.write_to_stdout();
		decorator.write_to_stderr();
	}
}
