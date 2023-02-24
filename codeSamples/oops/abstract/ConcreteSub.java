public class ConcreteSub extends AbstractSub{
	@Override
	void test2(){
		System.out.println("test2");
		
	}
	@Override
	void test3(){
		System.out.println("test3");
	}
	
	public static void main(String[] args){
		ConcreteSub concrete = new ConcreteSub();
		concrete.test1();
		concrete.test2();
		concrete.test3();
		//AbstractSuper test = new AbstractSuper(); //abstract class can't be instantiated
	}
}