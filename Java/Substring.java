/*
Given a string, s, and two indices, start and end, print a substring consisting of all characters in the inclusive range from start to end-1.

Links:
https://en.wikipedia.org/wiki/Substring
https://docs.oracle.com/javase/8/docs/api/java/lang/String.html#substring-int-int-

Input Format:
The first line contains a single string denoting s.
The second line contains two space-separated integers denoting the respective values of start and end.

Constraints:
1 <= |s| <= 100
0 <= start < end <= n
String s consists of English alphabetic letters (i.e.,[a-zA-Z]) only.

Output Format:
Print the substring in the inclusive range from start to end-1.

Sample Input
Helloworld
3 7

Sample Output
lowo

Explanation

In the diagram below, the substring is highlighted in bold:
  
  0 1 2 3 4 5 6 7 8 9
  h e l L O W O r l d

*/

public class Solution {
  
    public static void solution0() {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();
        System.out.println(S.substring(start,end));
    }
  
      public static void solution1() {
        Scanner in = new Scanner(System.in);
        String s = "HelmoWormd";
        String a = "m";
        String b = "m";
        if(a.equals(b)) {
        	  int start = s.indexOf(a);
            int end = s.indexOf(a, s.indexOf(a) + 1)+1;
            System.out.println(s.substring(start,end));
        }else {
            int start = s.indexOf(a);
            int end = s.indexOf(b)+1;
            System.out.println(s.substring(start,end));
        }
      }
}
