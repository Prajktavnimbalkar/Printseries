package printseries;

public class AlternateTenSeries {
	public static void main(String[] args) {
		int a = 10;
		int b = 1;
		System.out.print("The Series is : ");
		for(int i=0;i<10;i++,a--,b++)
			System.out.print(a+" "+b+" ");
		
		System.out.print("\nAlternate approach : ");
		a = 10;
		for(int i=0;i<10;i++)
			System.out.print((a-i)+" "+(i+1)+" ");
	}
}
