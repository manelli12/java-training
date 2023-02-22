package binding.package1;

class C {
	public static void main(String[] args) {
		A obj1 = new A();
		B obj2 = new B();
		A obj3 = new B();

		obj1.staticMethod();
		obj1.instanceMethod();

		obj2.staticMethod();
		obj2.instanceMethod();

		obj3.staticMethod();  // static binding
		obj3.instanceMethod();  // dynamic binding
	}
}