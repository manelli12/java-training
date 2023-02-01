class Concatenation{
	public static void main(String[] args){
	//String concatenation using '+' operator
	 String s = "mahesh"+ " " +"manelli";
	 System.out.println(s); 
	 
	//using 'concat()' method
	 String s1 = "Hello";
	 String s2 = "World";
	 String s3 = s1.concat(" ").concat(s2);
	 System.out.println(s3);
	 
	//using 'StringBuilder' class
	 StringBuilder sb1 = new StringBuilder("Java");
	 StringBuilder sb2 = new StringBuilder("Developer");
	 StringBuilder sb3 = sb1.append(" ").append(sb2); //append() method is used in strbuilder
	 System.out.println(sb3.toString());
	}
}