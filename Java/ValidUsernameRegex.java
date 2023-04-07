/*
You are updating the username policy on your company's internal networking platform. 
According to the policy, a username is considered valid if all the following constraints are satisfied:

1.The username consists of 8 to 30 characters inclusive. 
If the username consists of less than 8 or greater than 30 characters, then it is an invalid username.
2.The username can only contain alphanumeric characters and underscores (_). 
Alphanumeric characters describe the character set consisting of lowercase characters [a-z], uppercase characters [A-Z], and digits [0-9].
3.The first character of the username must be an alphabetic character, i.e., either lowercase character [a-z] or uppercase character [A-Z].

For example:

           Username	                                            Validity
            Julia                                INVALID;Username length < 8 characters
            Samantha                                             VALID
            Samantha_21                                          VALID
            1Samantha                         INVALID; Username begins with non-alphabetic character
            Samantha?10_2A                           INVALID; '?' character not allowed
            
Input Format
The first line of input contains an integer n, describing the total number of usernames. 
Each of the next n lines contains a string describing the username.

Constraints:
1 <= n <= 100
The username consists of any printable characters.

Output Format
For each of the usernames, print Valid if the username is valid; otherwise Invalid each on a new line.

Sample Input 0
8
Julia
Samantha
Samantha_21
1Samantha
Samantha?10_2A
JuliaZ007
Julia@007
_Julia007

Sample Output 0
Invalid
Valid
Valid
Invalid
Invalid
Valid
Invalid
Invalid

Explanation 0
Refer diagram in the challenge statement.

*/
public class ValidUsernameRegex {
  
      public static void usernamePolicy0() {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String regex = "^[a-zA-Z]\\w{7,29}$";
        Pattern p = Pattern.compile(regex);
        while (n-- != 0) {
          String userName = scan.nextLine();
          Matcher m = p.matcher(userName);
          if (m.find()) {
            System.out.println("Valid");
          } else {
            System.out.println("Invalid");
          }
        }
      }
  
  	public static void usernamePolicy1() {
          Scanner scan = new Scanner(System.in);
          int n = Integer.parseInt(scan.nextLine());
          while (n-- != 0) {
            String userName = scan.nextLine();
            int count = 0;
            for (int i = 0; i < userName.length(); i++) {
              if (Character.isDigit(userName.charAt(i))) {
              } else if (Character.isLetter(userName.charAt(i))) {
              } else if (Character.isWhitespace(userName.charAt(i))) {
                count++;
              } else if (Character.compare(userName.charAt(i), '_') == 0) {
              } else {
                count++;
              }
              if (userName.length() < 8 || userName.length() > 30 || !Character.isLetter(userName.charAt(0))) {
                count++;
              }
            }
            if (count > 0) {
              System.out.println("Invalid");
            } else {
              System.out.println("Valid");
            }
          }
	    }
  
}
