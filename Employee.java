class Employee{
	static int detailsCount;

  String name;
  char initial;
  int id ;
  int age;
  int salary;
  long phone;
  double tax;

  /* boolean hike = true;
  double salaryinc = 50000.0;
  double salaryHike = 3000.0; */
  	

	
	void details(){
		detailsCount = detailsCount + 1;

		/* if (hike){
		 salaryinc = salaryinc + salaryHike;
		} */

		System.out.println("\nname: " + name);
		System.out.println("initial: " + initial);
		System.out.println("id: " + id);
		System.out.println("age: " + age);
		System.out.println("salary: " + salary);
		//System.out.println("salaryinc: " +salaryinc);
		System.out.println("tax: "+ tax);
		System.out.println("detailsCount: "+ detailsCount);
	}
  public static void main(String[] args){
	Employee emp1 = new Employee();
	emp1.name="sarvam";
        emp1.initial= 'm';
        emp1.id =444;
  	emp1.age =30;
  	emp1.salary =50000;
  	emp1.phone = 9999955555l;
  	emp1.tax = 334.5555558888;
	
	emp1.details();

	Employee emp2 = new Employee();
	emp2.name="muthaya";
        emp2.initial= 's';
        emp2.id =333;
  	emp2.age =25;
  	emp2.salary =60000;
  	emp2.phone = 9999955544l;
  	emp2.tax = 334.58888;
	emp2.details();
	}
}