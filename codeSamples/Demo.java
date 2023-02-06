class Demo{
	public static void main(String[] args){
		DemoStudent student1 = new DemoStudent(1, "luffy", "java");
		  System.out.println("Name of student1: " + student1.name);
		  
		DemoStudent student2 = new DemoStudent(2, "zoro", "java");
		  System.out.println("Name of student2: " + student2.name);
		  
		DemoStudent student3 = new DemoStudent(3, "sanji", "java");
		  System.out.println("Name of student3: " + student3.name);
		  
		DemoStudent[] students = {student1, student2, student3};
		
		DemoStudent temp = students[0];
		students[0] = students[2];
		students[2] = temp;
		
		System.out.println("\nName of student1: " + students[0].name);
		System.out.println("Name of student2: " + students[1].name);
		System.out.println("Name of student3: " + students[2].name);  
		  
		student1.updateProfile("Luffy");
		System.out.println("\nUpdated name of student1: " + student1.name);
		
		student3 = student1;
		System.out.println("\nName of student3: " + student3.name);
		System.out.println("Name of student1: " + student1.name);
		
		student3.updateProfile("chopper");
		System.out.println("\nName of student1: " + student1.name);
		
		student3 = student2;
		student2.updateProfile("Kaido");
		System.out.println("\nName of student3: " + student3.name);
		System.out.println("Name of student1: " + student1.name);
		System.out.println("Name of student2: " + student2.name);
		
	}
	
}