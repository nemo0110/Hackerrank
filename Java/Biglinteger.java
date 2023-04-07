/*
Solve this problem using Java's BigInteger.

Input Format:
There will be two lines containing two numbers, a and b.

Constraints:
a and b are non-negative integers and can have maximum 200 digits.

Output Format:
Output two lines. The first line should contain a+b, and the second line should contain a*b. 
Don't print any leading zeros.

Sample Input
1234
20

Sample Output
1254
24680

*/

public class Biglinteger {
  
  
    public static void solution0() {
      Scanner scan = new Scanner(System.in);
      java.util.List<BigInteger> ints = new java.util.ArrayList<BigInteger>();
      int i = 2;
      while (i-- > 0) {
        ints.add(scan.nextBigInteger());
      }
      scan.close();
      System.out.println(ints.get(0).add(ints.get(1)));
      System.out.println(ints.get(0).multiply(ints.get(1)));
    }
  
  //how can this work?
    public void solution1() {
      Scanner scan = new Scanner(System.in);
      List<BigInteger> ints = new ArrayList<BigInteger>();
      while (scan.hasNext()) {
        ints.add(scan.nextBigInteger());
      }
      System.out.println(ints.get(0).add(ints.get(1)));
      System.out.println(ints.get(0).multiply(ints.get(1)));
      scan.close();
    }
    
  	public static void solution2() {
      Scanner scan = new Scanner(System.in);
      BigInteger[] ints = new BigInteger[2];
      for(int i=0;i<ints.length;i++) {
        ints[i] = scan.nextBigInteger();
      }
      scan.close();
      System.out.println(ints[0].add(ints[1]));
      System.out.println(ints[0].multiply(ints[1]));
	}
  
}
