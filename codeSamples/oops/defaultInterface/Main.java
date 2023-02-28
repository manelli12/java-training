public class Main{
	public static void main(String args[]){
		Shape circle = new Circle(5);
		circle.print();
		System.out.println("Area of circle: " + circle.area());
		
		Shape square = new Square(10);
		square.print();
		System.out.println("Area of square: " + square.area());
	}
}