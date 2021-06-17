import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.EnumSet;

public class Main {
	static int result = 999;
	static boolean[] check;
	
	public enum Topping {test1, test2, test3, test4}
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException, NoSuchAlgorithmException {
		final String test5 = "test5";
		
		EnumSet toppings = EnumSet.noneOf(Topping.class);
		toppings.add(test5);
		System.out.println(toppings);
	}
}
