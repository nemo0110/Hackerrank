/*
Given an integer N, print its first 10 multiples.
Each multiple N x i (where 1<=i<=10) should be printed on a new line in the form: N x i = result.

Input Format:
A single integer,N.

Constraints:
2<=N<=20

Output Format:
Print 10 lines of output; each line i (where 1<=i<=10) contains the result of N x i in the form:
N x i = result.

Sample Input
2

Sample Output
2 x 1 = 2
2 x 2 = 4
2 x 3 = 6
2 x 4 = 8
2 x 5 = 10
2 x 6 = 12
2 x 7 = 14
2 x 8 = 16
2 x 9 = 18
2 x 10 = 20
*/
public class Solution{
	
    public static void solution0() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine().trim());
        for(int i=1;i<=10;i++){
            int result = N*i;
            System.out.println(N+" x "+i+" = "+result );
        }
        br.close();
    }

	public static void solution1() throws IOException {
    		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input;
		while ((input = br.readLine()) != null) {
			int n = -1;
			try {
				n = Integer.parseInt(input);
			} catch (Exception e) {
				System.out.println("Insert a valid integer.");
			}
			if (n != -1) {
				for (int i = 1; i <= 10; i++) {
					int result = n * i;
					System.out.println(n + " x " + i + " = " + result);
				}
			}
		}
		br.close();
	}

    public static void solution2() throws IOException {
      Scanner scan = new Scanner(System.in);
      while (scan.hasNextInt()) {
        int N = scan.nextInt();
        for (int i = 1; i <= 10; i++) {
          int result = N * i;
          System.out.println(N + " x " + i + " = " + result);
        }
      }
      scan.close();
    }
}
