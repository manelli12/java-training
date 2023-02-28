interface Shape {
	double area();
	
	default void print(){
		System.out.println("This is a shape.");
	}
}