class PassingData{
	static void Assign(int[] array){
		System.out.println("array[0]: " + array[0]);
		System.out.println("array[1]: " + array[1]);
		System.out.println("array[2]: " + array[2]);
		System.out.println("array[3]: " + array[3]);
		array[1] = 44;
	}
	//method overloading
	static void Assign(int i){
		System.out.println("using int primitive:" + i);
	}
	static void Assign(byte b){
		System.out.println("using byte: " + b);
	}
	static void Assign(char c){
		System.out.println("char: " + c);
	}
	
	//varargs
	static void varargsOverload(boolean b, int i, int j, int k){
		System.out.println("\nwithout varargs");
	}
	static void varargsOverload(int... list){
		System.out.println("\nwith varargs");
		System.out.println("length: " + list.length);
	}
	public static void main(String[] args){
	/*	int[] array = {1,2,3,4};
		Assign(array);
		System.out.println("\narray[1]: " + array[1]);
		
		Assign(1000);
		
		byte b = 22;
		Assign(b);
		
		Assign('M'); */
		
		varargsOverload(true,1,2,3);
		varargsOverload(1, 2, 3, 4, 5); 
		
	}
}