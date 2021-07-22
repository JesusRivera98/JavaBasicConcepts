# JavaBasicConcepts

### What is java?
> Java is a high-level programming language originally developed by Sun Microsystems and released in 1995. Java runs on a variety of platforms, such as Windows, Mac OS, and the various versions of UNIX.
> [___Tutorialspoint___](https://www.tutorialspoint.com/java/index.htm)
### List the features of Java Programming Language

#### Advantages

Feature | Description
------- | -----------
Object Oriented | In Java, everything is an Object. Java can be easily extended since it is based on the Object model.
Platform Independent | Unlike many other programming languages including C and C++, when Java is compiled, it is not compiled into platform specific machine, rather into platform independent byte code. This byte code is distributed over the web and interpreted by the Virtual Machine (JVM) on whichever platform it is being run on.
Simple | Java is designed to be easy to learn. If you understand the basic concept of OOP Java, it would be easy to master.
Secure | With Java's secure feature it enables to develop virus-free, tamper-free systems. Authentication techniques are based on public-key encryption.
Architecture-neutral | Java compiler generates an architecture-neutral object file format, which makes the compiled code executable on many processors, with the presence of Java runtime system.
Portable | Being architecture-neutral and having no implementation dependent aspects of the specification makes Java portable. Compiler in Java is written in ANSI C with a clean portability boundary, which is a POSIX subset.
Robust | Java makes an effort to eliminate error prone situations by emphasizing mainly on compile time error checking and runtime checking.

#### Applications
> ___**Write Once, Run Anywhere.**___

|||
-|-
Multithreaded | With Java's multithreaded feature it is possible to write programs that can perform many tasks simultaneously. This design feature allows the developers to construct interactive applications that can run smoothly.
Interpreted | Java byte code is translated on the fly to native machine instructions and is not stored anywhere. The development process is more rapid and analytical since the linking is an incremental and light-weight process.
High Performance | With the use of Just-In-Time compilers, Java enables high performance.
Distributed | Java is designed for the distributed environment of the internet.
Dynamic | Java is considered to be more dynamic than C or C++ since it is designed to adapt to an evolving environment. Java programs can carry extensive amount of run-time information that can be used to verify and resolve accesses to objects on run-time.

### JVM, JRE, JDK
### Basic syntax (Object, class, methods, and instance variables)

|||
-|-
Object | Objects have states and behaviors. Example: A dog has states - color, name, breed as well as behavior such as wagging their tail, barking, eating. An object is an instance of a class.
Class | A class can be defined as a template/blueprint that describes the behavior/state that the object of its type supports.
Methods | A method is basically a behavior. A class can contain many methods. It is in methods where the logics are written, data is manipulated and all the actions are executed.
Instance Variables | Each object has its unique set of instance variables. An object's state is created by the values assigned to these instance variables.

### Java Modifiers
Modifiers are keywords that you add to those definitions to change their meanings. 
It is possible to modify classes, methods, etc., by using modifiers. There are two categories of modifiers:

* **Access Modifiers** − default, public , protected, private
  * Visible to the package, the **default**. No modifiers are needed.
  * Visible to the class only (**private**).
  * Visible to the world **(public)**.
  * Visible to the package and all subclasses (**protected**).
* **Non-access Modifiers** − final, abstract, strictfp
  * The **static** modifier for creating class methods and variables.
  * The **final** modifier for finalizing the implementations of classes, methods, and variables.
  * The **abstract** modifier for creating abstract classes and methods.
  * The **synchronized** and **volatile** modifiers, which are used for threads.

To use a modifier, you include its keyword in the definition of a class, method, or variable. The modifier precedes the rest of the statement.

### Basic datatype

<h4 align="center">Primitive Data Types</h4>

|Type|Size|Min|Max|Use|Default|Example|
|----|----|---|---|---|-------|-------|
byte|8-bit signed two's complement integer|-128 (-2^7)|127 (inclusive)(2^7 -1)|Save space in large arrays, mainly in place of integers, since a byte is four times smaller than an integer.|0|byte a = 100, byte b = -50
short|16-bit signed two's complement integer|-32,768 (-2^15)|32,767 (inclusive) (2^15 -1)|save memory as byte data type. A short is 2 times smaller than an integer|0|short s = 10000, short r = -20000
int|32-bit signed two's complement integer|- 2,147,483,648 (-2^31)|2,147,483,647(inclusive) (2^31 -1)|the default data type for integral values unless there is a concern about memory.|0|int a = 100000, int b = -200000
long|64-bit signed two's complement integer|-9,223,372,036,854,775,808(-2^63)|9,223,372,036,854,775,807 (inclusive)(2^63 -1)|used when a wider range than int is needed|0L|long a = 100000L, long b = -200000L
|float|a single-precision 32-bit IEEE 754 floating point|||used to save memory in large arrays of floating point numbers -is never used for precise values such as currency|0.0f|float f1 = 234.5f
double|double-precision 64-bit IEEE 754 floating point|||-used as the default data type for decimal values, generally the default choice -should never be used for precise values such as currency|0.0d|double d1 = 123.4
boolean|represents one bit of information|Only two possible values: true and false||used for simple flags that track true/false conditions|false|boolean one = true
char|Single 16-bit Unicode character| '\u0000' (or 0)|'\uffff' (or 65,535 inclusive)|used to store any character||char letterA = 'A'


### Basic operators (Arithmetic operator, relational operator, logical operator, assignment operators, and ternary operators)

<h4 align="center">Arithmetic</h4>

|Operator|	Description|	Example|
|-|-|-|
|+ (Addition)|	Adds values on either side of the operator.|	A + B will give 30
|- (Subtraction)|	Subtracts right-hand operand from left-hand operand.	|A - B will give -10
|* (Multiplication)	|Multiplies values on either side of the operator.	|A * B will give 200
|/ (Division)	|Divides left-hand operand by right-hand operand.	|B / A will give 2
|% (Modulus)	|Divides left-hand operand by right-hand operand and returns remainder.	|B % A will give 0
|++ (Increment)	|Increases the value of operand by 1.	|B++ gives 21
|-- (Decrement)	|Decreases the value of operand by 1.|	B-- gives 19

<h4 align="center">Relational</h4>

|Operator|	Description	|Example|
|-|-|-|
|== (equal to)|	Checks if the values of two operands are equal or not, if yes then condition becomes true.|	(A == B) is not true.
|!= (not equal to)|	Checks if the values of two operands are equal or not, if values are not equal then condition becomes true.	|(A != B) is true.
|> (greater than)|	Checks if the value of left operand is greater than the value of right operand, if yes then condition becomes true.|	(A > B) is not true.
|< (less than)|	Checks if the value of left operand is less than the value of right operand, if yes then condition becomes true.|	(A < B) is true.
|>= (greater than or equal to)|	Checks if the value of left operand is greater than or equal to the value of right operand, if yes then condition becomes true.|	(A >= B) is not true.
|<= (less than or equal to)|	Checks if the value of left operand is less than or equal to the value of right operand, if yes then condition becomes true.|	(A <= B) is true.

<h4 align="center">Logical</h4>

|Operator|Description|Example|
|-|-|-|
| && (logical and)	|Called Logical AND operator. If both the operands are non-zero, then the condition becomes true.|	(A && B) is false|
|\|\| (logical or)|	Called Logical OR Operator. If any of the two operands are non-zero, then the condition becomes true.	|(A || B) is true|
|! (logical not)|	Called Logical NOT Operator. Use to reverses the logical state of its operand. If a condition is true then Logical NOT operator will make false.|	!(A && B) is true|



<h4 align="center">Assignment</h4>

|Operator	|Description|	Example|
|-|-|-|
|=	|Simple assignment operator. Assigns values from right side operands to left side operand.|	C = A + B will assign value of A + B into C
+=	|Add AND assignment operator. It adds right operand to the left operand and assign the result to left operand.|	C += A is equivalent to C = C + A
-=	|Subtract AND assignment operator. It subtracts right operand from the left operand and assign the result to left operand.|	C -= A is equivalent to C = C – A
*=	|Multiply AND assignment operator. It multiplies right operand with the left operand and assign the result to left operand.|	C *= A is equivalent to C = C * A
/=	|Divide AND assignment operator. It divides left operand with the right operand and assign the result to left operand.|	C /= A is equivalent to C = C / A
%=	|Modulus AND assignment operator. It takes modulus using two operands and assign the result to left operand.|	C %= A is equivalent to C = C % A
<<=	|Left shift AND assignment operator.|	C <<= 2 is same as C = C << 2
|>>=|	Right shift AND assignment operator.|	C >>= 2 is same as C = C >> 2
&=|	Bitwise AND assignment operator.|	C &= 2 is same as C = C & 2
^=|	bitwise exclusive OR and assignment operator.	|C ^= 2 is same as C = C ^ 2
\|=	|bitwise inclusive OR and assignment operator.|	C \|= 2 is same as C = C | 2

<h4 align="center">Ternary</h4>
Conditional operator is also known as the ternary operator. This operator consists of three operands and is used to evaluate Boolean expressions. The goal of the operator is to decide, which value should be assigned to the variable.

```Java
 variable x = (expression) ? value if true : value if false 
 ```

### Precedence of Java operators

> Operator precedence determines the grouping of terms in an expression. This affects how an expression is evaluated. Certain operators have higher precedence than others; for example, the multiplication operator has higher precedence than the addition operator.

|Category|	Operator|	Associativity|
|--------|  --------|   -------------|
Postfix	|expression++ expression--	|Left to right
Unary	|++expression –-expression +expression –expression ~ !	|Right to left
Multiplicative|	* / %	|Left to right
Additive|	+ -	|Left to right
Shift	|<< >> >>>	|Left to right
Relational|	< > <= >= instanceof	|Left to right
Equality|	== !=	|Left to right
Bitwise AND|	&	|Left to right
Bitwise XOR|	^	|Left to right
Bitwise OR|	\|	|Left to right
Logical AND|	&&	|Left to right
Logical OR|	\|\|	|Left to right
Conditional|	?:|	Right to left
Assignment|	= += -= *= /= %= ^= \|= <<= >>= >>>=	|Right to left

___Operators with the highest precedence appear at the top of the table, those with the lowest appear at the bottom. Within an expression, higher precedence operators will be evaluated first.___

### Loop control

|Sr.No.|	Loop | Description|Syntax|
|-|-|-|-|
|1	|while loop|Repeats a statement or group of statements while a given condition is true. It tests the condition before executing the loop body.| ``` whileBoolean_expression) {   // Statements} ```
|2	|for loop|Execute a sequence of statements multiple times and abbreviates the code that manages the loop variable.|```for(initialization; Boolean_expression; update) {   // Statements} ```
|3|	do...while loop|Like a while statement, except that it tests the condition at the end of the loop body.|```do {   // Statements}while(Boolean_expression);```
||Enhanced for loop |This is mainly used to traverse collection of elements including arrays. | ``` for(declaration : expression) {   // Statements}```

|Sr.No.	|Control Statement| Description
|-|-|-|
|1|	break statement|Terminates the loop or switch statement and transfers execution to the statement immediately following the loop or switch.
|2|	continue statement|Causes the loop to skip the remainder of its body and immediately retest its condition prior to reiterating.

### Decision making

> Decision making structures have one or more conditions to be evaluated or tested by the program, along with a statement or statements that are to be executed if the condition is determined to be true, and optionally, other statements to be executed if the condition is determined to be false.

|Sr.No.|	Statement | Description| Syntax
|-|-|-|-|
1|	if statement|An if statement consists of a boolean expression followed by one or more statements.|``` if(Boolean_expression) {   // Statements will execute if the Boolean expression is true } ```
2|	if...else statement|An if statement can be followed by an optional else statement, which executes when the boolean expression is false.|``` if(Boolean_expression) {   // Executes when the Boolean expression is true }else {   // Executes when the Boolean expression is false } ```
3	|nested if statement|You can use one if or else if statement inside another if or else if statement(s).|``` if(Boolean_expression 1) {   // Executes when the Boolean expression 1 is true   if(Boolean_expression 2) {      // Executes when the Boolean expression 2 is true   } } ```
4|	switch statement|A switch statement allows a variable to be tested for equality against a list of values.|``` switch(expression) {   case value :      // Statements      break; // optional      case value :      // Statements      break; // optional   // You can have any number of case statements.   default : // Optional      // Statements} ```
||? : Operator|Can be used to replace if...else statements.|``` Exp1 ? Exp2 : Exp3; ```

### Java Strings

> Strings, which are widely used in Java programming, are a sequence of characters. In Java programming language, strings are treated as objects.

> The Java platform provides the String class to create and manipulate strings

The most direct way to create a string is to write:

```Java
String greeting = "Hello world!";
```

> ___**Note** − The String class is immutable, so that once it is created a String object cannot be changed. If there is a necessity to make a lot of modifications to Strings of characters, then you should use String Buffer & String Builder Classes.___
```Java
StringBuffer sBuffer = new StringBuffer("test");
```

**Concatenating Strings**
* string1.concat(string2);
* "My name is ".concat("Zara");
* "Hello," + " world" + "!"

<h4 align="center">String Methods</h4>

Sr.No.|	Method | Description||
|-|-|-|-|
|1|	char charAt(int index)|Returns the character at the specified index.|
2|	int compareTo(Object o)|Compares this String to another Object.|
3|	int compareTo(String anotherString)|Compares two strings lexicographically.|
4|	int compareToIgnoreCase(String str)|Compares two strings lexicographically, ignoring case differences.|
5|	String concat(String str)|Concatenates the specified string to the end of this string.|
6|	boolean contentEquals(StringBuffer sb)Returns true if and only if this String represents the same sequence of characters as the specified StringBuffer.|
7|	static String copyValueOf(char[] data)|Returns a String that represents the character sequence in the array specified.|
8|	static String copyValueOf(char[] data, int offset, int count)|Returns a String that represents the character sequence in the array specified.
9|	boolean endsWith(String suffix)|Tests if this string ends with the specified suffix.|
10|	boolean equals(Object anObject)|Compares this string to the specified object.|
11|	boolean equalsIgnoreCase(String anotherString)|Compares this String to another String, ignoring case considerations.|
12|	byte[] getBytes()|Encodes this String into a sequence of bytes using the platform's default charset, storing the result into a new byte array.|
13|	byte[] getBytes(String charsetName)|Encodes this String into a sequence of bytes using the named charset, storing the result into a new byte array.
14|	void getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)|Copies characters from this string into the destination character array.|
15|	int hashCode()|Returns a hash code for this string.|
16|	int indexOf(int ch)|Returns the index within this string of the first occurrence of the specified character.|
17|	int indexOf(int ch, int fromIndex)|Returns the index within this string of the first occurrence of the specified character, starting the search at the specified index.
18|	int indexOf(String str)|Returns the index within this string of the first occurrence of the specified substring.|
19|	int indexOf(String str, int fromIndex)|Returns the index within this string of the first occurrence of the specified substring, starting at the specified index.|
20|	String intern()|Returns a canonical representation for the string object.|
21|	int lastIndexOf(int ch)|Returns the index within this string of the last occurrence of the specified character.|
22|	int lastIndexOf(int ch, int fromIndex)|Returns the index within this string of the last occurrence of the specified character, searching backward starting at the specified index.|
23|	int lastIndexOf(String str)|Returns the index within this string of the rightmost occurrence of the specified substring.|
24|	int lastIndexOf(String str, int fromIndex)|Returns the index within this string of the last occurrence of the specified substring, searching backward starting at the specified index.|
25|	int length()|Returns the length of this string.|
26|	boolean matches(String regex)|Tells whether or not this string matches the given regular expression.|
27|	boolean regionMatches(boolean ignoreCase, int toffset, String other, int ooffset, int len)|Tests if two string regions are equal.|
28|	boolean regionMatches(int toffset, String other, int ooffset, int len)|Tests if two string regions are equal.|
29|	String replace(char oldChar, char newChar)|Returns a new string resulting from replacing all occurrences of oldChar in this string with newChar.|
30|	String replaceAll(String regex, String replacement|Replaces each substring of this string that matches the given regular expression with the given replacement.|
31|	String replaceFirst(String regex, String replacement)|Replaces the first substring of this string that matches the given regular expression with the given replacement.|
32|	String[] split(String regex)|Splits this string around matches of the given regular expression.|
33|	String[] split(String regex, int limit)|Splits this string around matches of the given regular expression.|
34|	boolean startsWith(String prefix)|Tests if this string starts with the specified prefix.|
35|	boolean startsWith(String prefix, int toffset)|Tests if this string starts with the specified prefix beginning a specified index.|
36|	CharSequence subSequence(int beginIndex, int endIndex)|Returns a new character sequence that is a subsequence of this sequence.
37|	String substring(int beginIndex)|Returns a new string that is a substring of this string.|
38|	String substring(int beginIndex, int endIndex)|Returns a new string that is a substring of this string.|
39|	char[] toCharArray()|Converts this string to a new character array.|
40|	String toLowerCase()|Converts all of the characters in this String to lower case using the rules of the default locale.|
41|	String toLowerCase(Locale locale)|Converts all of the characters in this String to lower case using the rules of the given Locale.|
42|	String toString()|This object (which is already a string!) is itself returned.|
43|	String toUpperCase()|Converts all of the characters in this String to upper case using the rules of the default locale.|
44|	String toUpperCase(Locale locale)|Converts all of the characters in this String to upper case using the rules of the given Locale.|
45|	String trim()|Returns a copy of the string, with leading and trailing whitespace omitted.|
46|	static String valueOf(primitive data type x)|Returns the string representation of the passed data type argument.|

### Java Arrays

> Arrays are objects that store multiple variables of the same type. However, an array itself is an object on the heap.

> Java provides a data structure, the array, which stores a fixed-size sequential collection of elements of the same type. An array is used to store a collection of data, but it is often more useful to think of an array as a collection of variables of the same type.

#### Syntax
```Java
dataType[] arrayRefVar;   // preferred way.
or
dataType arrayRefVar[];  // works but not preferred way.
```
> ___Note − The style dataType[] arrayRefVar is preferred. The style dataType arrayRefVar[] comes from the C/C++ language and was adopted in Java to accommodate C/C++ programmers___

#### Example

```Java
double[] myList;   // preferred way.
or
double myList[];   // works but not preferred way.
``` 
#### Creation
Declaring an array variable, creating an array, and assigning the reference of the array to the variable can be combined in one statement, as shown below:
```Java
dataType[] arrayRefVar = new dataType[arraySize];
```
Alternatively you can create arrays as follows:
```Java
dataType[] arrayRefVar = {value0, value1, ..., valuek};
```
The array elements are accessed through the index. Array indices are 0-based; that is, they start from 0 to arrayRefVar.length-1.

* You can pass an array to a method
* YOu can return an array from a method

<h4 align="center">Arrays Methods</h4>

Sr.No.|	Method | Description||
|-|-|-|-|
1	|public static int binarySearch(Object[] a, Object key)|Searches the specified array of Object ( Byte, Int , double, etc.) for the specified value using the binary search algorithm. The array must be sorted prior to making this call. This returns index of the search key, if it is contained in the list; otherwise, it returns ( – (insertion point + 1)).
2	|public static boolean equals(long[] a, long[] a2)|Returns true if the two specified arrays of longs are equal to one another. Two arrays are considered equal if both arrays contain the same number of elements, and all corresponding pairs of elements in the two arrays are equal. This returns true if the two arrays are equal. Same method could be used by all other primitive data types (Byte, short, Int, etc.)
3	|public static void fill(int[] a, int val)|Assigns the specified int value to each element of the specified array of ints. The same method could be used by all other primitive data types (Byte, short, Int, etc.)
4	|public static void sort(Object[] a)|Sorts the specified array of objects into an ascending order, according to the natural ordering of its elements. The same method could be used by all other primitive data types ( Byte, short, Int, etc.)

### Java Date & time

Java provides the Date class available in java.util package, this class encapsulates the current date and time.

<h4 align="center">Date constructors</h4>

Sr.No.|	Constructor| Description|
|-|-|-|
1	|Date( )|This constructor initializes the object with the current date and time.
2	|Date(long millisec)|This constructor accepts an argument that equals the number of milliseconds that have elapsed since midnight, January 1, 1970.

<h4 align="center">Date Methods</h4>

Sr.No.|	Method | Description
|-|-|-|
1	|boolean after(Date date)|Returns true if the invoking Date object contains a date that is later than the one specified by date, otherwise, it returns false.
2	|boolean before(Date date)|Returns true if the invoking Date object contains a date that is earlier than the one specified by date, otherwise, it returns false.
3	|Object clone( )|Duplicates the invoking Date object.|
4	|int compareTo(Date date)|Compares the value of the invoking object with that of date. Returns 0 if the values are equal. Returns a negative value if the invoking object is earlier than date. Returns a positive value if the invoking object is later than date.
5	|int compareTo(Object obj)|Operates identically to compareTo(Date) if obj is of class Date. Otherwise, it throws a ClassCastException.|
6	|boolean equals(Object date)|Returns true if the invoking Date object contains the same time and date as the one specified by date, otherwise, it returns false.|
7	|long getTime( )|Returns the number of milliseconds that have elapsed since January 1, 1970.|
8	|int hashCode( )|Returns a hash code for the invoking object.|
9	|void setTime(long time)|Sets the time and date as specified by time, which represents an elapsed time in milliseconds from midnight, January 1, 1970.
10	|String toString( )|Converts the invoking Date object into a string and returns the result.|

### Java Files and I/O

> The java.io package contains nearly every class you might ever need to perform input and output (I/O) in Java. All these streams represent an input source and an output destination. The stream in the java.io package supports many data such as primitives, object, localized characters, etc.

<h4 align="center">Stream</h4>
A stream can be defined as a sequence of data. There are two kinds of Streams

* **InPutStream:** The InputStream is used to read data from a source.
* **OutPutStream:** The OutputStream is used for writing data to a destination.

<h4 align="center">Byte Stream</h4>
Java byte streams are used to perform input and output of 8-bit bytes. Though there are many classes related to byte streams but the most frequently used classes are, FileInputStream and FileOutputStream.

<h4 align="center">Character Stream</h4>
Java Byte streams are used to perform input and output of 8-bit bytes, whereas Java Character streams are used to perform input and output for 16-bit unicode. Though there are many classes related to character streams but the most frequently used classes are, FileReader and FileWriter. Though internally FileReader uses FileInputStream and FileWriter uses FileOutputStream but here the major difference is that FileReader reads two bytes at a time and FileWriter writes two bytes at a time.

<h4 align="center">Standard Streams</h4>
All the programming languages provide support for standard I/O where the user's program can take input from a keyboard and then produce an output on the computer screen. If you are aware of C or C++ programming languages, then you must be aware of three standard devices STDIN, STDOUT and STDERR.



* **Standard Input:** This is used to feed the data to user's program and usually a keyboard is used as standard input stream and represented as System.in.
* **Standard Output:** This is used to output the data produced by the user's program and usually a computer screen is used for standard output stream and represented as System.out.
* **Standard Error:** This is used to output the error data produced by the user's program and usually a computer screen is used for standard error stream and represented as System.err.

<h4 align="center">FileInputStream</h4>

```Java
InputStream f = new FileInputStream("C:/java/hello");
```
```Java
File f = new File("C:/java/hello");
InputStream f = new FileInputStream(f);
```

Sr.No.|	Method | Description|
|-|-|-|
1	|public void close() throws IOException{}|This method closes the file output stream. Releases any system resources associated with the file. Throws an IOException.
2	|protected void finalize()throws IOException {}|This method cleans up the connection to the file. Ensures that the close method of this file output stream is called when there are no more references to this stream. Throws an IOException.
3	|public int read(int r)throws IOException{}|This method reads the specified byte of data from the InputStream. Returns an int. Returns the next byte of data and -1 will be returned if it's the end of the file.
4	|public int read(byte[] r) throws IOException{}|This method reads r.length bytes from the input stream into an array. Returns the total number of bytes read. If it is the end of the file, -1 will be returned.
5	|public int available() throws IOException{}|Gives the number of bytes that can be read from this file input stream. Returns an int.

<h4 align="center">FileOutputStream</h4>

```Java
OutputStream f = new FileOutputStream("C:/java/hello") 
```
```Java
File f = new File("C:/java/hello");
OutputStream f = new FileOutputStream(f);
```

Sr.No.|	Method | Description|
|-|-|-|
1	|public void close() throws IOException{}|This method closes the file output stream. Releases any system resources associated with the file. Throws an IOException.
2	|protected void finalize()throws IOException {}|This method cleans up the connection to the file. Ensures that the close method of this file output stream is called when there are no more references to this stream. Throws an IOException.
3	|public void write(int w)throws IOException{}|This methods writes the specified byte to the output stream.|
4	|public void write(byte[] w)|Writes w.length bytes from the mentioned byte array to the OutputStream.

File Navigation and I/O
* File Class
* FileReader Class
* FileWriter Class
--
* **mkdir( ):** Creates a directory, returning true on success and false on failure. Failure indicates that the path specified in the File object already exists, or that the directory cannot be created because the entire path does not exist yet.
* **mkdirs():** Creates both a directory and all the parents of the directory.


### Java Exceptions

>An exception (or exceptional event) is a problem that arises during the execution of a program. When an Exception occurs the normal flow of the program is disrupted and the program/Application terminates abnormally, which is not recommended, therefore, these exceptions are to be handled.

An exception can occur for many different reasons. Following are some scenarios where an exception occurs.
* A user has entered an invalid data.
* A file that needs to be opened cannot be found.
* A network connection has been lost in the middle of communications or the JVM has run out of memory.

|-|-|
|-|-|
Checked exceptions | A checked exception is an exception that is checked (notified) by the compiler at compilation-time, these are also called as compile time exceptions. These exceptions cannot simply be ignored, the programmer should take care of (handle) these exceptions.
Unchecked exceptions | An unchecked exception is an exception that occurs at the time of execution. These are also called as **Runtime Exceptions**. These include programming bugs, such as logic errors or improper use of an API. Runtime exceptions are ignored at the time of compilation.
Errors | These are not exceptions at all, but problems that arise beyond the control of the user or the programmer. Errors are typically ignored in your code because you can rarely do anything about an error. For example, if a stack overflow occurs, an error will arise. They are also ignored at the time of compilation.

<h4 align="center">Methods</h4>

Sr.No.|	Method | Description
|-|-|-|
1	|public String getMessage()|Returns a detailed message about the exception that has occurred. This message is initialized in the Throwable constructor.
2	|public Throwable getCause()Returns the cause of the exception as represented by a Throwable object.
3	|public String toString()|Returns the name of the class concatenated with the result of getMessage().
4	|public void printStackTrace()|Prints the result of toString() along with the stack trace to System.err, the error output stream.
5	|public StackTraceElement [] getStackTrace()|Returns an array containing each element on the stack trace. The element at index 0 represents the top of the call stack, and the last element in the array represents the method at the bottom of the call stack.
6	|public Throwable fillInStackTrace()|Fills the stack trace of this Throwable object with the current stack trace, adding to any previous information in the stack trace.

<h4 align="center">Catch Esceptions</h4>
A method catches an exception using a combination of the try and catch keywords. A try/catch block is placed around the code that might generate an exception. Code within a try/catch block is referred to as protected code.

```Java
try {
   // Protected code
} catch (ExceptionName e1) {
   // Catch block
}
```

```Java
try {
   // Protected code
} catch (ExceptionType1 e1) {
   // Catch block
} catch (ExceptionType2 e2) {
   // Catch block
} catch (ExceptionType3 e3) {
   // Catch block
}
```

<h4 align="center">Throws/Throw</h4>
If a method does not handle a checked exception, the method must declare it using the throws keyword. The throws keyword appears at the end of a method's signature.

```Java
import java.io.*;
public class className {

   public void deposit(double amount) throws RemoteException {
      // Method implementation
      throw new RemoteException();
   }
   // Remainder of class definition
}
```
```Java
import java.io.*;
public class className {

   public void withdraw(double amount) throws RemoteException, 
      InsufficientFundsException {
      // Method implementation
   }
   // Remainder of class definition
}
```

<h4 align="center">Finally</h4>
The finally block follows a try block or a catch block. A finally block of code always executes, irrespective of occurrence of an Exception.

```Java
try {
   // Protected code
} catch (ExceptionType1 e1) {
   // Catch block
} catch (ExceptionType2 e2) {
   // Catch block
} catch (ExceptionType3 e3) {
   // Catch block
}finally {
   // The finally block always executes.
}
```


### Final, static, 
### Enumeration

> Enums were introduced in Java 5.0. Enums restrict a variable to have one of only a few predefined values. The values in this enumerated list are called enums.

> With the use of enums it is possible to reduce the number of bugs in your code.

> For example, if we consider an application for a fresh juice shop, it would be possible to restrict the glass size to small, medium, and large. This would make sure that it would not allow anyone to order any size other than small, medium, or large.

**Note** − Enums can be declared as their own or inside a class. Methods, variables, constructors can be defined inside enums as well.
