package CodingPractice;

import java.util.Scanner;

public class FizzBuzz {

    public static void main(String args[]){

        //Declaring input to take input from the console
        Scanner input=new Scanner(System.in);
        System.out.println("Enter n value");
        int n=input.nextInt();

        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0)
                System.out.println("Fizzbuzz");
            else if(i%3==0)
                System.out.println("Fizz");
            else if(i%5==0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }
}
