/*
Java's System.out.printf function can be used to print formatted output. 
Format and print the input to complete the solution.

Input Format:
Every line of input will contain a String followed by an integer.
Each String will have a maximum of 10 alphabetic characters and each integer will be in the inclusive range from 0 to 999.

Output Format:
In each line of output there should be two columns:
The first column contains the String and is left justified using exactly 15 characters.
The second column contains the integer, expressed in exactly 3 digits; if the original input has less than three digits, 
you must pad your output's leading digits with zeroes.

Sample Input:
java 100
cpp 65
python 50

Sample Output:
================================
java           100 
cpp            065 
python         050 
================================

Explanation:
Each String is left-justified with trailing whitespace through the first 15 characters. 
The leading digit of the integer is the 16th character, and each integer that was less than 3 digits now has leading zeroes.
*/

    public void solution() {
            Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                String s2 = String.valueOf(x);
                while(s2.length()<3){
                    s2 = "0"+s2;
                }
                System.out.printf(s1+"%"+(18-s1.length())+"s %n", s2);
            }
            System.out.println("================================");
    }

    public void solution() {
        int i = 0;
        while(scan.hasNext()){
        	if(i == 0 || i%3==0) {
        		 System.out.println("================================");
        	}
            String s1=scan.next();
            String s2 = String.valueOf(scan.nextInt());
            while(s2.length()<3){
                s2 = "0"+s2;
            }
            System.out.printf(s1+"%"+(18-s1.length())+"s %n", s2);
            i++;
            if(i % 3 == 0) {
                System.out.println("================================");
            }
        }
        scan.close();
    }

	public void solution() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("================================");
        br.lines().forEach(line ->{
        	if(line.split(" ").length>1) {
        	String[]s =line.split(" ");
        	  while(s[1].length()<3){
        		  s[1] = "0"+s[1];
              }
        	  System.out.printf(s[0]+"%"+(18-s[0].length())+"s %n", s[1]);
        	}
        });
        System.out.println("================================");
        br.close();
	}
