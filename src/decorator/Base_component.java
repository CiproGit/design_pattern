package decorator;

public class Base_component implements Write_to_stdout {
	@Override
	public void write_to_stdout() {
		System.out.println("I am writing on stdout from Base_component");		
	}
}
