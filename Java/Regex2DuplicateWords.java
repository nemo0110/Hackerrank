/*
Use regular expressions (RegEx) to remove instances of words that are repeated more than once, but retain the first occurrence of any case-insensitive repeated word. 
For example, the words love and to are repeated in the sentence I love Love to To tO code. 
Complete the code in the editor so it will turn I love Love to To tO code into I love to code?

To solve this challenge, complete the following three lines:
1.Write a RegEx that will match any repeated word.
2.Complete the second compile argument so that the compiled RegEx is case-insensitive.
3.Write the two necessary arguments for replaceAll such that each repeated word is replaced with the very first instance the word found in the sentence. 
It must be the exact first occurrence of the word, as the expected output is case-sensitive.

Input Format:
The first line contains an integer, n, denoting the number of sentences.
Each of the n subsequent lines contains a single sentence consisting of English alphabetic letters and whitespace characters.

Constraints:
Each sentence consists of at most 10^4 English alphabetic letters and whitespaces.
1 <= n <= 100

Output Format
Stub code in the editor prints the sentence modified by the replaceAll line to stdout. 
The modified string must be a modified version of the initial sentence where all repeat occurrences of each word are removed.

Sample Input
5
Goodbye bye bye world world world
Sam went went to to to his business
Reya is is the the best player in eye eye game
in inthe
Hello hello Ab aB

Sample Output
Goodbye bye world
Sam went to his business
Reya is the best player in eye game
in inthe
Hello Ab

Explanation:
We remove the second occurrence of bye and the second and third occurrences of world from Goodbye bye bye world world world to get Goodbye bye world.
We remove the second occurrence of went and the second and third occurrences of to from Sam went went to to to his business to get Sam went to his business.
We remove the second occurrence of is, the second occurrence of the, and the second occurrence of eye from Reya is is the the best 
player in eye eye game to get Reya is the best player in eye game.
The sentence in inthe has no repeated words, so we do not modify it.
We remove the second occurrence of ab from Hello hello Ab aB to get Hello Ab. It's important to note that our matching is case-insensitive, 
and we specifically retained the first occurrence of the matched word in our final string.
*/

public class Regex2DuplicateWords {

  	public static void solution0() {
        String regex = "\\b(\\w+)(?:\\W+\\1\\b)+";
        Pattern p = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        while (numSentences-- > 0) {
          String input = in.nextLine();
          Matcher m = p.matcher(input);
          while (m.find()) {
            input = input.replaceAll(m.group(), m.group(1));
          }
          System.out.println(input);
        }
        in.close();
	  }
  
  	public static void solution1() {
        Scanner in = new Scanner(System.in);
        int numSentences = Integer.parseInt(in.nextLine());
        // <String, Integer> inputs = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);
        HashSet<String> inputs = new LinkedHashSet<String>();
        List<String> output = new ArrayList<String>();
        while (numSentences-- > 0) {
          String[] lines = in.nextLine().split(" ");
          inputs.add(lines[0]);
          for (int i = 1; i < lines.length; i++) {
            if (!lines[i].equalsIgnoreCase(lines[i - 1])) {
              inputs.add(lines[i]);
            }
          }
          StringBuilder newS = new StringBuilder();
          for (String i : inputs) {
            newS.append(i + "\s");
          }
          output.add(newS.toString().substring(0, newS.length() - 1));
          inputs.clear();
        }
        for (String s : output) {
          System.out.println(s);
        }
        in.close();
	  }
  
}
