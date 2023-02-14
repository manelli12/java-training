class controlFlow{

  static boolean ifStatements(){
  boolean approved = false;
  
  System.out.println("Inside logicalOperators...");
  int age = 45;
  int salary = 50000;
  boolean hasBadCredit = false;
  
  if(age < 35 && salary > 40000){
	approved = true;
    System.out.println("execute the condition...");
  }else{
     System.out.println("else block");
  }
  
    System.out.println("outside if");
	return approved;
	
  }
  
  static void switchStatement(){
  System.out.println("\nInside switch statement...");
  //final int month2 =12;
  int month = 12;
  //Integer month = new Integer(3); //box primitive
  switch(month){
    case 1 : System.out.println("january");
			break;
	case 2 : System.out.println("february");
			break;
    case 3 : System.out.println("march");
			break;			
	default: System.out.println("december");		
  }
  }
  
  static void whileStatement(){
    while(true){
	 if(a>b){
	  
	 }
	}
  }
  
  
 public static void main(String args[]){
    ifStatements();
	switchStatement();
 }
}