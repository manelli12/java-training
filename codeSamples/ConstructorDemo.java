class Human{
	private int age;
	private String name;
	public Human()
	{
		age = 24;
		name = "viks";
	} 
	public Human(int age, String name){
		this.age = age;
		this.name = name;
	}
	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	
	
	public static void main(String[] args){
		Human obj =new Human();				//constructor without parameters
		obj.setName("hari"); // default constructor is invoked at the time of obj creation if we does'nt use one
		obj.setAge(22);
		System.out.println(obj.getName() + " : " + obj.getAge());
		
		Human obj1 = new Human(18 , "kareem");   //parameterized constructor
		System.out.println(obj1.getName() + " : " + obj1.getAge());
		
		
		
	}

}