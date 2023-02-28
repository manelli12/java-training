class Circle implements Shape{
	private double radius;
	
	public Circle(double radius){
		this.radius = radius;
	}
	
	public double area(){
		return Math.PI*radius*radius;
	}
	
	public void print(){
		System.out.println("Circle with Radius: " + radius);
	}
}