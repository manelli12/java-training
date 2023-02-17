public class MathClass {
    public static void main(String args[]) {
      double random = Math.random();
      int winner = (int)(random*100);
      System.out.println("Random: " +random);
      System.out.println("Winner: " +winner);
      
      long distance1 = Math.round(22.55); 
      int distance2 = Math.round(11.9f); //rounding floating point to nearest integer
      System.out.println("ROundValue: " +distance1);
      System.out.println("ROundValue: " +distance2);
      
      //ceil ~ round up
      double ceil1 = Math.ceil(33.999);
      double ceil2 = Math.ceil(33.01);
      System.out.println("ceil1: " +ceil1);
      System.out.println("ceil2: " +ceil2);
      
      //floor ~ round down
      double floor1 = Math.floor(33.999);
      double floor2 = Math.floor(33.01);
      System.out.println("floor1: " +floor1);
      System.out.println("floor2: " +floor1);
      
      //finding maximum value
      double max = Math.max(22.45,22.46);
      System.out.println("MaxValue: " +max);
      
      //absolute
      double abs = Math.abs(-99.99);
      System.out.println("abs: " +abs);
      
      //square root
      double sqrt = Math.sqrt(8.1);
      System.out.println("square root: " +sqrt);
      
      //power
      double pow = Math.pow(2.0, 3.0);
      System.out.println("power: " +pow);
    }
}