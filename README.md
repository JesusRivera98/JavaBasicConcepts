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
It is possible to modify classes, methods, etc., by using modifiers. There are two categories of modifiers:

* **Access Modifiers** − default, public , protected, private
* **Non-access Modifiers** − final, abstract, strictfp

### Basic datatype

<h4 align="center">Primitive Data Types</h1>

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
### Precedence of Java operators
### Loop control
### Decision making
### Java Strings
### Java Arrays

> Arrays are objects that store multiple variables of the same type. However, an array itself is an object on the heap.


### Java Date & time
### Java Files and I/O
### Java Exceptions
### Final, static, 
### Enumeration

> Enums were introduced in Java 5.0. Enums restrict a variable to have one of only a few predefined values. The values in this enumerated list are called enums.

> With the use of enums it is possible to reduce the number of bugs in your code.

> For example, if we consider an application for a fresh juice shop, it would be possible to restrict the glass size to small, medium, and large. This would make sure that it would not allow anyone to order any size other than small, medium, or large.

**Note** − Enums can be declared as their own or inside a class. Methods, variables, constructors can be defined inside enums as well.
