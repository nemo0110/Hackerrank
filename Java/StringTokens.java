/*
Given a string, s, matching the regular expression [A-Za-z !,?._'@]+, split the string into tokens. 
We define a token to be one or more consecutive English alphabetic letters.
Then, print the number of tokens, followed by each token on a new line.

Input Format:
A single string, s.

Constraints:
1. 1<= length of s <= 4*10^5
2. s is composed of any of the following: 
English alphabetic letters, blank spaces, exclamation points (!), commas (,), question marks (?), periods (.), underscores (_), apostrophes ('), and at symbols (@).

Output Format
On the first line, print an integer, n, denoting the number of tokens in string s (they do not need to be unique).
Next, print each of the n tokens on a new line in the same order as they appear in input string s.

Sample Input
He is a very very good boy, isn't he?

Sample Output
10
He
is
a
very
very
good
boy
isn
t
he

Explanation:
We consider a token to be a contiguous segment of alphabetic characters.
There are a total of 10 such tokens in string s, and each token is printed in the same order in which it appears in string s.
*/

public class Solution {
    
      public static void solution0() {
            Scanner scan = new Scanner(System.in);
            if(!scan.hasNext()){ 
              System.out.print(0);
              return;
            }
            String s = scan.nextLine();
            scan.close();
            if(s.length() > 400000 || s.length()<=0){
                System.out.println(0);
                return;
            }
            String[] s1= s.trim().split("[ !,?._'@]+");
            System.out.println(s1.length);
            for(String s2:s1) {
                    System.out.println(s2);
            }    
      }  
}
