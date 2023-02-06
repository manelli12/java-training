class DemoStudent{
	int id;
	String name;
	String course;
	
	DemoStudent(int id, String name, String course){
	  this.id = id;
	  this.name = name;
	  this.course = course;
	}
	boolean updateProfile(String name){
		this.name = name;
		return true;
	}
	
	
}