🟢 PHASE 1: Programming Foundation (Very Basic)

## Chapter one what is programing ?

🧠 First Understand This Carefully

computer is very fast but it's very stupid machine.
~ It can not think.
~ It only follow instructions only.

## Now programing 
~ Programin is the step by step instruction who computer follwed 

Example if you want tea so what you do ?

first you boil water then add tea + sugar + milk and your tea is ready.

-- Like that --

Computer work -
Step 1 -> Step2 -> Step3 ......

no thinking only execution 

## 💻 What is Java?

Java is programing laguage who set instructions for computer.

## what java can do ?
* build software 
* build android app 
* build website (backend)
* build banking system

## java was created by - jemsa gosling 
## at company - sun microsystem
## Later bought by - oracle corporation

## Why java is powerfull?
* Platform Independent (Write Once Run Anywhere)
* Secure
* Object-Oriented
* Huge demand in jobs
* Used in banking systems

## ⚙️ How Java Works (Very Important)

When you write Java code:

Step 1 → You write .java file
Step 2 → Compiler converts it into bytecode (.class file)
Step 3 → JVM runs that bytecode

Important components:

JDK → Java Development Kit (for developers)

JRE → Java Runtime Environment (to run programs)

JVM → Java Virtual Machine (actually runs code)

 --------------TEST – LEVEL 1------------------

 Answer clearly:

1. Is computer intelligent or not? Why?
2. What is programming?
3. Who created Java?
4. What is JVM?
5. Why is Java called platform independent?
6. Who converts .java file into bytecode?
7. What file extension is bytecode?
8. Does JVM convert code or execute code?
⚠️ Rules:

* Don’t write short answers.
* Explain in your own words.

 ## 🧠 Fix This In Your Mind:
.java → (Compiler) → .class → (JVM) → Output



## 🚀 CHAPTER 2 – Your First Java Program

Now we start REAL Java.

Look at this program carefully:

public class FirstPro{
    public static void main(String [] arg){
        System.out.println("Hello Raj");
    }
}

<!-- this program is availble in directory programs/first_program you can run this program manualy and check output -->

# Let's we breck this code line by line 
! Line 1- public class FirstPro

🔹public - *access modifier
         *Means this class can be accessed from anywhare

🔹class - *keyword user to create a class
          *In Java, a class is a blueprint or template used to create objects.

            Think like this:
            🏠 Blueprint → Class
            🏠 Real House → Object

🔹FirstPro - that is the class name in java and it's the main name 
            RULE - First latter should be capital 
                   File name must be match class name
                   
## NOTE: 
The file name must be the same as the public class name. 
For example, if your public class name is FirstPro, then the file name must be FirstPro.java.
If filename and class name are different → Error.
By convention, the first letter of a class name should be capital.

## Important:
In Java, one file can contain only one public class. 
However, that class can contain multiple public or private methods.

## 🧠 Line 2
 public static void main(String[] args)

 this is the heart or java program java start execution from main() method.

Break it:

🔹 public

JVM must access it.

🔹 static

Belongs to class, not object.
(We will deeply understand later.)

🔹 void

This method returns nothing.

🔹 main

Method name.
It is special.
JVM looks for this name.

🔹 String[] args

Used to take command-line arguments.
(We learn later.)

## 🧠 Line 3
System.out.println("Hello World");

Break it:

🔹 System

Predefined class.

🔹 out

Object inside System class.

🔹 println

Method to print and move cursor to next line.

##  HOW TO RUN CODE 

1. Save file as:

FirstPro.java

2. Open CMD/TERMINAL in that folder.

Compile:

javac FirstPro.java

3. It creates:

FirstPro.class

4. Run:

java FirstPro

$$ Notice:
We write java Hello
NOT java Hello.java
MAKE sure you already download java jdk 


## TEST LAVEL -2 
Answer carefully:
1. What will happen if file name is Test.java but class name is Hello?
2.From which method does Java start execution?
3.What does void mean?
4.Why do we write java Hello instead of java Hello.java?
5.What is the difference between javac and java command?
6. What happens internally when you run:
    javac Hello.java
    Then:
    java Hello
    Explain full flow in 4–5 steps.
    Use this structure:
    1 →
    2 →
    3 →
    4 →
    5 →
    Explain clearly:
    Compiler
    Bytecode
    JVM
    Execution

7. 🔥 Now Thinking Question (Important)

If .class file contains bytecode
and JVM converts it into machine code,

Then tell me:

👉 Why is Java slower than C or C++?

Think logically.
Do not guess.
Use reasoning.

Answer in 3–4 lines.
