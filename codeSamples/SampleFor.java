class SampleFor{
	public static void main(String[] args){
		
		int[] Array = {55,1,25,31,4,15,22};
		for(int i=0,j=Array.length-1; i<j; i++,j--){
			int temp = Array[i];
			Array[i] = Array[j];
			Array[j] = temp;	
		}
		for(int i = 0; i < Array.length; i++){
			System.out.print(Array[i] + " ");
		}
		/*for(int i : Array){ //for each element i in array
		System.out.print(i + " ");
	} */
		
		System.out.println("\n\ninside while...");
		
		int[] grade ={1,23,4,5,6};
		int start = 0;
		int end = grade.length-1;
		while(start < end){
			int temp1 = grade[start];
			grade[start] = grade[end];
			grade[end] = temp1;
			
			start++;
			end--;
		}
		start=0;
		while(start<grade.length){
			System.out.print(grade[start] + " ");
			start++;
		}
		
		System.out.println("\n\nCounting Divisors: ");
		int x =32;
		int count = 0;
		for(int i=1; i<=x; i++){
			if(x%i == 0){
				System.out.print(i + " ");
				count++;
			}
		}
		System.out.println("\ndivisors count: " + count);
		
		
		System.out.println("\nInside label break...");
		int n=0;
        label: for(int i = 0; i< 10; i++){
			for(int j = 0; j < 10; j++){
				if(i == 3 && j ==3){
					System.out.println("breaks...");
					continue label;
					//System.out.println("This statement will not be executed");
				}
				n++;
			}
		}
		System.out.println("num: " + n);
	}
}