class Sample{
	static void update(Employee e1){
	  //e1 = new Employee();
	  e1.id =4000;
	 }
   public static void main(String[] args){
    
	 Employee e = new Employee();
	 e.id =3000;
	 update(e);
	 System.out.println("employee: " + e.id);
   }
  } 