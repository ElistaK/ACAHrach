//  Take two numbers from input. Output true if one of them is 10 or if their sum is 10.
//  Test Data: 2, 8
//  Expected Output: true

package aramkhachatryan;

import java.util.Scanner;

public class HomeworkB7b {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two integer numbers.");
        System.out.print("A: ");
        int num1 = input.nextInt();
        System.out.print("B: ");
        int num2 = input.nextInt();
        System.out.println((num1 == 10) || (num2 == 10) || (num1 + num2 == 10));
    }
}