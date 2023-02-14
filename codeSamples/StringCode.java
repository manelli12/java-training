class StringCode{
	public static void main(String[] args){
		String str1 = "Java";
		String str2 = new String("Java Programming");
		
		char c[] = {65, ' ', 66, 32, 67, 68};
		char c1[] = {'H','e','l','l','o'};
		String str3 = new String(c1,2,2);
		
		byte b[] = {65,66,67,68};
		String str4 = new String(b,0,3);
		
		System.out.println(str4);
		
		String string1 = "ADP";
		String string2 = new String("ADP");
		
		System.out.println(string1==string2);
		
		//String methods
		String s1 = "Hello World";
		
		String s2 = s1.toLowerCase();
		String s3 = s1.toUpperCase();
		
		String s4 = s1.trim();
		
		String sub = s1.substring(2,6);
		
		String re = s1.replace('l', 'u');
		
		System.out.println("\n" + s1);
		
		//searching
		String name ="Mr. misra priy";
		System.out.println(name.endsWith("priy"));
		System.out.println(name.charAt(5));
		System.out.println(name.indexOf("i"));
		System.out.println(name.lastIndexOf("i"));
		
		//comparing
		String name1 = "Python";
		String name2 = "Python";
		String name3 = new String("Python");
		
		System.out.println(name1.equals(name2)); //it only checks content
		System.out.println(name1==name2);        // it will check the address of the object
		System.out.println("\n" + name1.equals(name3));
		System.out.println(name1==name3); //false 
		
		System.out.println(name1.compareTo(name2));
		System.out.println(name1.compareToIgnoreCase(name2));
		
		System.out.println(name1.contains("java")); //it will check for mentioned String
		
		//String.valueOf() //can be used for converting any type of data to a String data
		String Str = "a";
		System.out.println(Str.matches("."));
	
	}
} 