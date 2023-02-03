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

```
int intHex = 0x0043;
int intBinary = 0b0100_0001;
int intOctal = 0101;
int intchar = 'B' ;
```

- similarly we can represent characters using char as type. 
- `statements`: Expression or Assignment statements should not fall under class level it will show an compilation error. only declaration statements can be at class level.
- `Arrays`: in Java are useful for storing multiple values of the data type, and they allow you to access those values using their `unique index`.

```Java
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

```
String[] names= {"ram","lakshman","bharath","ravan"};
System.arraycopy(names,0,names,1,3);  
```

- `copyOfRange` method does not require you to create the destination array before calling the method, because the destination array is returned by the method.
```
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
  
  ```
  //declaring and initializing at the same time
  int[][] intValues = {{1,2,3},{9,8,7},{4,5,6}};
  
  //declaring and initializing separetly
  int[][] intNumbers;
  intNumbers = new int[][] {{2,4,5},{3,6,7},{1,8,9}};
  ```
- 2D arrays need not be rectangular, each row can be of different length.

```
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
search(new int[]{1,2,,3}, 2); //this way can also be used to invoke
```
- `Static methods` are class level methods. That is unlike `instance` methods they do not deal with object state.
- `Static` methods do not have access to either `instance variables` or `methods` with in the same class. i.e., from a Static method , if you directly try to access an instance variable declared 
within same class, then we'll get a compiler error. Similary we can't invoke instance mrthod within same class.
- we can use `static methods` or `variables` in `instance methods`.
- `static` stuff is `global`, which is accessible across all of the objects. So from `instance methods` you can access `static` variables or methods.




