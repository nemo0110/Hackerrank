/*
You must print two lines of output:

Print Hello, World. on the first line.
Print Hello, Java. on the second line.

Sample Output

Hello, World.
Hello, Java.

*/

public class Solution {
    public static void main(String[] args) {
        System.out.println("Hello, World.");
        System.out.println("Hello, Java.");
    }
}

/*
The main method can contain code to execute or call other methods, and it can be placed in any class that’s part of a program. 
The class that contains the main method can have any name.
More complex programs usually have a class that contains only the main method.

*public*
The access modifier of the main method needs to be public so that the JRE(Java Runtime Environment) can access and execute this method.

*static*
When the Java program starts, there is no object of the class present.
The main method has to be static so that the JVM can load the class into memory and call the main method without creating an instance of the class first.

*void*
Every Java method must provide the return type.The Java main method return type is void because it doesn’t return anything.
When the main method is finished executing, the Java program terminates, so there is no need for a returned object.

*main*
The Java main method is always named main. When a Java program starts, it always looks for the main method. 

*String[] args*
Java main method accepts a single argument of type String array.
Each string in the array is a command line argument.
You can use command line arguments to affect the operation of the program, or to pass information to the program, at runtime.

*/
