/*
Read  integers from stdin and then print them to stdout. Each integer must be printed on a new line. 
There are  lines of input, and each line contains a single integer.

Sample Input
42
100
125

Sample Output
42
100
125

*/

public class Solution {
    public void solution() {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            if (scan.hasNextInt()) {
                System.out.println(scan.nextInt());
            } else if (scan.hasNextBigInteger()) {
                System.out.println("Valore troppo grande.");
                scan.next();
            } else {
                System.out.println("Non è un intero.");
                scan.next();
            }
        }
        scan.close();
    }
}
