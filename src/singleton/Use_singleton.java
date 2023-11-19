package singleton;

public class Use_singleton {
	public static void main(String[] args) {
		Singleton singleton = Singleton.get_instance();
		
		System.out.println(singleton);
		System.out.println(Singleton.get_instance());
	}
}
