class StaticTest{
	static int i;
	static void test(){
		System.out.println(i);

	}
	static int sum(int x, int y){
		return x+y; 
	}

	public static void main(String[] args){
		
		/*StaticTest st1 = new StaticTest();
	StaticTest st2 = new StaticTest();
	st1.i =5; 
	st2.i =6;
	st1.test();*/
		StaticTest.i = 99;
		StaticTest.test(); //non-static method test() cannot be referenced from a static context
		
		System.out.println(StaticTest.sum(5,5));
	}
}	