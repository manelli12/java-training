public class BoxPrimitive {
    public static void main(String args[]) {
      Integer boxInt = Integer.valueOf(112);
      System.out.println(boxInt);
      
      Double boxDouble = Double.valueOf(0.69);
      System.out.println(boxDouble);
      
      Character boxChar = Character.valueOf('A');
      System.out.println(boxChar);
      
      //unwrap: typevalue
      int primitiveInt = boxInt.intValue();
      double primitiveDouble = boxDouble.doubleValue();
      char primitiveChar = boxChar.charValue();
      System.out.println(primitiveInt);
	  
	  //parsing Strings: parseType
  /*    String data ="4004 Effective Java Programming Language Guide   2007    T   4.9";
      String[] items = data.split("\t");
      Integer id = Integer.valueOf(items[0]);
      String title = items[1];
      int publishYr = Integer.parseInt(items[2]);
      char genre = items[3].charAt(0);
      double rating = Double.parseDouble(items[4]);
      
      System.out.println("\n " + id);
      System.out.println(title);
      System.out.println(publishYr);
      System.out.println(genre);
      System.out.println(rating); */
    }
}