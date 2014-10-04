package home.handson.java8.lambda;

/**
 * 
 * @author mohammedali
 *
 */

interface Int {
	void setInt(int[] i); 
	
}
public class FunctionalInterfaceWithArrayAsParameter {

	public static void main(String[] args) {
		Int int1  =(int... i)->{
		
			for (int j = 0; j < i.length; j++) {
				System.out.println(i[j]);
			}
		};
		int1.setInt(new int[] {1, 2, 3});
	}
	
}
