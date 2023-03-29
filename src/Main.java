/*
Question : Write a program to sum all the number by using recursion.
______________________________________________________________________
Test case :
Number = 541
o/p = 10
 */
import java.util.Scanner;
public class Main {
    // Using recursion.
    static int SumOfNumber(int number){
        if (number >= 0 && number <= 9) return number;
        // Below code is correct :
//        int sum = 0 ;
//        sum += number % 10;
//        int ans = SumOfNumber(number / 10);
//        return sum + ans;

        // Using shorter code :
        return SumOfNumber(number / 10) + number % 10;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0,temp,number,temp2;
        // Without using recursion.
        System.out.println("Enter the number :");
        number = sc.nextInt();
        temp2 = number;
        System.out.println("Printing the result :");
        while (number > 0){
            temp = number % 10;
            sum += temp;
            number = number / 10;
        }
        System.out.println(sum);
        System.out.println("Using recursion :");
        System.out.println(SumOfNumber(temp2));
    }
}