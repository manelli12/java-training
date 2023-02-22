package oops.polymorphism;

class Staff extends User {
	
	void printUserType() {
		System.out.println("Staff");
	}
	
	void postAReview() {
		System.out.println("Staff: postAReview");
	}
	
	static void staticMethod(){
		System.out.println("\nStaff: staticMethod");
	}
}