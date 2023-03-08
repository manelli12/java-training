## Learnings in Java ...

<details>
<summary>Days...</summary>
<a href="#day-01-">01</a> *
<a href="#day-02-">02</a> *
<a href="#day-03-">03</a> *
<a href="#day-04-">04</a> *
<a href="#day-05-">05</a> *
<a href="#day-06-">06</a> *
<a href="#day-07-">07</a> *
<a href="#day-08-">08</a> *
<a href="#day-09-">09</a> *
<a href="#day-10-">10</a> *
<a href="#day-11-">11</a> *
<a href="#day-12-">12</a> *
<a href="#day-13-">13</a> *
<a href="#day-14-">14</a> *
<a href="#day-15-">15</a> *
<a href="#day-16-">16</a> *
<a href="#day-17-">17</a> *
<a href="#day-18-">18</a> *
<a href="#day-19-">19</a> *
<a href="#day-20-">20</a> *
<a href="#day-21-">21</a> *
<a href="#day-22-">22</a> *
<a href="#day-23-">23</a> *
<a href="#day-24-">24</a> *
<a href="#day-25-">25</a> *
<a href="#day-26-">26</a> *
<a href="#day-27-">27</a> *
<a href="#day-28-">28</a> *
<a href="#day-29-">29</a> *
<a href="#day-30-">30</a> *
<a href="#day-31-">31</a> *
<a href="#day-32-">32</a> *
<a href="#day-33-">33</a> *
<a href="#day-34-">34</a> *
<a href="#day-35-">35</a> *
<a href="#day-36-">36</a> *
<a href="#day-37-">37</a> *

</details>


###### Day 01 [^](#learnings-in-java- "Back to Top")

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
  
  
###### Day 02 [^](#learnings-in-java- "Back to Top")

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
  
  
###### Day 03 [^](#learnings-in-java- "Back to Top")
  
- `Variables` is like a container used to store values. A `Variable` is a named storage location in memory, stored Values can be changed during Program Execution.
   it has `Type` that determines what kind of Values they can store. An `Identifier`(name) that is used to access the values stored in Variable.
- Once the Variable Type is set it can not be changed later as Java is a `Statically Typed Language` meaning that type of a variable must be specified when it is
  declared and cannot be changed afterwards.
- Three types of variables are there in Java:
  - Local Variables: declared in methods, constructors or blocks.
  - Instance Variables: declared in class but outside any methods, constructors or blocks.
  - class/static Variables: declared with the `static` keyword in a class but outside any methods, constructors or blocks.
-`static variables`: There would be one copy of each class variable per class, regardless of how many objects are created from it.


###### Day 04 [^](#learnings-in-java- "Back to Top")

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


###### Day 05 [^](#learnings-in-java- "Back to Top")

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


###### Day 06 [^](#learnings-in-java- "Back to Top")

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


###### Day 07 [^](#learnings-in-java- "Back to Top")

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
    

###### Day 08 [^](#learnings-in-java- "Back to Top")

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


###### Day 09 [^](#learnings-in-java- "Back to Top")

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


###### Day 10 [^](#learnings-in-java- "Back to Top")

- main purpose of the `constructor` is to initialize the state of an object. It does'nt have a return type, It can have varargs parameter.
- local variable always shadows the instance variable if they represent with same name. so we use `this` keyword refers to the current instance of the class. It is used to refer to the members of the current object from within the object's methods or constructors.
- `this` is actually an `instance variable` and it is allowing us to access instance variables and also instance methods. So this cannot be used within a `static method`.	
- `this()` is used to call an overloaded constructor, must be first statement in a constructor.
- we can't have more than one `this()` per constructor.	


###### Day 11 [^](#learnings-in-java- "Back to Top")

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
	

###### Day 12 [^](#learnings-in-java- "Back to Top")

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


###### Day 13 [^](#learnings-in-java- "Back to Top")

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


###### Day 14 [^](#learnings-in-java- "Back to Top")

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


###### Day 15 [^](#learnings-in-java- "Back to Top")

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


###### Day 16   [^](#learnings-in-java- "Back to Top")


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


###### Day 17 [^](#learnings-in-java- "Back to Top")

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


###### Day 18 [^](#learnings-in-java- "Back to Top")

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


###### Day 19 [^](#learnings-in-java- "Back to Top")

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


###### Day 20 [^](#learnings-in-java- "Back to Top")

- sub class can access members of super class, but super class can never access members of subclass.
- inheriting of members applies to only non-private members of superclass.
- `inheritance` helps in code reuse, code duplication is removed.
- `subclasses` are specialized versions of `super classes` i.e., they can do whatever their super classes do and in addition they can also do their own features.
- a class would inherit members from all its super classes in the hierarchy, i.e., inheriting members is not restricted to only its direct superclass.
- `extends` keyword is used in the class declaration to build an inheritance relationship.
- class can extend from `only one` class.
```java
class A{} 			//super class
class B extends A{}	//sub classes
class C extends B{}
class E extends A{}
class E extends B{} //error
```
- `protected` members can be accessed by any subclass and the subclass need not be in the same package.
- whereas `default` members can be accessed by subclasses that are in the same *package*.


###### Day 21 [^](#learnings-in-java- "Back to Top")

- is-a test is a fundamental test that can be used to check inheritance relationship. If it is failing then inheritance relation should not be applied.
- with `polymorphism`, a supertype can be assigned any of it's subtypes. It means that the type of object reference and the actual object referenced can be different,
the type of object reference has to be a supertype of the actual object that is being referenced.
- a supertype is defining the common protocol for all its subtypes.
- compiler uses reference type to decide on whether a method can be invoked on an object reference or not, so it doesn't use the object type, but it uses the reference type to make decision.
```java
/*ref type*/  /*obj type*/
User user = new Editor();
user.approveReview()	//compiler error as User doesn't have this method
```
- but at runtime, JVM uses the actual object type to decide on which method is invoked. It invokes the most specific version of the method in the inheritance tree, 
starting from the object type and moving upwards in the tree.


###### Day 22 [^](#learnings-in-java- "Back to Top")

- once implicit casting on an inherited class is done, we can only invoke those subclass methods which are also defined in the super-class but sub-class specific methods become invalid. 
To address this we need to use explicit casting.
```java
Staff s = new Editor();
s.approveReview();             // invalid
((Editor) s).approveReview();  // valid
```
- `instanceof` operator is used to check whether an object reference is indeed an instance of the class. Note that it is the object type, but not the reference type that matters. 
Also the object referenced by the variable can be a subclass of the class specified on the right side, it doesn't have to be a direct instance.
```java
User u = new User();
Staff s = new Staff();
User us = new Staff();

System.out.println(u instanceof User);    // true
System.out.println(u instanceof Staff);   // false
System.out.println(s instanceof Staff);   // true
System.out.println(s instanceof User);    // true
System.out.println(us instanceof User);   // true
System.out.println(us instanceof Staff);  // true
```
- `Type safety` is the extent to which a programming language prevents something `type errors`. One example could be invoking 
non existing method on an object.
```java
staff.approveReview()	//method doesn't include in staff class
```
- `generics` is all about type safety at compile time, before generics many of the errors were only caught at runtime, 
but with the introduction of generics in java5 many of the error are got at compile time itself.


###### Day 23 [^](#learnings-in-java- "Back to Top")

- Method Overriding Rules: 
  - *Rule 1* : method parameters must be same and return type must be same as in the superclass method or must be a subclass.
  - *Rule 2* : can't be less accessible means access level must be same or friendlier, e.g., we can't override a public method and make it private.
- `super` keyword is used to access superclass method from subclass and is typically used for extending behavior defined in superclass.
- super keyword can be used in two ways: to call the constructor of the superclass, and to call the method of the superclass.
- `super` is related to objects so it can't be used inside a static method. 
- the `super()` method can be used to explicitly to invoke a superclass's constructor, however it must be the first statement.
- a constructor can have either `this()` or `super()` but not both.
- `method binding` is the process of connecting a method call to the actual implementation of the method. There are two types of method binding:
  - *static binding*: it occurs at compile time, where the compiler resolves the method call based on the declared type of the object.
  - *dynamic binding*: it occurs at runtime, where the actual implementation of the method is determined based on the runtime type of the object.
- static methods, final methods, fields i.e., both static and instance variables can't be overridden, only instance methods can be overidden.  
- static methods can not be overridden since they are bounded at compile time and method overriding relies on dynamic binding at runtime. 
If static methods are redefined by a derived class, then it is not Method Overriding but Method Hiding.  


###### Day 24 [^](#learnings-in-java- "Back to Top")

- an `object class` is the parent class of all other classes. Every class in Java is directly or indirectly derived from the Object class. 
This means that the `Object class` provides a set of methods and fields that are inherited by all classes in Java.
- The Object class defines several important methods, such as:
  - equals(): compares two objects for equality
  - hashCode(): returns a hash code value for an object
  - toString(): returns a string representation of an object
  - getClass(): returns the class of an object
  - finalize(): called by the garbage collector when an object is no longer needed
  - clone() : Protected method, creates a new object with the same values as the original 
- if we pass `this` to *System.out.println()* then it automatically invokes `toString()`. If the `toString()` method is overridden then it'll get invoked.
- inherited methods might depend on superclass state that's why superclasses must be initialized first. This means that all the superclass constructors should run before the subclass constructor.
This is acheived by constructor chaining, where a subclass implicitly calls the superclass constructor and this process goes on until Object class's constructor is invoked.
- there are two ways to prevent inheritance:
  - by making the class `final` (not extendible but instantiable e.g., *String* class)
  - by making the constructor `private` (neither extendible nor instantiable e.g., *Math* class)
- the reason why making the constructor private prevents inheritance is because the private access modifier makes the constructor private to the class and so it can not be invoked from the subclass 
which means constructor chaining is not possible and hence the subclass can not be created. 


###### Day 25 [^](#learnings-in-java- "Back to Top")

- `abstract` class cannot be instantiated, but it can be used as a base class for other classes.
- To declare an abstract class , the keyword `abstract` is used in the class declaration. 
- Abstract classes may contain abstract methods, which are methods *without implementation* that are declared with the keyword `abstract`. Subclasses must provide an implementation for these abstract methods.
```java
abstract class Animal {
    String name;
    
    public Animal(String name) {
        this.name = name;
    }
    
    public abstract void makeSound();
}
```
- Any class that extends *Animal* must implement the *makeSound()* method.
- abstract class also have `concrete` methods, which are methods with implementation. Subclasses can use these concrete methods without having to implement them again.
- abstract class can also have a constructor, i.e., you can add a constructor. However, this constructor will ONLY be accessible from a subclass constructor as it is not possible to instantiate an abstract class.
- if we do not include a constructor in an abstract class then compiler inserts a no-arg constructor implicitly just like in the case of a normal class.
And this implicitly created constructor will also be invoked from the subclass as part of constructor chaining process and this constructor will in turn invoke the super class constructor, i.e., includes a super().
- java does not support `multiple inheritance` as it could lead to a problem called *deadly diamond of death* where a class inherits from two or more classes that have a common parent class with a conflicting method.


###### Day 26 [^](#learnings-in-java- "Back to Top")

- an `interface` is a collection of abstract methods and constants.
- prior to java8, it used to be only public abstract methods, but since java8 onwards an interface can also have concrete methods.
- interfaces will not have any state i.e., they cannot have instance variables.
- `interface` just states what methods it represents and does not say anything about the method implementation, that would be provided by subclasses of the interface.
- Defining an interface:
  - *public* & *abstract* by default
  - variables are *public*, *static* & *final* by default
  - All members are *public* by deafault
  - Members can't be *private* & *protected* 
```java
interface MyInterface {
    void method1();
    int method2(String arg);
    double PI = 3.14159;	//static final 
}
```
-  From Java 9, interfaces can have *private* methods too just like in regular classes, i.e., these are concrete methods.
- we can implement multiple interfaces but can only inherit one (as Java doesn't support Multiple Inheritance). Moreover an interface can have multiple subclasses from multiple packages.
- interfaces are imported just like classes.
- a class implementing an interface is a subtype of that interface due to which the following is possible:
```java
Interface obj = new MyClass();
MyClass obj = new MyClass();
Interface obj = new Interface();  // not possible
```
- an interface can only be a reference type and it can never be an object type.
- prefer interface over abstract class. try to use an interface as a reference type
in all kinds of variable declarations and also use them as method return types.
```java
void foo(ArrayList list) {
    // we can invoke this method with an `ArrayList` only
    // i.e., we can not pass another similar implementation
}
foo(new ArrayList());

void bar(List list) {
    // as `List` is an interface, we can pass any type which implements it
}
bar(new ArrayList());
bar(new LinkedList());
bar(new TreeList());
```


###### Day 27 [^](#learnings-in-java- "Back to Top")

- `Marker interfaces` does not have any methods i.e., they have empty body. They are mainly used to mark or tag a class having certain property.
some example marker interfaces in the java API:
  - *java.util.RandomAccess* : any class implementing this interface declares that it allows fast, random access of its elements, ArrayList is one class that implements this interface.
  - *java.io.Serializable* : this interface declares that it allows its objects to be serialized, which means that the objects can be converted into byte streams, which can be saved to a file or transmitted over a network. 
    This process is useful for saving the state of an object and for transferring objects between different applications or systems.
  - *java.lang.Cloneable* : by implementing this interface a class declares that its objects can return their clones i.e., a duplicate object having the same state as the original.	
- to use the `clone()` method, a class must implement the `Cloneable` interface. If a class attempts to call `clone()` on an object that does not implement Cloneable, a CloneNotSupportedException will be thrown at runtime.
- the clone() method performs a shallow copy, which means it creates a new object with the same contents as the original object, but the contents themselves are not cloned.
 Instead, the new object contains references to the same objects as the original. Therefore, any changes made to the objects referred to by the new object will also affect the original object and vice versa.  
- the `default` keyword is used in interfaces to define a default implementation for a method (from Java 8 onwards). 
The method can be called from any class that implements the interface, but can be overridden by any implementing class if necessary. Also, these are instance methods.
- it's an interface method with the default implementation and the subclass can provide a more specific implementation. which means `default` methods can never be `final`.
- below are few benefits of default methods:
  - interface evolution (main purpose)
  - default implementation can be overridden
  - Eliminate Utility classes (is the class in Java package)(e.g., list.sort() instead of Collection.sort(List))
  - allow interface to stay as functional interface (an interface with exactly one abstract method)
- From Java9 onwards, interfaces can have private methods. A private method can be a static method or a non-default instance method. 
- unlike static methods in classes, static methods in interfaces are not inherited.
- unlike classes, static methods in interfaces can only be invoked via interface name but not from an object reference. 


###### Day 28 [^](#learnings-in-java- "Back to Top")

- an `exception` is simply an object of `java.lang.Throwable` or one of it's subclasses.
- `java.lang.Throwable `is the super-class of all exception related classes.
- `exception` is an object of class `throwable` that represent an unusual condition or *error* that occurs during the execution of a program. 
Exception handling is the process of handling these exceptional conditions in a controlled and graceful manner, rather than allowing them to cause the program to 
terminate or behave in an unpredictable manner.
```java
public class Example {
    public static void main(String[] args) {
        try {
            // some code that may throw an exception
            int x = 5 / 0;
        } catch (ArithmeticException e) {
            // handle the exception here
            System.out.println("An arithmetic exception occurred: " + e.getMessage());
        } finally {
            // this block is executed whether or not an exception was thrown
            System.out.println("This code always gets executed.");
        }
    }
}
```
- In this *example*, the `try` block contains code that may throw an *ArithmeticException* (in this case, dividing by zero). If an exception is thrown, the program execution jumps to the `catch` block, 
which handles the exception by printing an error message.
- The `finally` block is optional and is executed whether or not an exception was thrown. This can be useful for cleaning up resources or performing other actions that must always be performed, 
regardless of whether an exception occurred.
- The `throws` keyword is followed by one or more exception classes, separated by commas.
- The `throws` keyword is not used to actually throw an exception; it is only used to declare that a method may throw an exception of a certain type. To actually throw an exception, we use 
the throw keyword followed by an instance of the exception class.
```java
import java.io.FileNotFoundException;

void example() throws FileNotFoundException {
    if (someCondition)
        throw new FileNotFoundException();
}
```
- To get the `left-justified` column, you need a percentage symbol, a minus symbol, the number of characters, and then the letter "s" (lowercase). So `%-15s` means fifteen characters left-justified.
- Exception objects can be referenced polymorphically.
```java
void example() throws IOException, FileNotFoundException { ... }
void example() throws IOException { ... }
```
- as FileNotFoundException is a subclass of IOException.


###### Day 29 [^](#learnings-in-java- "Back to Top")

- exceptions are classified into two categories:
  - `Checked exceptions`: These are exceptions that are checked at compile time. Any method that can potentially throw a checked exception must either handle the exception using a `try-catch` block,
  or declare that it throws the exception using the `throws` keyword. Examples of checked exceptions include *IOException*, *SQLException*, and *ClassNotFoundException*.
  - `Unchecked exceptions`: These are exceptions that are not checked at compile time. They typically indicate programming errors or other unexpected conditions that are not recoverable.
  Examples of unchecked exceptions include *NullPointerException*, *ArrayIndexOutOfBoundsException*, and *ClassCastException*.
- below are couple of rules when it comes to exceptions & method overriding:
  - If the super class method does not declare an exception, then the overriding method in the subclass cannot declare a checked exception, but can declare an unchecked exception.
  - If the super class method declares a *checked exception*, then the overriding method in the subclass can declare same exception or a subclass exception or no exception at all, but cannot declare parent exception.
  - If the super class method declares an *unchecked exception*, then the overriding method can declare any unchecked exception or no exception at all, but cannot declare a checked exception.
- before *Java 7*, resources such as file *I/O streams* had to be explicitly closed in a `finally` block. Below is a standard template of what was done before Java 7:
```java
FileInputStream in = null;
try {
    in = new FileInputStream(filename);
    // read data
} catch (FileNotFoundException e) {
    ...
} finally {
    try {
        if (in != null)
            in.close();
    } catch (IOException e) { ... }
}
```
- `try with resources` block is a feature introduced in *Java 7* that simplifies the process of working with resources that must be closed after use, such as files, streams, and database connections.
- `java.lang.AutoClosable` is mainly used to automatically close resources and it provides a cleaner syntax then using *finally* for closing the resources
- When working with *resources* that implement the `AutoCloseable` interface, it is best to use a `try-with-resources` block to ensure that the resources are properly closed. 
The try-with-resources block automatically calls the `close()` method on the resources at the end of the block, regardless of whether an exception is thrown.
- Here's an example of how to use a try-with-resources block to work with an AutoCloseable resource:
```java
try (FileInputStream in = new FileInputStream(filename);
    FileOutputStream out = new FileOutputStream(filename)) {
    // read data
} catch (FileNotFoundException e) {
    // handle the exception
} catch (IOException e) {
    ...
}
```
- since the resource are being automatically closed, this particular feature is referred to as Automatic Resource Management i.e., `ARM`.
- multiple resources can also be created within the `try` parenthesis and must be separated using `;`
  - The resources are created sequentially, once the try-catch block is evaluated the resources are closed in the reverse order.


###### Day 30 [^](#learnings-in-java- "Back to Top")  

- use checked exceptions for recoverable conditions and runtime exceptions for programming errors.
- `Exception translation` and `chaining` are techniques that can be used to provide more meaningful error messages and to help diagnose and fix issues in our code.
- Exception translation involves catching an exception and throwing a new exception with a different type or message that is more appropriate for our application or library.
 This can be useful if the original exception is too low-level or does not provide enough information for the caller to understand the problem.
- Exception chaining involves creating a new exception and setting the original exception as the cause of the new exception. 
This can be useful because it preserves the original stack trace and exception message, making it easier to diagnose and fix issues.
- `exception chaining`, also known as exception wrapping, is a technique used to associate one exception with another. It is a way to provide additional context about an exception and its cause.
 It is useful when an exception occurs deep within the call stack, but the root cause of the problem may be higher up in the stack. By wrapping the original exception with another one, we can pass 
 the original exception up the call stack while providing more context about what caused it.
- to chain exceptions, we can pass the original exception to the constructor of a new exception. This new exception becomes the "wrapper" exception, and the original exception becomes its cause. 
We can then throw the wrapper exception, which includes information about both the original exception and the reason why it occurred.
- in this example, if an *FileNotFoundException* occurs, we wrap it in a new *RuntimeException* and pass the original exception as its cause. When the RuntimeException is thrown, it includes information 
about the original exception and the reason why it occurred. This can be useful for debugging and troubleshooting issues in a system.
```java
try {
	readFromFile("example.txt");
} catch (FileNotFoundException e) {
	// Wrap the original exception with a new exception
	throw new RuntimeException("Error reading file", e);
}  
```	


###### Day 31 [^](#learnings-in-java- "Back to Top")

- the `assert` keyword takes a boolean expression as an argument and throws an AssertionError if the expression evaluates to false. 
If the expression is true, the program continues to execute normally.
```java
public int divide(int dividend, int divisor) {
    assert divisor != 0 : "Divisor cannot be zero";
    return dividend / divisor;
}
```
- assert statements should not be used for program logic or error handling that are essential for the correct functioning of the program.
 Instead, they should be used as a tool for testing and debugging during development.
- assertions can be enabled or disabled (default) at class or package level by using `-ea/-enableassertions` or `-da/-disableassertions` flags respectively.
- java comes with two sets of packages:
  - java.io: Stream IO
  - java.nio: New IO(introduced in Java4)
- with in `Stream IO` there are two sets of packages:
  1. `byte` strings under use for handling *binary data* such as images.
  2. `character streams` under use for handling characters like Ex-Files under that exploit.
- `Endianness` refers to the way in which computer systems store multi-byte data types, such as integers and floating-point numbers, in memory. In a little-endian system, 
the least significant byte of a multi-byte data type is stored at the lowest memory address, while in a big-endian system, the most significant byte is stored at the lowest memory address.   
- the endianness of multi-byte data types is standardized and defined by the *Java Virtual Machine* Specification. The JVM specification requires that all Java Virtual Machines, regardless of the underlying hardware architecture,
 must store multi-byte data types in memory using big-endian byte order.
- This means that Java programs can rely on a consistent and predictable endianness across all platforms and architectures. Additionally, the Java programming language provides built-in methods 
to convert between big-endian and little-endian byte order, which can be useful in situations where data needs to be transmitted or received in a different endianness than the platform's default.
- Big Endian(BE) : MSB stored at *lowest* memory address.
- Low Endian(LE) : MSB stored at *highest* memory address.
- Byte Order Mark tells which endian to use i.e., for BE ~ FEFF and for LE ~ FFFE.


###### Day 32 [^](#learnings-in-java- "Back to Top")

- in stream IO reading and writing is handle by *streams* and a stream is basically a connection between a program and a data source or sink and is basically represented by a class and is also specific to type of source or sink.
- if you want to read some data from a source then we would use an `input` stream. if we want to write some data to destination then we would use an `output` stream.
- Streams classification:
  - *Byte Streams* : to process non-character data like *images*
  - *Character Streams* : to process character data like *text* classes that fall under characteristics are used.
- `InputStream` is a Base `abstract` class for all *byte* input streams and it is used to *read* data in groups of 8-bit bytes
```java
abstract void read()throws IOException
//read groups of bytes
int read(byte[] b, int offset, int length) throws IOException
//it is a concrete method
```
- `OutputStream` is a Base `abstract` class for all *byte* output stream and it is used to *write* data in groups of 8-bit bytes.  
```java
abstract void write(int) throws IOException 
//write groups of bytes
void write(byte[] b, int offset, int length) throws IOException
```
- `open-closed` principle says that classes should be open for extension but closed for modification.
- `Reader` is a Base `abstract` class for all *character* input streams and is used to *read* 16-bit chat data in *UTF-16* format
```java
abstract int read(char[] cbuf, int off, int len) throws IOException
```
- `Writer` is base `abstract` class for all character *output* streams is used *write* 16-bit char data to a destination and destination may use diff char format.
- *InputStreamReader* from bytes to characters while *OutputStreamWriter* would translate from characters to bytes, benefit of using these two classes is they are general purpose
and more over we can set the character encoding of our choice.
```java
public InputStreamReader(InputStream in, String charsetName)
public OutputStreamWriter(OutputStream out,String charsetName)
```
- an example, here we want to read context of *text file*. So we must create a file input stream object and then we pass it as an argument to input stream reader.
and character encoding is specified as *UTF-8*
```java
FileInputStream in = new FileInputStream("go.txt");
InputStreamReader reader= new InputStreamReader(in, "UTF-8");
```
- an example of using a buffered reader for reading a text file
```java
StrinBuilder text =new StringBuilder();

try(BufferedReader in = newBufferedReader(new 
	InputStreamReader(new FileInputStream("go.txt"),"UTF-8"))){
	String line;
	while((line = in.readLine()) != null){
		text.append(line).append("\n");
	}
	}catch(IOException e){
		e.printStackTrace();
	}
```
- `readLine()` method reads a line of text from an input stream and returns it as a String object.	


###### Day 33 [^](#learnings-in-java- "Back to Top")

- `Serialization` is the process of converting an *object* into a stream of *bytes* that can be transmitted over a network or stored in a file or database. 
`Deserialization` is the process of recreating the object from the serialized form.
- process of `serialization` should implement marker `java.io.Serializable` and to do actual serialization and deserialization
we use classes *ObjectOutputStream* and *ObjectInputStream` respectively .
- Serialization example:
```java
//Serialization
ObjectOutputStream out = new ObjectOutputStream(new BufferedOutputStream(
	new FileOutputStream("object.ser")));
out.writeObject("the current Date and Time is");
out.writeObject(new Date());

//Deserialization
ObjectInputStream out = new ObjectInputStream(new BufferedInputStream(
	new FileInputStream("object.ser")));
String str = (String) in.readObject(); //downcast from object
Date date = (Date) in.readObject();
```
- both *Primitives* and *Arrays* are serializable by deafault.
- serialization saves the entire object graph i.e., if an object is serialized than any objects it references or any object those object reference will all be serialized.
now if one object in object graph does not implement the serializable interface then serialization of the original object fails. Also within the object graph if the same object
is referenced multiple times then serialization saves the object only once 
- *Static* variables are *not* serializable becuase serialization is about *objects*. So during Deserialization a static variable will be assigned the value the class has at that particular instance of time.


###### Day 34 [^](#learnings-in-java- "Back to Top")

- the Collections Framework can be divided into two parts (collections & map). All the implementations are `Serializable`, `Cloneable`, most allow `null` and none of them are Synchronized 
i.e., they can be accessed by multiple threads at the same time.
- `Collections` are classified as *List*, *Set*, *Queue*
  -*List*: ArrayList, LinkedList
  -*Set*: SortedSet ~ HashSet, TreeSet, LinkedHashSet
  -*Queue*: Deque ~ ArrayDeque, LinkedList
- *Maps*: SortedMap ~ HashMap, TreeMap, LinkedHashMap  
- `Vector`, `Stack` and `Hashtable` are *legacy implementations* which support *synchronization*, however it is recommended to not use them anymore as synchronization slows things down,
instead use `ArrayList`, `ArrayDeque` and `HashMap` respectively.
- Collection has various sub-interfaces but it has only one direct sub-class i.e., `AbstractCollection` which provides the skeletal implementation of it.  
- the `java.util.Collection` interface includes several methods common to all collections which can be broadly classified into 3 categories:
  - 1.Basic Operations
  - 2.Bulk Operations
  - 3.Array Operations
```java  
public interface Collection<E> extends Iterable<E> {
    // Basic Operations
    boolean add(E element);                      // optional
    boolean remove(Object element);              // optional
    boolean contains(Object element);
    int size();
    boolean isEmpty();
    Iterator<E> iterator();

    // Bulk Operations
    boolean addAll(Collection <? extends E> c);  // optional
    boolean removeAll(Collection<?> c);          // optional
    boolean retainAll(Collection<?> c);          // optional
    boolean containsAll(Collection<?> c);
    void clear();                                // optional

    // Array Operations
    Object[] toArray();
    <T> T[] toArray(T[] a);
    // e.g., String[] a = c.toArray(new String[0]);
}
// Note: "optional" means the subclass need not support it
// i.e., it will define an empty method that will throw an UnsupportedOperationException.
```
- the `java.util.List` interface is useful when *sequence/positioning* matters. It models a resizable linear array with indexed access which can have duplicates.
```java
public interface List<E> extends Collection<E> {
    // Positional Operations
    E get(int index);
    E set(int index, E element);                           // optional
    void add(int index, E element);                        // optional
    boolean add(E element);                                // optional
    E remove(int index);                                   // optional
    boolean addAll(int index, Collection<? extends E> c);  // optional

    // Searching Operations
    int indexOf(Object o);
    int lastIndexOf(Object o);

    // Iteration Operations
    ListIterator<E> listiterator();
    ListIterator<E> listiterator(int index);

    // Range-view Operations
    List<E> subList(int fromIndex, int toIndex);
}
```
- `java.util.ArrayList` is an *array* implementation of the List interface and is resizable too.
```java
public class ArrayList<E> 
extends AbstractList<E>
implements List<E>, RandomAccess, Cloneable, java.io.Serializable
```
- the size of the internal array in `ArrayList` increases by 50% when it is full by default. This means that if the current capacity of the ArrayList is N, then the new capacity will be N + (N/2).
 The capacity of an ArrayList can be increased by using the `ensureCapacity()` method, useful when adding a large number of elements as it may reduce the amount of incremental reallocation.
- during iteration using a for-each loop, removing an element will lead to ConcurrentModificationException.
```java
for (int element : list) {
    if (element == 9)
        list.remove(9);
}
```


###### Day 35 [^](#learnings-in-java- "Back to Top")

- Collection extends `java.lang.Iterable` which enables any of its objects to be used in for-each loops. `Iterable` is an interface which has only one abstract method called `iterator()`, which the sub-class has to implement.
 Internally for-each invokes this method to iterate the elements of the Collection.
 ```java
 public interface Iterable<T> {
    Iterator<T> iterator();
    default void forEach(Consumer<? super T> action) { ... }
    default Spliterator<T> spliterator() { ... }
}
```
- ArrayList has a nested class which implements `java.util.Iterator`, an instance of that nested class is returned when iterator() is invoked.
```java
public interface Iterator<E> {
    boolean hasNext();
    E next();
    void remove();
    default void forEachRemaining(Consumer<? super T> action) { ... }
}
```
- It allows us to remove an element during iteration.
```java
Iterator<Integer> it = list.iterator();
while (it.hasNext()) {
    int element = it.next();
    if (element == 9)
        it.remove();
}
list.forEach(System.out::println);
```
- `ListIterator` extends Iterator and provides additional functionality. With Iterator we can only remove elements but with ListIterator we can additionally add and replace elements.
 Moreover, we can both iterate both forwards as well as backwards.
```java
public interface ListIterator<E> extends Iterator<E> {
    void add(E e);
    void set(E e);
    void remove();
    boolean hasNext();
    E next();
    boolean hasPrevious();
    E previous();
    int nextIndex();
    int previousIndex();
}
```
- `java.util.LinkedList` is a doubly linked list implementation of List & Deque interfaces.
```java
public class LinkedList<E>
extends AbstractSequentialList<E>
implements List<E>, Deque<E>, Cloneable, Serializable
```
- `java.util.Queue` is a collection designed for holding elements prior to processing. Besides basic Collection operations, queues provide additional insertion, extraction, and inspection operations.
Each of these methods exists in two forms: one throws an exception if the operation fails, the other returns a special value (either null or false, depending on the operation).
The latter form of the insert operation is designed specifically for use with capacity-restricted Queue implementations. (written in notes)
- `java.util.Deque` is a linear collection that supports element insertion and removal at both ends.
- when a *deque* is used as a *queue*, FIFO (First-In-First-Out) behavior results. Elements are *added* at the *end* of the deque and *removed* from the *beginning*.
The methods inherited from the Queue interface are precisely equivalent to Deque methods as indicated by the following table:

| Queue method  | Deque method   |
| ------------- |:-------------: |
| add(e)      	| addLast(e)     |
| offer(e)     	| offerLast(e)   |
| remove()      | removeFirst()  |
| poll()        | pollFirst()    |
| element()     | getFirst() 	 |
| peek()        | peekFirst()    |

- `Deques` can also be used as LIFO (Last-In-First-Out) stacks. This interface should be used in preference to the legacy Stack class. When a deque is used as a stack,
 elements are pushed and popped from the beginning of the deque. Stack methods are precisely equivalent to Deque methods as indicated in the table below:
 
| Stack Method  | Equivalent Deque Method |
| ------------- |:-------------:          |
| push(e)       | addFirst(e)             |
| pop()         | removeFirst()           |
| peek()        | peekFirst()             |

- `java.util.ArrayDeque` is a resizable-array implementation of the Deque interface. Array deques have no capacity restrictions; they grow as necessary to support usage.
```java
public class ArrayDeque<E>
extends AbstractCollection<E>
implements Deque<E>, Cloneable, Serializable
```
- below are various ways to create an ArrayDeque:
  - ArrayDeque()
  - ArrayDeque(int)
  - ArrayDeque(Collection)
- *ArrayDeque* is faster than *LinkedList* as a queue.
- unlike List, java.util.Set interface does not add any new methods on top of what it inherits from the Collection interface. However due to the fact that it does not allow duplicates,
 it places some additional requirements on some of the inherited methods and also the constructors.
- `java.util.HashSet` is a hash table based implementation of the `Set` interface. Internally, it uses a HashMap, but since HashSet stores only individual objects those objects will be stored as keys 
while an empty object (an instance of the Object class) will be stored as a value. It allows one null value.


###### Day 36 [^](#learnings-in-java- "Back to Top")

- according to *Effective Java*, we should always override `hashCode()` when we override `equals()`. Only overriding hashCode() is not helpful from preventing a duplicate from getting added to a HashSet 
and only overriding equals() doesn't mean both will end up in the same bucket.
- for `null` keys, the `hashCode` is always 0.
- `java.util.LinkedHashSet` is an implementation of the Set interface and it is similar to HashSet in that it stores elements in a hash table. However, LinkedHashSet also maintains a doubly linked list of the elements in insertion order. 
This means that the order in which elements are added to the set is preserved, and it can be traversed in that order using the iterator.
- `java.util.SortedSet` and `java.util.NavigableSet` define sets that are sorted in a specific order defined by a comparator or the natural ordering of elements.
- the `SortedSet` interface provides additional methods that allow for accessing and manipulating elements based on their position in the set, such as `subSet()`, `headSet()`, and `tailSet()`.
```java
public interface SortedSet<E> extends set<E>{
	//Range-view
	SortedSet<E> subSet(E fromElement, E toElement);
	SortedSet<E> headSet(E toElement);
	SortedSet<E> tailSet(E fromElement);
	
	//EndPoints
	E first();
	E last();
	
	//Comparator access
	Comparator<? super E> comparator();
	default Spliterator<E> spliterator();
}
```
- the `NavigableSet` interface extends the `SortedSet` interface and provides additional methods for navigating the set based on the ordering of the elements, such as `lower()`, `floor()`, `ceiling()`, and `higher()`. 
These methods return elements that are strictly *less than*, *less than or equal to*, *greater than or equal to*, and *strictly greater* than a given element, respectively.
- both `SortedSet` and `NavigableSet` are implemented by the `java.util.TreeSet` class, which uses a red-black tree to maintain the elements in sorted order. This allows for efficient operations on the set, such as finding 
the smallest or largest element, or finding elements within a specific range.
- the `java.lang.Comparable` interface is used to provide a default *natural sorting* order for a class. A class that implements the `Comparable` interface must implement `compareTo()`, which compares the current object 
with the specified object and returns a negative integer, zero, or a positive integer if the current object is less than, equal to, or greater than the specified object, respectively.
The `compareTo` method is used by sorting algorithms like `Arrays.sort()` and Collections.sort().
- the `java.util.Comparator` interface is used to provide a custom sorting order for a class. A class that implements the `Comparator` interface must implement `compare()`, which compares two objects and 
returns a negative integer, zero, or a positive integer if the first object is less than, equal to, or greater than the second object, respectively.
The compare method is used as an argument to sorting algorithms like Arrays.sort() and Collections.sort() to provide a custom sorting order.
- the difference between *Comparable* and *Comparator* is that `Comparable` provides a natural ordering of objects and is implemented by the object being sorted, whereas Comparator provides an 
external ordering of objects and is implemented by a separate class




