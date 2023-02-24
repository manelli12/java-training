public class CountingWords {
    public static void main(String args[]) {
      String str = "java uses both dynamic and static binding";
      int count=1;
      
      for (int i = 0; i < str.length(); i++){
          if (str.charAt(i) == ' '){
              count++;
          }
          
      }
      System.out.println(count);
    }
}