package java_oops;

import java.util.Scanner;

public class Functions {

        public static void addTheNumber(int number1,int number2){
            int sum = number1 + number2;
            System.out.println(sum);
            return;
        }
        public static void main (String[] args){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the numbers:");
            int number1 = sc.nextInt();
            int number2 = sc.nextInt();
            addTheNumber(number1,number2);
        }

}
    