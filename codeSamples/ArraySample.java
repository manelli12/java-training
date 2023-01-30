class ArrayExample{
	static void arrays(){
	System.out.println("sample arrays...");
	int[] marks = {99,65,43,88,76};
	System.out.println("topper:" + marks[0]);
	
	char[] grade = {'A','C','F','B','O'};
	System.out.println("fail:" + grade[2]);
	System.out.println("highest grade:" + grade[4]);
	
	
	}
	
	public static void main(String args[]){
			arrays();
			Employee[] employees = {new Employee(), new Employee(), new Employee()};
	/*employees[0] = new Employee();
	employees[1] = new Employee();
	employees[2] = new Employee();*/
	employees[0].name = "misra";
	employees[1].name = "akela";
	employees[2].name = "vignesh";
	System.out.println("Employee 1: " + employees[0].name);
	System.out.println("Employee 2: " + employees[1].name);
	System.out.println("Employee 3: " + employees[2].name);
	}
	}