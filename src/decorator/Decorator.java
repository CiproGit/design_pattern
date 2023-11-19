package decorator;

public class Decorator implements Write_to_stdout {
	private Write_to_stdout base_component;
	
	public Decorator() {}

	public Decorator(Base_component base_component) {
		this.base_component = base_component;
	}

	@Override
	public void write_to_stdout() {
		if (base_component != null) base_component.write_to_stdout();
		System.out.println("I am writing on stdout from Decorator");		
	}
	
	public void write_to_stderr() {
		System.err.println("I am writing on stderr from Decorator");
	}
}
