import java.util.*;

public class SumOfDigits{
	public static void main(String args[]){
		System.out.println("Enter a number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int r=0,sum =0,prod =1;
		
		while(n>9 || n<-9){
			r = n%10;
			sum += Math.abs(r);
			prod *= Math.abs(r);
			n /=10;
		}
		sum +=n;
		System.out.println("sum of digits: " + sum);
		prod *=n;
		System.out.println("Product of digits: " + prod);
		
	}
}