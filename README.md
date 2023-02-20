	## Learnings in Java ...
###### Day 01

- **Interpreter**
  - `Fetch` next program Statement
  -  `Execute`precompiled machine code in its library
- we use Compiler as well as Interpreter for fast execution and for       platform independent thing.
- Here in java source code is converted into byte code using `Java Compiler` then that byte code will be converted to machine code using 
`Java Interpreter`.
- multiple `.class` files can be archived into one `.jar` file by running 
  jar cvf archive.jar c1.class c2.class
- javap can be used to view the genereated Java bytecode.  
- `JVM Instance` can run only one Java Application.
  - if we want to run another program then we can execute it separetly.
  
  
###### Day 02

- `Git` learned about git and installed git, created `git-hub` account
  learned few commands as well firstly we need to create an empty repository using `git init` this will initialize an empty repository.
  `git add file-name` will add the file to staging and `git commit -m` is used to make modified comments 
  to know what we have modified. `git push` is used to push our current data to git hub in this way we can save and store all the 
  importent data in git hub account.  
- `Just-In-Time compiler`
  - It will identify frequently Executed bytecode as `hot spots` and coverts hot spots to `machine code` i.e know as `cache machine code`
  - `Cached Machine Code` helps in faster execution.
- lerned about flags i.e -cp flag  is used during compile time to let compiler know where the classes are present.
- .jar file can also be a classpath i.e., the -cp flag may contain both directories as well as files.
- `Java Software Families`
  - `Java Standard Edition(SE)` Standalone applications for desktop and servers, EX: Hospital mangement system.
  - `Java Enterprise Edition(EE)` Large-Scale applications for Servers, built on top of Java SE, EX: E-commerce website.
  - `Java Micro Edition(ME)` Applicaion for Resource-Constrained Devices. Uses subset of Java SE.
  
  
###### Day 03
  
- `Variables` is like a container used to store values. A `Variable` is a named storage location in memory, stored Values can be changed during Program Execution.
   it has `Type` that determines what kind of Values they can store. An `Identifier`(name) that is used to access the values stored in Variable.
- Once the Variable Type is set it can not be changed later as Java is a `Statically Typed Language` meaning that type of a variable must be specified when it is
  declared and cannot be changed afterwards.
- Three types of variables are there in Java:
  - Local Variables: declared in methods, constructors or blocks.
  - Instance Variables: declared in class but outside any methods, constructors or blocks.
  - class/static Variables: declared with the `static` keyword in a class but outside any methods, constructors or blocks.
-`static variables`: There would be one copy of each class variable per class, regardless of how many objects are created from it.


###### Day 04

- there are no byte or short literals but only `int` and `long` literals.  
 We can make a literal `long` by appending `L` or `l`.
- a `long` literal can't be assigned to an `byte`, `short` or `int` variable. The compiler will throw an "possible lossy conversion" error. 
  Similarly a `double` literal can't be assigned to an `float` variable.
- every `primitive` type has an associated `boxed primitive`, which have a lot of predefined functions and variables to make things easy.  
- if we want accurate result it's better not to use `float` and `double` in place of that we can use `Big Decimal`.

```Java
BigDeciaml a = new BigDecimal("0.2");
BigDeciaml b = new BigDeciaml("0.3");
```

- `characters` it can be assigned with unique value (\u0042) i.e., `code unit`. we can find different characters in `unicode-table`.


###### Day 05

- `Type Casting`: Assigns variables or literals of one type to another type 
  - implicit casting: smaller to larger data type i.e., widening conversion. Integer to Floating-point is implicit.
  - explicit casting: larger to smaller data type i.e., narrowing conversion mostly characters to different data type comes under explicit.
- we can represent integers and characters using different ways i.e., `intHex`,`intBinary`,`intOctal` in hexadeciaml, binary, octal. we can also use `intChar`.

```java
int intHex = 0x0043;
int intBinary = 0b0100_0001;
int intOctal = 0101;
int intchar = 'B' ;
```

- similarly we can represent characters using char as type. 
- `statements`: Expression or Assignment statements should not fall under class level it will show an compilation error. only declaration statements can be at class level.
- `Arrays`: in Java are useful for storing multiple values of the data type, and they allow you to access those values using their `unique index`.

```java
int[] numbers = {1,7,8,5,7,6};
System.out.println("last number:" + numbers[5]);
```


###### Day 06

- like declaration of variables of other types, an `array` declaration has two components: the array's type and array's name. An `array's type` is written as `type[]`,
  where `type` is the data type of the contained elements, brackets indicate that varaibale holds an `array`. Size of the array is not part of it's `type`.
  an array name can be anything we want. 
- built-in `length` property is used to determine the size of an array.
- `arraycopy` method can be used to copy data from one array into another:
   it is provided in `java.lang.System`, for copying we need to use the `System.arraycopy` like println function.
  - the function has Five parameters:
  - src: the source array
  - srcPos: the starting position in the source array
  - dst: the destination array
  - dstPos: the starting position in the destination array
  - length: number of array elements to copy.

```java
String[] names= {"ram","lakshman","bharath","ravan"};
System.arraycopy(names,0,names,1,3);  
```

- `copyOfRange` method does not require you to create the destination array before calling the method, because the destination array is returned by the method.
```java
String[] destination = java.util.Arrays.copyOfRange(copyFrom,0,1);
```
- Note that the second parameter of the `copyOfRange` method is the initial index of the range to be copied, inclusively, 
  while the third parameter is the final index of the range to be copied, exclusively.
- `Java SE` provides several methods for performing array manipulations such as copying, sorting and searching arrays.


###### Day 07

- `2D arrays` are stored as arrays of arrays. Therefore, the way 2D arrays are declared is similar 1D array objects. 2D arrays are declared by defining a data type followed by two sets of square brackets.
- `initializer lists` can be used to quickly give initial values to `2D arrays`. This can be done in two different ways.
  - If the array has not been declared yet, a new array can be declared and initialized in the same step using curly brackets.
  - If the array has already been declared, the new keyword along with the data type must be used in order to use an initializer list.
  
  ```java
  //declaring and initializing at the same time
  int[][] intValues = {{1,2,3},{9,8,7},{4,5,6}};
  
  //declaring and initializing separetly
  int[][] intNumbers;
  intNumbers = new int[][] {{2,4,5},{3,6,7},{1,8,9}};
  ```
- 2D arrays need not be rectangular, each row can be of different length.

```java
int[][] Values;
Values = new int[2][]
Values[0] = new int[2];
Values[1] = new int[6];
```
- `strings` are objects of the class `java.lang.String`. They are used to represent sequences of characters and are `immutable`, meaning their values cannot be changed once created.
- Java provides many `built-in methods` to manipulate strings, including methods for concatenation, substring extraction, searching, and pattern matching.
- Strings are commonly used in Java for representing text-based information, such as names, addresses, and other data.
- Java also provides the `StringBuilder` or `StringBuffer` class, which allows for the creation of `mutable strings` and provides efficient methods for concatenating strings.
- for `String`, each time a string is concatenated, a new object is created and it's the main reason why it's not recommended for cases where a lot of string manipulation is needed, 
instead using a `StringBuilder` or `StringBuffer` will be more efficient.
- `methods` define behaviour of an object. By using `methods` we can avoid `code duplication` and we can `re-use` software .
    

###### Day 08

- let's say if we want to pass an `array` list in a function it gives `illegal start of expression` its not going to work. That's because this kind of simplest notation which we have for creating
a `arrays`, is valid only in `declaration` statements, but we cannot use it when `invoking` a particular `method`.
```java
int[] list ={1,2,3};
search({1,2,3}, 2); //it will not invoke compilation error
search(list,2); //this is correct way of invoking
search(new int[]{1,2,3}, 2); //this way can also be used to invoke
```
- `Static methods` are class level methods. That is unlike `instance` methods they do not deal with object state.
- `Static` methods do not have access to either `instance variables` or `methods` with in the same class. i.e., from a Static method , if you directly try to access an instance variable declared 
within same class, then we'll get a compiler error. Similary we can't invoke instance mrthod within same class.
- we can use `static methods` or `variables` in `instance methods`.
- `static` stuff is `global`, which is accessible across all of the objects. So from `instance methods` you can access `static` variables or methods.


###### Day 09

- we use `pass by value` only in java. There are two ways to pass the data.
  - `primitive` argument i.e., if we can pass directly the type and variable name as a parameter, here the argument variable value is copied as a parameter. 
  - `object reference` argument i.e., we pass the object reference as a parameter, here only the `memory address` of argument is copied to the parameter.
  - *note* if the `object reference` is passed as value,if the object is modified inside the method, then the modification is reflected in the `calling environment`, which does not happend with `primitive` argument.
  - This is only because here we are dealing with an object i.e., referenced from both `calling environment` and also from within the `method`.
  
```java
void updateId(Employee e1){
	e1 = new Employee(); 
	e1.id = 4000;
}  
Employee e = new Employee();
	e.id = 3000;
	updateId(s);
```	
- by creating new object we can avoid reflection in  the calling environment even when the object is modified inside the method.
- `Method binding` refers to the process of linking a method call to the method body, at runtime, in object-oriented programming. There are two types of method binding:
  - `Static binding`(early): The method call is bound to the method body at `compile time`, meaning the binding is determined by the `type` of the object being referred to and not the `object's value`.
  - `Dynamic binding`(late): The method call is bound to the method body at `runtime`, meaning the binding is determined by the `actual object` being referred to and its `value`, rather than its type.
- `varargs` is a short form for *variable arguments*. That allows a method to accept an `indefinite number` of arguments of the same type. This means that the method can take any number of arguments of the same data type, 
rather than having to specify a fixed number of parameters. 
- The syntax for declaring a `varargs` method is to use an (three dots: "...") after the type of the last parameter in the method signature, like so:

```java
void method(int... args){}
void method(boolean flag, int... args){} 
//this allows us to call the method with zero or more arguments
method(true);
method(true,new int[]{1,2,3}) //using array
method(true,1,2,3) //comma-separated arguments
```
- restriction of `varargs` it should be last parameter and we can't have more than one varargs parameter.
- `constructors` are similar to methods but the name of it should be similar with the `className`. The main purpose is to create the objects and initialize the state of the objects.
- we can pass the parameters in constructor. When the class defination doesn't have a constructor, when we compile the class compiler inserts a constructor into the bytecode.
- if class includes the constructor in that case, the compiler will not insert the `default constructor`.


###### Day 10

- main purpose of the `constructor` is to initialize the state of an object. It does'nt have a return type, It can have varargs parameter.
- local variable always shadows the instance variable if they represent with same name. so we use `this` keyword refers to the current instance of the class. It is used to refer to the members of the current object from within the object's methods or constructors.
- `this` is actually an `instance variable` and it is allowing us to access instance variables and also instance methods. So this cannot be used within a `static method`.	
- `this()` is used to call an overloaded constructor, must be first statement in a constructor.
- we can't have more than one `this()` per constructor.	


###### Day 11

- `Arithmetic` operator applies to only primitive numberic types.
- Shorthand operators : 
  - `pre & post` increment/decrement: applies to addition & subtraction i.e (++i, --i, i++, i--)
  - `compound Arithmetic Assignment operators`: applies to all arithmetic operations (+=,-=,*=,/=,%=).
- `operand promotion` : operands smaller than int are promoted to int.
- if both operands are int,long,float or double then operations are carried in that type & evaluated to a value of that type.

```java  
System.out.println(1/2); //it will give 0 insted of 0.5
```
- `mixed-type operations`: if operands belong to different types, then smaller type is promoted to larger type.
- *order of promotion*: int -> long -> float -> double.
- *Type* of final result will be of *largest* data type
```java
char c = '2';
char char1 = 50; //both are same
```
- if we assign integer value to char then it will cast implicitly and give corresponding character value.
- we cannot use comparision operator on boolean 
```java
boolean a = true;
System.out.println("a <= true: " + (a <= true));//error bad operand types for binary operator '<='
System.out.println("a == true: " + (a == true)); //true
System.out.println("a != true: " + (a != true)); //false
```
	

###### Day 12

- All of the `logical operators`(&&,||,!) require the data type of boolean.
```java
if(age > 25 && salary){ //here salary is an int type so it gives an compilation error
  body...
}
if(age >25 && salary > 80000){ //it got to be boolean expression
  ...
}
```
- `comparator operator` has higher precedence then `&&` and `||` logical operators .
- *order of precedence*: !(not operator) > arithmetic > comparison > && , ||
- `operator precedence` of *logical operators* helps with only grouping operations. Not order of execution.
- `Bitwise operators':
  - *Bitwise AND*(&): Returns 1 only if both the input bits are 1.
  - *Bitwise OR*(|): Returns 1 if one of the input bits is 1.
  - *Bitwise XOR*(^): Returns 1 only if one of the input bits is 1,*but not both*
  - *Bitwise NOT*(~): inverts bits i.e., if x=1 it gives ~x->-2
- non short circuit operators always check for both operands
- *bitwise operators* can only be applied on integers or boolean operations.
- Among bitwise, &, |, and ^ can be used with boolean operands. Bitwise NOT (~) will not even compile with boolean. If we need such a behavior, then we would use logical NOT (!) operator.  
- Also, strictly speaking to be consistent with the *Java Language Specification* (JLS), &, | and ^ when applied on `boolean operands` are referred to as *logical operators* and not *bitwise*.
- *left shift operator*(<<): Left shifts left operand by n bits specified on right
  - it is like multiplication by powers of 2
- *unsigned right-shift operator*(>>>): Right shifts left operand by n bits specified on right
  - same as division by powers of 2
- `&&` can be used to prevent `NullPointerException`.  
```java
if(obj != null && obj.id == 10)
    ...
```	


###### Day 13

- `switch` can take an enum or an `integer (byte, short, char, int)` expression or a corresponding wrapper class. At runtime when the variable is evaluated, the primitive value will be unwrapped and will be compared with the case labels.
- switch expression can also be a `String` (from Java 7 onwards).
- as we can have object references as switch expression, there is a possibility of it evaluating to null leading to a NullPointerException.
- the value of the case label must be unique, non-null, within the range of the data type of the switch expression and should be known at compile time itself.
- `switch` is preferred over *if statement* becuase in if statement we have to check every statement one after another, but in switch case we jump directly to the corresponding case block. 
- a `ternary` expression can't be used as a standalone statement.
- true & false expressions in a ternary operation cannot be an invocation to a method with void as return type. 
```java
 int result = (x > y)? x : y;
 (x > y)? x : y; //error
```
- ternary expression cannot be used as an expression statement.


###### Day 14

- *infinite loop* can be achived by `while loop` .
```java
long z = 0;
      while (true) {
        System.out.println(z);
        z++;
```
- break statement exits immediately enclosing switch or loop but it can't be used for *if statement*.
- we can use break label for if block .
```java 
label:
 if(true){
  break label;
  }
```  
- we also have *continue* statement which will skip the current iteration and continues on to the next iteration.
- the method that invokes itself is also referred to as a `recursive` method, and we refer to such an invocation call as a recursive call.
- when a method invokes itself, it essentially means that the method is actually executing again. And during that execution, it may make another recursive call. And so the method would execute once again.
- So this process of re invoking itself and the method executing again can happen for a certain number of times until a condition is met in one of the executions of the method.


###### Day 15

- if we want to access a *class* from another package then it should have the `public` access modifier, not required if we are accessing it from the same package.
- there are four access modifiers:
  - *private*: only accessible within the class and cannot be accessed outside of it.
  - *default*: accessible inside package
  - *protected*: inside package accessible within the class and its subclasses.
  - *public*: accessible from anywhere in the program, both within the class and outside of it.
- `Package names`: Package names should be all lowercase and use reverse domain name notation. For example: "com.example.mypackage".	
- an object of a class can access private members of another object of the same class. If something is declared private, it means it is private to its class, but not among
the objects of its class.
- we can read data from keyboard using `Scanner` we have different methods for different data types.

```java
import.java.util.*;
Scanner sc = new Scanner(System.in);
int x = sc.nextInt();
System.out.println(x);
```
- for using Scanner we need to import util package.


###### Day 16  


- the *string pool* is a memory area in the heap where the JVM stores all string literals. When we create a string literal, the JVM first checks the string pool to see 
if an identical string already exists. If it does, the JVM simply returns a reference to that string, rather than creating a new String object. 
This helps to conserve memory, as the JVM only needs to store one copy of each unique string value in memory.
- a string literal is also a string object. Below are a few ways to initialize a String object.
```java 
String s = "Java";

String s1 = new String();
String s2 = new string(s);

char[] c ={65, 66, 67, 68};
String s3 = new String(c);
```
- when we create a string using the `new` keyword, a new String object is always created in the heap, separate from the string pool. The contents of this String object can be the 
same as a string in the pool, but it is still a separate object in memory, with its own memory address.
- If you are saying ,`str1==str2` , then it will check the references means, *addresses of the objects* that are different.
- And if you say `str1.equals(str2)`, it will check the *contents of the string*. So these two are different.
- The `valueOf()` method is a static method in the String class in Java that is used to convert different types of values (such as integers, doubles, booleans, and characters) into a String representation.
- For example, to convert an integer to a String, you can use the valueOf() method as follows:
```java
int myInt = 455;
String myString = String.valueOf(myInt);
```
- This will create a `String` object with the value "455".
- Similarly, we can use the `valueOf()` method to convert other types of values to String objects, like:
```java
double myDouble = 3.141;
String str1 = String.valueOf(myDouble);

boolean myBoolean = true;
String str2 = String.valueOf(myBoolean);

char myChar = 'a';
String str3 = String.valueOf(myChar);

/*
 In each case, the `valueOf()` method is used to convert the original value
 to a `String` representation that can be used in various ways within a program.
 */
```


###### Day 17

- Java provides a way to share `String objects` that have the *same content* by using the `intern()` method.
- When you call the `intern()` method on a `String object`, Java checks if a String object with the same content is already stored in the pool of `interned String objects`, which is a special area of the heap 
where String objects that are interned are stored. 
- If a String object with the same content is found, the intern() method returns that object instead of creating a new object in the heap.
- Example of intern() method:
```java
String s1 = "Hello, world!";
String s2 = "Hello, world!".intern();
String s3 = new String("Hello, world!");
System.out.println(s1==s3.intern()); //true
```
- str2 has been interned using the `intern()` method. When the intern() method is called on "Hello, world!", Java checks if a String object with the same content is already in the pool of `interned String objects`. 
Since "Hello, world!" is a commonly used String in Java programs, it's very likely that it's already in the pool of interned String objects. In this case, the intern() method returns the String object from the pool instead of creating a new object in the heap. 
As a result, str1 and str2 reference the same object in the heap.
- string object is immutable, a string reference however can be re-assigned as manytimes as we want.


###### Day 18

- classes can only have `public` or `default` access specifiers. 
- all the methods in java.lang.Math are static.
- the Math class is non-instantiable, which means we can't create it's objects. This can be achieved by making the default constructor `private`.
- there are two types of initializers, static initializer and instance initializer.
- `static` initializers are used to initialize the static variables. A static initializer is declared using the static keyword, and it is executed only once when the class is loaded.
- static initializers are useful when we need to initialize `static` variables with a value that can't be computed at compile time.
we can't reference `instance` variables from `static` intializers.
```java
public class MyClass {
    static {
        // static initialization code here
    }
}
```
- instance initializers are used to initialize instance variables. The syntax is similar to static initializer but without the static keyword.
- a constructor can also be used to initialize instance variables but instance initializers are helpful if we want to share a block of code between multiple constructors i.e., Java compiler copies initializer blocks into the beginning of every constructor.
- we can reference static variables from instance initializers.
- a `final` variable is a variable that cannot be reassigned once it has been initialized. Once a final variable is assigned a value, that value cannot be changed.
```java
final int a = 5;
a = 10; // This will result in a compiler error
```
- `final` variables are often used to declare `constants` in Java. Here is an example:
```java
final double PI = 3.14159;

//'PI' is a constant that cannot be changed once it has been initialized.
```
- final variables can be declared as class-level variables, instance variables, or local variables. When a final variable is declared as a class-level or instance variable, it must be initialized in the declaration or in the constructor of the class. 
When a final variable is declared as a local variable, it must be initialized before it is used in the code.
- `constant` variables must be initialized in the same line of declaration statement.


###### Day 19

- documentation comments use `/** ...*/` uses something similar to block course but here it uses two asterisks . they are generally referred to as javadoc comments.
- prior to Java 5 one had to manually create a boxed primitive by invoking either it's constructor or by `valueOf` method. But in Java 5 a feature called `auto-boxing` was introduced, meaning the compiler can automatically box a primitive if needed.
```java
// auto-boxing
Integer i = 9;  // Integer i = new Integer(9);
// auto-unboxing
int j = i;      // int j = i.intValue();
```
- auto-boxing can also be seen in method invocation
```java
//auto-boxing
void go(Integer boxed) {}
go(55);               // compiler will wrap it before invocation
//auto-unboxing
void go(int i) {}
go(new Integer(65));  // compiler will unwrap it before invocation
```
- it is also possible to directly perform arithmetic operations on boxed primitives.
```java
Integer i = 5;
i++;
int j = 4 * i;
```
- two box primitives can have same value but different identities.
- `box primitives` which are object references can work with comparision operators.
- `<`, `>`, `>=` and `<=` on boxed primitives will lead to `auto-unboxing` but in case of `==` and `!=` the *addresses* will be compared.


###### Day 20

- sub class can access members of super class, but super class can never access members of subclass.
- inheriting of members applies to only non-private members of superclass.
- `inheritance` helps in code reuse, code duplication is removed.
- `subclasses` are specialized versions of `super classes` i.e., they can do whatever their super classes do and in addition they can also do their own features.
- a class would inherit members from all its super classes in the hierarchy, i.e., inheriting members is not restricted to only its direct superclass.
- `extends` keyword is used in the class declaration to build an inheritance relationship.
- class can extend from *only one* class.
```java
class A{} 			//super class
class B extends A{}	//sub classes
class C extends B{}
class E extends A{}
class E extends B{} //error
```
- `protected` members can be accessed by any subclass and the subclass need not be in the same package.
- whereas `default` members can be accessed by subclasses that are in the same *package*.


-