/*
Write the following code in your editor below:
1. A class named Arithmetic with a method named add that takes 2 integers as parameters and returns an integer denoting their sum.
2. A class named Adder that inherits from a superclass named Arithmetic.
Your classes should not be be public.

Sample Output:
The main method in the Solution class above should print the following:
My superclass is: Arithmetic
42 13 20

*/

abstract class Arithmetic{
    public int add(int a,int b){
        return a+b;
    }
}

final class Adder extends Arithmetic{
    
}

public class Solution {

    public static void main(String[] args) {
        Adder a = new Adder();
        System.out.println("My superclass is: " + a.getClass().getSuperclass().getName());    
        System.out.print(a.add(10,32) + " " + a.add(10,3) + " " + a.add(10,10) + "\n");
    }
}
