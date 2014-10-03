package home.handson.java8;

public class This {
	Runnable r = () -> {
		System.out.println(this);
	};

	public String toString() {
		return "Hello from Class This";
	}

	public static void main(String args[]) {
		new This().r.run();

	}
}