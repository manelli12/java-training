package exception.assertions;

import exception.assertions.p1.C;

public class A {

	public static void main(String[] args ) {
		A a = new A();
		a.test(2);
	}

	void test(int i) {
		assert i > 1 : "invalid i in A.test";

		B b = new B();
		b.test(1);

		C c = new C();
		c.test(1);

		D d = new D();
		d.test(-1);
	}

}