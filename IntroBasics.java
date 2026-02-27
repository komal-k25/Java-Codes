public class helloworld {
	public static void main(String[] arg) {
		System.out.print("Hello world!");
	}
}

//Write a program in java to print your name, roll_no, address in 3 different lines.
package unit1;
public class IntroBasics {
    //print each ch of a string
    static void printChar(String a) {
        for (int i = 0; i < a.length(); i++) {
            System.out.print(a.charAt(i));
        }
        System.out.println();
    }

    public static void main(String[] args) {
       String name="Komal";
       String roll_no="24070122090";
       String address="Noida, Delhi-NCR";
       printChar(name);
       printChar(roll_no);
       printChar(address);
    }
}

