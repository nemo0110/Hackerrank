/*
Given a 6*6 2D array. An hourglass in an array is a portion shaped like this:

          a b c
            d
          e f g

For example, if we create an hourglass using the number 1 within an array full of zeros, it may look like this:

        1 1 1 0 0 0
        0 1 0 0 0 0
        1 1 1 0 0 0
        0 0 0 0 0 0
        0 0 0 0 0 0
        0 0 0 0 0 0
        
Actually, there are many hourglasses in the array above. The three leftmost hourglasses are the following:

      1 1 1     1 1 0     1 0 0
        1         0         0
      1 1 1     1 1 0     1 0 0
      
The sum of an hourglass is the sum of all the numbers within it. 
The sum for the hourglasses above are 7, 4, and 2, respectively.

Task:
Print the largest sum among all the hourglasses in the array.

Input Format
There will be exactly 6 lines, each containing 6 integers seperated by spaces.
Each integer will be between -9 and 9 inclusive.

Output Format
Print the answer to this problem on a single line.

Sample Input
  1 1 1 0 0 0
  0 1 0 0 0 0
  1 1 1 0 0 0
  0 0 2 4 4 0
  0 0 0 2 0 0
  0 0 1 2 4 0
  
Sample Output
19

Explanation
The hourglass which has the largest sum is:

      2 4 4
        2
      1 2 4
      
*/

public class Array2D {

  
    	public static void solution0() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<List<Integer>> arr = new ArrayList<>();
        IntStream.range(0, 6).forEach(i -> {
          try {
            arr.add(Stream.of(br.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt).collect(toList()));
          } catch (IOException ex) {
            throw new RuntimeException(ex);
          }
        });
        int pointer = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.size() - 2; i++) {
          if (pointer < 4 && i != 0) {
            i--;
          }
          if (i + 2 >= arr.size()) {
            break;
          }
          pointer = pointer == 4 ? 0 : pointer;
          int sum = 0;
          for (int k = pointer; k <= pointer + 2; k++) {
            if (k == 0 && i == 0) {
              sum = arr.get(i).get(k);
            } else {
              sum = sum + arr.get(i).get(k);
            }
          }
          for (int k = pointer + 1; k < pointer + 2; k++) {
            sum = sum + arr.get(i + 1).get(k);
          }
          for (int k = pointer; k <= pointer + 2; k++) {
            sum = sum + arr.get(i + 2).get(k);
          }
          max = Math.max(max, sum);
          pointer = pointer + 1;
        }
        System.out.println(max);
        br.close();
	}
}
