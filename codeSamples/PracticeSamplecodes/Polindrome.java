import java.util.*;
public class Polindrome {
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      int m =n;
      int r=0;
      int rev =0;
      while(n>0){
          r=n%10;
          rev = rev*10+r;
          n=n/10;
          
      }
      System.out.println(rev);
      if(rev == m){
          System.out.println("polyndrome number");
      }else{
          System.out.println("not a polyndrome");
      }
    }
}