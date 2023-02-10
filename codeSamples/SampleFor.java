class SampleFor{
 public static void main(String[] args){
    int[] Array = {0,1,2,3,4,5,6,7,8,9};
	for(int i=Array.length-1; i>0; i--){
	  System.out.print(Array[i] + " ");
	
	}
	System.out.println("\nCounting Divisors: ");
	int x =32;
	int count = 0;
	for(int i=1; i<=x; i++){
	  if(x%i == 0){
	    System.out.print(i + " ");
		count++;
	  }
	}
	System.out.println("\ndivisors count: " + count);
 }
}