/*
Static initialization blocks are executed when the class is loaded, and you can initialize static variables in those blocks.
You can read about it at https://docs.oracle.com/javase/tutorial/java/javaOO/initial.html.

Input Format:
There are two lines of input. The first line contains B: the breadth of the parallelogram.
The next line contains H: the height of the parallelogram.

Constraints:
-100 <= B <= 100
-100 <= H <= 100

Output Format:
If both values are greater than zero, then the main method must output the area of the parallelogram. 
Otherwise, print "java.lang.Exception: Breadth and height must be positive" without quotes.

Sample input 1
1
3

Sample output 1
3

Sample input 2
-1
2

Sample output 2
java.lang.Exception: Breadth and height must be positive

check Non static initializer
*/

public class main {
    //solution0
    static int B,H;
    static boolean flag;
    static{
        Scanner sc = new Scanner(System.in);
        B = sc.nextInt();
        H = sc.nextInt();
        flag = B>0 && H>0 ? true : false;
        if(B<=0 || H<=0 ) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
        sc.close();
    }

    public static void main(String[] args){
        if(flag){
          int area=B*H;
          System.out.print(area);
        }
    }
  
    //solution1
    static {
      Scanner sc = new Scanner(System.in);
      final int B = sc.nextInt();
      final int H = sc.nextInt();
      final boolean flag = B > 0 && H > 0 ? true : false;
      sc.close();
      if (B <= 0 || H <= 0) {
        System.out.println("java.lang.Exception: Breadth and height must be positive");
      }
      if (flag) {
        int area = B * H;
        System.out.print(area);
      }
    }

    public static void main(String[] args) {
    }
  
  //solution2
  	private static String initializeClassVariable() {
      Scanner sc = new Scanner(System.in);
      final int B = sc.nextInt();
      final int H = sc.nextInt();
      final boolean flag = B > 0 && H > 0 ? true : false;
      sc.close();
      String result = "";
      if (flag) {
        int area = B * H;
        result = String.valueOf(area);
      } else {
        result = "java.lang.Exception: Breadth and height must be positive";
      }
      return result;
	}

	public static void main(String[] args) {
		final String myVar = initializeClassVariable();
		System.out.println(myVar);
	}

}
