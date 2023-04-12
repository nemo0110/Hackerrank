/*
Given n lines, in each line there are zero or more integers.
You need to answer a few queries where you need to tell the number located in yth position of xth line.
Take your input from System.in.

Input Format
The first line has an integer n. 
In each of the next n lines there will be an integer d denoting number of integers on that line and then there will be d space-separated integers.
In the next line there will be an integer q denoting number of queries. Each query will consist of two integers x and y.

Constraints:
1 <= n <= 20000
0 <= d <= 50000
1 <= q <= 1000
1 <= x <= n

Each number will fit in signed integer.Total number of integers in n lines will not cross 10^5.

Output Format
In each line, output the number located in yth position of xth line. If there is no such position, just print "ERROR!"

Sample Input
5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5

Sample Output
74
52
37
ERROR!
ERROR!
*/

public class ArrayList {
  
    public static void solution0() throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int y0 = Integer.valueOf(br.readLine());
        int[][] x0 = new int[y0][];
        for(int i=0;i<y0;i++) {
            x0[i] = java.util.regex.Pattern.compile("\s+").splitAsStream(br.readLine())
                      .mapToInt(Integer::parseInt)
                      .toArray();
        }
        int y1 = Integer.valueOf(br.readLine());
        int[][] x1 = new int[y1][2];
        for(int i=0;i<y1;i++) {
            x1[i] = Arrays.stream(br.readLine().split("\s+"))
                      .mapToInt(Integer::parseInt)
                      .toArray();
        }
        for(int i=0;i<y1;i++) {
            try {
               System.out.println(x0[(x1[i][0])-1][x1[i][1]]);
            }catch(Exception e) {
                System.out.println("ERROR!");
            }

        }
        br.close();
    }
}
