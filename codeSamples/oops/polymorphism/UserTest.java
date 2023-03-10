package oops.polymorphism;

public class UserTest {
	public void printUserType(User u) {
	   u.printUserType();
	}
	
	void approveReview(Staff s) {
		// will lead to a compile-time error as Staff doesn't have this method
		// s.approveReview();
		
		//((Editor) s).approveReview();
		// will lead to a runtime error if a Staff is passed (ClassCastException)
		
		if (s instanceof Editor)
			((Editor) s).approveReview();
		else
			System.out.println("Invalid object passed.");
	}
	
	public static void main(String[] args) {
		User user = new User();
		User staff = new Staff();
		User editor = new Editor();

		UserTest ut = new UserTest();
		ut.printUserType(user);  // implicit casting
		ut.printUserType(staff);
		((Staff) staff).printUserType();
		ut.printUserType(editor);

		// editor.approveReview();
		editor.postAReview();
		editor.saveWebLink();

		ut.approveReview(new Staff());
		ut.approveReview(new Editor());
		
		//method binding
		User s = new Editor();
		//s.staticMethod();	//early binding
		//((Staff) s).staticMethod(); //for invoking Staff method
	}
}