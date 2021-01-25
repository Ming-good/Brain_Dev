import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Scanner s = new Scanner(System.in);
        
        int A = s.nextInt();
        int B = s.nextInt();
        int C = s.nextInt();
        
        int i = 0;
        int sum = 0;
        
        while(sum < C) {
        	++i;
        	sum = A*i - B*i + A;
        }
        
        System.out.println(i+1);
	}
}
