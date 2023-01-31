class ArrayExample{
	static void arrays(){
	System.out.println("sample arrays...");
	int[] marks = {99,65,43,88,76};
	System.out.println("topper:" + marks[0]);
	
	char[] grade = {'A','C','F','B','O'};
	System.out.println("fail:" + grade[2]);
	System.out.println("highest grade:" + grade[4]);
	
	int[] A = {1,2,3,4,5};
	int[] B = {6,7,8,9};
	System.arraycopy(A,0,B,1,3);
	System.out.println("B after copying:" + B);
	
	String[] names= {"ram","lakshman","bharath","ravan"};
	System.arraycopy(names,0,names,1,3);
	System.out.println("names:" + names);
	
	String[] copyFrom = {
            "Affogato", "Americano", "Cappuccino", "Corretto", "Cortado",   
            "Doppio", "Espresso", "Frappucino", "Freddo", "Lungo", "Macchiato",      
            "Marocchino", "Ristretto" };
        
        String[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);        
        for (String coffee : copyTo) {
            System.out.print(coffee + " ");           
        } 
	
	}
	
	public static void main(String args[]){
			arrays();
			
	}
	}