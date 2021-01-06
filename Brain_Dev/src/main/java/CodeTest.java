import java.util.Scanner;

public class CodeTest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int leng = sc.nextInt();
		int[] arr = new int[leng];
		int tmp;
		int min;
		int max;
		
		for(int i = 0; i<leng; i++) {
			arr[i] = sc.nextInt();
		}
		
		min = arr[0];
		for(int i = 1; i<leng; i++) {
			tmp = arr[i];
			if(min>tmp) {
				min = tmp;
			}
		}
		
		max = arr[0];
		for(int i = 1; i<leng; i++) {
			tmp = arr[i];
			if(max<tmp) {
				max = tmp;
			}
		}		
		System.out.println(min+" "+max);

	}
}
