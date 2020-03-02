
public class HelloWorldJava {

	private static String name;
	public static String getName() {
		return name;
	}
	public static void setName(String _name) {
		name = _name;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//this is a comment
		System.out.println("Hello world java!");
		setName("Sarah");
		System.out.println(getName());
	}
	

}
