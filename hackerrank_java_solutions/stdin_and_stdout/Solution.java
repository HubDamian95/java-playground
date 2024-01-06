//Scanner scanner = new Scanner(System.in);
//String myString = scanner.next();
//int myInt = scanner.nextInt();
//scanner.close();

//System.out.println("myString is: " + myString);
//System.out.println("myInt is: " + myInt);
//The code above creates a Scanner object named  and uses it to read a String and an int. It then closes the Scanner object because there is no more input to read, and prints to stdout using System.out.println(String). So, if our input is:


package hackerrank_java_solutions.stdin_and_stdout;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt(); // Read the second integer
        int c = scan.nextInt(); // Read the third integer

        System.out.println(a); // Print the first integer
        System.out.println(b); // Print the second integer
        System.out.println(c); // Print the third integer
        scan.close();
    }
}