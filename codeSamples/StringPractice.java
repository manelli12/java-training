class StringPractice{
public static void main(String[] args){
	String str = "developer@gmail.com";
	
	int i = str.indexOf("@");
	String userName = str.substring(0,i);
	String domain = str.substring(i+1,str.length());
	
	System.out.println("user name: " + userName);
	System.out.println("Domain : " + domain);
	
	System.out.println(domain.startsWith("gmail"));
	System.out.println(domain.endsWith("com"));
	System.out.println(str.charAt(8)); //gives the character in specified index
	System.out.println(str.replace("gmail","adp"));
	
	String s = "i am manali";
	String[] sp = s.split(" "); //spilts the string 
	for (int j = 0; j < sp.length; j++)
		System.out.println(sp[j]);
}
}