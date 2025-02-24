package dsakunalkushwaha.BasicJavaProgram;

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        System.out.println("loops and conditional statements in java");
//        conditional statements
//
//        int salary = 10000;
//        if(salary > 20000){
//            salary += 3000;
//        }
//        else{
//            salary += 2000;
//        }
//        System.out.println(salary);

//        Loops

//        For Loop
//        for (int i = 0; i <= 5; i++) {
//            System.out.print(i + " ");
//        }

//        while loop
//        int val = 1;
//        while( val <= 5){
//            System.out.println(val);
//            val += 1;
//        }

        // ------------------------Questions----------------------

// Q. find largest of three numbers.
//        int a = 100;
//        int b = 50;
//        int c = 150;
//        if( a > b && a > c){
//            System.out.println("a is largest");
//        } else if (b > a && b > c) {
//            System.out.println("b is largest");
//        }
//        else{
//            System.out.println("c is largest");
//        }
        // solution-2
//        int max = a;
//        if(b > max){
//            max = b;
//
//        } else if (c > max) {
//           max = c;
//        }
//        System.out.println(max);

// Q. check whether the char is uppercase or lowercase.
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter your input");
//        char ch = input.next().trim().charAt(0);
//        if( ch >= 'a' && ch <= 'z'){
//            System.out.println("lowercase");
//        }
//        else{
//            System.out.println("uppercase");
//        }

// Q. swap two number
        int num1 = 100;
        int num2 = 200;
        // with third variable
//        int temp = num1;
//        num1 = num2;
//        num2 = temp;
//        System.out.println(num1);//200
//        System.out.println(num2);//100
        // without using third variable
//        num1 = num1 + num2;
//        num2 = num1 - num2;
//        num1 = num1 - num2;
//        System.out.println(num1);//200
//        System.out.println(num2);//100

// Q. find nth fibonacci number.
//        int n = 6; // 8
//        // 0,1,1,2,3,5,8,13
//        int a = 0;
//        int b = 1;
//        int count = 2;
//        while( count <= n){
//            int temp = b;
//            b = a+b;
//            a = temp;
//            count++;
//        }
//        System.out.println(b);

// Q. find occurence of a digit in number
//int number = 145776778;
//int occurence = 7;
//int count = 0;
//while( number > 10){
//    if(number % 10 == 7){
//        count++;
//    }
//    number = number/10;
//}
//System.out.println(count);

// Q. reverse a number
//int number = 123;
//int result = 0;
//while( number > 0 ){
//    int rem = number % 10;
//    result = result * 10 + rem;
//    number = number / 10;
//}
//System.out.println(result);




    }
}
