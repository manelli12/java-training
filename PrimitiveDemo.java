class PrimitiveDemo{
static void primitives(){
System.out.println("Inside Primitives ...");
int intHex = 0x0041; 				//hexadecimal
System.out.println("intHex: " + intHex);

int intBinary = 0b01000001;
System.out.println("intBinary: " + intBinary); //binary form

int intOctal = 0101; 
System.out.println("intOctal: " + intOctal);  //octal form

//FOR BOX PRIMITIVE VALUES
 //int minValue = Integer.MIN_VALUE;
  //int maxValue = Integer.MAX_VALUE;

  //long minValue = Long.MIN_VALUE;
  //long maxValue = Long.MAX_VALUE;

/* System.out.println("phone.no: " + phone);
		System.out.println("MinValue: " + minValue);
		System.out.println("MaxValue: " + maxValue); */

//characters

int intchar = 'c';
System.out.println("intchar: " + intchar);

char charint = 99;
System.out.println("charint: " + charint);

//we can also assign hexadecimal and binary values as well i.e charHex,charBinar.
}

public static void main(String[] args){
primitives();
}
}