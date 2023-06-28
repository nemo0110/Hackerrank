/*
You are given a list of student information: ID, FirstName, and CGPA. Rearrange them according to their CGPA in decreasing order. 
If two student have the same CGPA, then arrange them according to their first name in alphabetical order. 
If those two students also have the same first name, then order them according to their ID. No two students have the same ID.

Input Format

The first line of input contains an integer N, representing the total number of students.
The next N lines contains a list of student information in the following structure:

ID Name CGPA

Constraints
2 <= N <= 1000
0 <= ID <= 100000
5 <= |Name| <= 30
0 <= CGPA <= 4.00

The Name contains only lowercase English letters. 
The ID contains only integer numbers without leading zeros. 
The CGPA will contain, at most, 2 digits after the decimal point.

Output Format
After rearranging the students according to the above rules, print the first name of each student on a separate line.

Sample Input
5
33 Rumpa 3.68
85 Ashis 3.85
56 Samiha 3.75
19 Samara 3.75
22 Fahim 3.76

Sample Output
Ashis
Fahim
Samara
Samiha
Rumpa

*/

public class Solution {
  
}
