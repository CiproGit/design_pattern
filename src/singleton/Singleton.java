package singleton;

public class Singleton {
	private static Singleton instance = null;
	
	private Singleton() {} // The private constructor prevents objects from being instantiated by external classes

	// Method of the class used to access the singleton
	public static Singleton get_instance() {
		if (instance == null) instance = new Singleton();
		return instance;	
	}
}
