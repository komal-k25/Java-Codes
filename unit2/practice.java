/* WAP to 
 * create an array of list of size "n"
 * enter n elements
 * sort values in array list
 * take user input to search a name in array list
 * print index position if element is available else print element not found
 */

package unit2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Practice_q {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Enter size
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();
        sc.nextLine(); 

        // Create ArrayList
        ArrayList<String> list = new ArrayList<>();

        // Input elements
        System.out.println("Enter " + n + " names:");
        for (int i = 0; i < n; i++) {
            list.add(sc.nextLine());
        }

        Collections.sort(list);

        System.out.println("Sorted List: " + list);

        System.out.print("Enter name to search: ");
        String searchName = sc.nextLine();

        int index = list.indexOf(searchName);

        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}


