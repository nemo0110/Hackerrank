/*
An array is a simple data structure used to store a collection of data in a contiguous block of memory.
Each element in the collection is accessed using an index, and the elements are easy to find because they're stored sequentially in memory.

Because the collection of elements in an array is stored as a big block of data, we typically use arrays 
when we know exactly how many pieces of data we're going to have. 

To create an array of integers named  that can hold four integer values, you would write the following code:
  
  int[] myArray = new int[4];

This sets aside a block of memory that's capable of storing 4 integers. 
Each integer storage cell is assigned a unique index ranging from 0 to one less than the size of the array, and each cell initially contains a 0.
In the case of myArray, we can store integers at indices 0, 1, 2, and 3.
Let's say we wanted the last cell to store the number 12; to do this, we write:

    myArray[3] = 12;

Similarly, we can print the contents of the last cell with the following code:

    System.out.println(myArray[3]);
    
The code above prints the value stored at index 3 of myArray, which is  12(the value we previously stored there). 
It's important to note that while Java initializes each cell of an array of integers with a 0, not all languages do this.

Task:
1.Read an integer from stdin and save it to a variable, n, denoting some number of integers.
2.Read n integers from stdin and save each integer to a variable, a.
3.Print each element of an array of integers named a.
4.Create an array, a, capable of holding n integers.
Modify the code in the loop so that it saves each sequential value to its corresponding location in the array. 

Input Format:
The first line contains a single integer, n, denoting the size of the array.
Each line i of the n subsequent lines contains a single integer denoting the value of element a.

Output Format
Loops through the array and print each sequential element on a new line.

Sample Input
5
10
20
30
40
50

Sample Output
10
20
30
40
50

Explanation
When we save each integer to its corresponding index in a, we get a = [10,20,30,40,50]. 
The locked code prints each array element on a new line from left to right.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

public class Array1D {
  	public static void solution0() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        List<Integer> a = Stream.of(br.readLine().replaceAll("\\s+$", "").split(" ")).map(Integer::parseInt)
            .collect(toList());
        for (int i = 1; i < n; i++) {
          a.add(Integer.parseInt(br.readLine().trim()));
        }
        for (int element : a) {
          System.out.println(element);
        }
        br.close();
	}
  
}
