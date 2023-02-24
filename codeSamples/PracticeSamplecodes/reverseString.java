public class reverseString {
    public static void main(String args[]) {
      String str = "java programming";
      char[] c = str.toCharArray();
      for(int i=0,j=str.length()-1;j>i;i++,j--){
          char temp = c[i];
          c[i] = c[j];
          c[j] = temp;
          
      }
      System.out.println(c);
    }
}