/*
Read an integer, a double, and a String from stdin, then print the values according to the instructions in the Output Format section below.

Input Format

There are three lines of input:
The first line contains an integer.
The second line contains a double.
The third line contains a String.

Output Format
There are three lines of output:
On the first line, print String: followed by the unaltered String read from stdin.
On the second line, print Double: followed by the unaltered double read from stdin.
On the third line, print Int: followed by the unaltered integer read from stdin.

Note: If you use the nextLine() method immediately following the nextInt() method, recall that nextInt() reads integer tokens; 
because of this, the last newline character for that line of integer input is still queued in the input buffer and 
the next nextLine() will be reading the remainder of the integer line (which is empty).

Sample Input
42
3.1415
Welcome to HackerRank's Java tutorials!

Sample Output
String: Welcome to HackerRank's Java tutorials!
Double: 3.1415
Int: 42

*Try with Regex*

*/

public class Solution {

    public static void solution0() {
        Scanner scan = new Scanner(System.in);
        int i = 0;double d=0;String s=null;
        while(scan.hasNextLine()){
            i = scan.nextInt();
            scan.nextLine();
            d = scan.nextDouble();
            scan.nextLine();
            s = scan.nextLine(); 
        }
        scan.close();
        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
    
    public static void solution1() {
       BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        var wrapperI = new Object(){ Integer i; };
        var wrapperD = new Object(){ Double d; };
        var wrapperS = new Object(){ String s = ""; };
        String line ="";
        while((line = bR.readLine()) != null) {  
             if(wrapperI.i == null){
                 wrapperI.i = Integer.parseInt(line); 
             }else if(wrapperD.d == null){
                 wrapperD.d = Double.valueOf(line);
             }else{
                wrapperS.s = line;  
             }
        }
         bR.close();
         System.out.println("String: " + wrapperS.s);
         System.out.println("Double: " + wrapperD.d);
         System.out.println("Int: " + wrapperI.i);
    }
    
      public static void solution2() {
        BufferedReader bR = new BufferedReader(new InputStreamReader(System.in));
        var wrapperI = new Object(){ Integer i; };
        var wrapperD = new Object(){ Double d; };
        var wrapperS = new Object(){ String s = ""; };
        bR.lines().forEach(line->{
             if(wrapperI.i == null){
                 wrapperI.i = Integer.parseInt(line); 
             }else if(wrapperD.d == null){
                 wrapperD.d = Double.valueOf(line);
             }else{
                wrapperS.s = line;  
             }
         });
         bR.close();
         System.out.println("String: " + wrapperS.s);
         System.out.println("Double: " + wrapperD.d);
         System.out.println("Int: " + wrapperI.i);
    }
}
