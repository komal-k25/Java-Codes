/*
 * WAP
 * 1 - create a string = "The Quick Brown Fox Jumps over the Lazy Dog and other Dogs again and again!!!"
 * 2 - count the number of "g" in the string
 * 3 - find all index positions of "again"
 * 4 - find "o" in the string and replace with "A"
 * 5 - divide the string into tokens
 * 6 - count no of tokens
 * 7 - print all tokens and their upper case and lower case
 */

package unit2;

public class String_q {
	public static void main(String[] args) {
		String str = "The Quick Brown Fox Jumps over the Lazy Dog and other Dogs again and again!!!";
		System.out.println(str);
		
		//Count number of 'g'
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'g') {
                count++;
            }
        }
        System.out.println("Number of 'g' = " + count);

        //All index positions of "again"
        String word = "again";
        int index = str.indexOf(word);

        System.out.print("Index positions of \"again\": ");
        while (index != -1) {
            System.out.print(index + " ");
            index = str.indexOf(word, index + 1);
        }
        System.out.println();

        //Replace 'o' with 'A'
        String replaced = str.replace('o', 'A');
        System.out.println("After replacing 'o' with 'A': " + replaced);
        
        //Divide string into tokens
        String[] tokens = str.split(" ");
        
        //Count tokens
        System.out.println("Number of tokens: " + tokens.length);
        
        for (String t : tokens) {
            System.out.println("Token: " + t + " | Upper: " + t.toUpperCase() + " | Lower: " + t.toLowerCase());
        }
               
	}
}
