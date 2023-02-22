package oops.polymorphism;

class User {
	void printUserType() {
		System.out.println("User");
	}
	void saveWebLink() {
		System.out.println("User: saveWeblink");
		postAReview();
	}
	void postAReview() {
		System.out.println("User: postAReview");
	}
	//method binding
	static void staticMethod(){
		System.out.println("\nUser: staticMethod");
	}
}