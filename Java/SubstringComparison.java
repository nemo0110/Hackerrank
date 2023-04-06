/*
We define the following terms:

1. Lexicographical Order, also known as alphabetic or dictionary order, orders characters as follows:
    A < B < ... < Y < Z < a < b < ... < y < z

For example, ball < cat, dog < dorm, Happy < happy, Zoo < ball.

2.A substring of a string is a contiguous block of characters in the string. For example, the substrings of abc are a, b, c, ab, bc, and abc.
Given a string, s, and an integer, k, complete the function so that it finds the lexicographically smallest and largest substrings of length k.

Function Description:
getSmallestAndLargest function has the following parameters:

string s: a string
int k: the length of the substrings to find

Returns:
string: the string ' + "\n" + ' where and are the two substrings

Input Format:
The first line contains a string denoting s.
The second line contains an integer denoting k.

Constraints:
1 <= |s| <= 1000
s consists of English alphabetic letters only (i.e., [a-zA-Z]).

Sample Input 0
welcometojava
3

Sample Output 0
ava
wel

Explanation 0:

String s="welcometojava" has the following lexicographically-ordered substrings of length k=3 :
    ["ava","com","elc","eto","jav","lco","met","oja","ome","toj","wel"]

We then return the first (lexicographically smallest) substring and the last (lexicographically largest) 
substring as two newline-separated values (i.e., ava\nwel).

The stub code in the editor then prints ava as our first line of output and wel as our second line of output.

Links:
https://en.wikipedia.org/wiki/Lexicographic_order
https://en.wikipedia.org/wiki/Method_stub
*/

public class Solution {

        public static void solution0() {
            Scanner scan = new Scanner(System.in);
            String s = scan.next();
            int k = scan.nextInt();
            scan.close();
            String smallest = "";
            String largest = "";
            TreeSet<String> substrings = new TreeSet<String>();
            for(int i = 0;i<s.length();i++) {
                if(i+k>s.length()) {
                    break;
                }
                substrings.add(s.substring(i, i+k));        
            }
            smallest = substrings.first();
            largest = substrings.last();
            System.out.println(smallest + "\n" + largest);
        }
    
        public static void substrcomp1() {
            Scanner scan = new Scanner(System.in);
            String s = scan.next();
            int k = scan.nextInt();
            scan.close();
            TreeSet<String> substrings = new TreeSet<String>();
            int i = 0;
            while(i+k<=s.length()) {
                substrings.add(s.substring(i, i+k));        
                i++;
            }
            System.out.println(substrings.first() + "\n" + substrings.last());
        }
}
