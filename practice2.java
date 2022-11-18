//taha burak sahin
//Define in your program four numbers of type int — a1, a2, b1, b2 — which we interpret
//as coordinates on the number axis of end points of two intervals: A = [a1, a2] and
//B = [b1, b2]. The program reads from the user one number (say, x) of type int and
//prints whether it is true that where \ denotes the set difference and 	 the symmetric difference
// package task1;
package task1;
import java.util.Scanner;
public class practice2 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("input a1");
            int a1 = sc.nextInt();
            System.out.println("input a2");
            int a2 = sc.nextInt();
            System.out.println("input b1");
            int b1 = sc.nextInt();
            System.out.println("input b2");
            int b2 = sc.nextInt();
            int a =a1&a2;
            System.out.println("Interval A = " +a);
            int b = b1 & b2;
            System.out.println("Interval B = " + b);
            System.out.println("input x");
            int x = sc.nextInt();
            System.out.println("Interval A = [" + a1 + "," + a2 + "]");
            System.out.println("Interval B = [" + b1 + "," + b2 + "]");
            System.out.println("Enter x " + x);
            System.out.println("x in A: ");
            System.out.println("x in B: ");
            System.out.println("x in A/B: ");
            System.out.println("x in B/A: ");
            System.out.println("x in intersection of A and B: ");
            System.out.println("x is union of A and B: ");
            System.out.println("x in symm. diff. of A and B: ");

        }
    }
