//taha burak sahin
//Write a program which reads three natural numbers, a, b and c, and then prints "OK"
//if for any two of them their sum is strictly larger than the third (in other words, if
//a triangle with side lengths equal those numbers exists), and "NOT OK" otherwise.

package task1;
import java.util.Scanner;
public class practice1 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.println("enter an integer for a ");
            int a = sc.nextInt();
            Scanner sc2 = new Scanner(System.in);
            System.out.println("enter an integer for b ");
            int b = sc.nextInt();
            Scanner sc3 = new Scanner(System.in);
            System.out.println("enter an integerfor c ");
            int c = sc.nextInt();

            if (a + b > c || a + c > b) {
                System.out.println("ok");
            } else if (b + c > a) {
                System.out.println("ok");
            } else{
                System.out.println("not ok");
            }
        }
    }

