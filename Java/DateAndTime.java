/*
The Calendar class is an abstract class that provides methods for converting between a specific instant in time 
and a set of calendar fields such as YEAR, MONTH, DAY_OF_MONTH, HOUR, and so on, and for manipulating the calendar fields,
such as getting the date of the next week.
Given a date write the method, getDay, which returns the day on that date. 

Example:
month = 8
day = 14
year = 2017

The method should return MONDAY as the day on that date.

Function Description:
findDay has the following parameters:
int: month
int: day
int: year


Returns:
string: the day of the week in capital letters

Input Format:
A single line of input containing the space separated month, day and year, respectively, in MMDDYYYY format.

Constraints:
2000 < year < 3000

Sample Input:
08 05 2015

Sample Output:
WEDNESDAY

Explanation:
The day on August 5th 2015 was WEDNESDAY.
For the environment variable -> https://stackoverflow.com/questions/58319323/whats-the-correct-parameter-value-of-system-getenvoutput-path
In Eclipse, Run Configurations>Environment
*/
public class Solution {
  
      public static void readDate() {
        try {
          BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
          BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
          String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");
          int month = Integer.parseInt(firstMultipleInput[0]);
          int day = Integer.parseInt(firstMultipleInput[1]);
          int year = Integer.parseInt(firstMultipleInput[2]);
          String res = solution0(month, day, year);
          //String res = solution1(month, day, year);
          bufferedWriter.write(res);
          bufferedWriter.newLine();
          bufferedReader.close();
          bufferedWriter.close();
        } catch (IOException e) {
        }
      }

      public static String solution0(int month, int day, int year) {
        LocalDate localDate = LocalDate.of(year, month, day);
        java.time.DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        System.out.println(dayOfWeek.toString());
        return dayOfWeek.toString();
      }
  //the name of the day is translated into local language
      public static String solution1(int month, int day, int year) {
        SimpleDateFormat format = new SimpleDateFormat("yyyy/MM/dd");
        Date date = new Date();
        try {
          date = format.parse(year + "/" + month + "/" + day);
        } catch (ParseException e) {
          e.printStackTrace();
        }
        Calendar c = Calendar.getInstance();
        c.setTime(date);
        String dayWeekText = new SimpleDateFormat("EEEE").format(date);
        System.out.println(dayWeekText.toUpperCase());
        return dayWeekText.toUpperCase();
      }
}
