import java.util.*;
public class ArmStrong{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = n;
		int r = 0;
		int sum = 0;
		while(n>0){
			r = n%10;
			n = n/10;
			sum = sum+r*r*r;
			
		}
		if(sum == m){
			System.out.println("ArmStrong Number");
		}else{
			System.out.println("Not an ArmStrong Number");
		}
	}
}