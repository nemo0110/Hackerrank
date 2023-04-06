/*
A palindrome is a word, phrase, number, or other sequence of characters which reads the same backward or forward.
Given a string A, print Yes if it is a palindrome, print No otherwise.

Constraints:
A will consist at most 50 lower case english letters.

Sample Input
madam

Sample Output
Yes

*/
public class Solution {
  
    public static void solution0() {
      Scanner scan = new Scanner(System.in);
      while (scan.hasNext()) {
        String s = scan.next();
        StringBuilder sBuilder = new StringBuilder(s);
        sBuilder.reverse();
        // System.out.println(s +" / "+ sBuilder.toString());
        String result = s.equalsIgnoreCase(sBuilder.toString()) ? "Yes" : "No";
        System.out.println(result);
      }
      scan.close();
    }
  
}
