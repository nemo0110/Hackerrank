/*
A prime number is a natural number greater than  whose only positive divisors are  and itself.
Given a large integer, n, use the Java BigInteger class' isProbablePrime method to determine and print whether it's prime or not prime.

Input Format
A single line containing an integer, n (the number to be checked).

Constraints
n contains at most 100 digits.

Output Format
If n is a prime number, print prime; otherwise, print not prime.

Sample Input
13

Sample Output
prime

Explanation
The only positive divisors of 13 are 1 and 13, so we print prime.
*/

public class PrimalityTest {

  
      public static void solution0() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String n = bufferedReader.readLine();
        bufferedReader.close();
        BigInteger bi = new BigInteger(n);
        System.out.println(bi.isProbablePrime(1)? "prime" : "not prime"); 
    }
  
      public static void solution1() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.lines().forEach(line ->{
        	   BigInteger bi = new BigInteger(line);
             System.out.println(bi.isProbablePrime(1) ? "prime" : "not prime"); 
        });
        br.close();
    }
  
}
