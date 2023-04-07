/*
Java's BigDecimal class can handle arbitrary-precision signed decimal numbers.
Given an array, s, of n real number strings, sort them in descending order. 
Each number must be printed in the exact same format as it was read from stdin, meaning that .1 is printed as .1, and 0.1 is printed as 0.1. 
If two numbers represent numerically equivalent values (e.g., .1 = 0.1), then they must be listed in the same order as they were received as input).

Input Format
The first line consists of a single integer, n, denoting the number of integer strings.
Each line i of the n subsequent lines contains a real number denoting the value of s.

Constraints
1 <= n <= 200
Each s has at most 300 digits.

Sample Input
9
-100
50
0
56.6
90
0.12
.12
02.34
000.000

Sample Output
90
56.6
50
02.34
0.12
.12
0
000.000
-100

*/

public class BigDecimaI {

      public static void solution0() {
        Scanner sc= new Scanner(System.in);
         int n=sc.nextInt();
         java.util.List<String> s = new java.util.ArrayList<String>();
         for(int i=0;i<n;i++){
             s.add(sc.next());
         }
         sc.close();
         s.sort(Comparator.comparing(BigDecimal::new,Comparator.reverseOrder()));
         s.forEach((String ss)->System.out.println(ss));
     }
}
