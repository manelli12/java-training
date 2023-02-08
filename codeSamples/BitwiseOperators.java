class bitwiseOperator{
 static void bwOperator(){
   System.out.println("Inside bitwise operators ...");
   int x =1;
   int y =3;
   
   System.out.println("x & y: " + (x & y));
   System.out.println("x | y: " + (x | y));
   System.out.println("x ^ y: " + (x ^ y));
   System.out.println("~y: " + (~y));
   System.out.println("false & true: " + (false & true));
   
   char c1 = 'A'; 
   char c2 = 'B';
   System.out.println("c1 | c2: " + (c1 | c2));
   
   //it works only for integer type
   /*double d1 = 44.4;
   double d2 = 33.2;
   System.out.println("d1 & d2: " + (d1 & d2)); */
 }
 public static void main(String[] args){
   bwOperator();
 }
}