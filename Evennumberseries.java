package printseries;
import java.util.Scanner;

public class Evennumberseries {
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Enter the N value : ");
			int N = scanner.nextInt();
			
			System.out.println("Even numbers up to "+N);
			for(int i=0;i<=N;i+=2)
				System.out.print(i+" ");
			scanner.close();
		}
	}
