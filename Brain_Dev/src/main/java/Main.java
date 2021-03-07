import java.io.IOException;
import java.security.NoSuchAlgorithmException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException, NoSuchAlgorithmException {
		String userid = "1234567891";
		Pattern p = Pattern.compile("^([\\w]){4,10}$"); 
		Matcher login_check = p.matcher(userid);
		
		System.out.println(login_check.matches());
	}
}
