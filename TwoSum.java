package CodingPractice;

import java.util.Scanner;

/* Given an Array of Integers ,return indices of two numbers such that they add up to a specific target
you may assume that each input would have exactly one solution and you may not use the same element twice
ex: Given numbers:[2, 7,11,5], target 9
Because num[o]+num[1]=9
return [0,1]
 */
public class TwoSum {
      public static void main(String args[])
      {
          int target = 9;
          int sum=0;
          Scanner input=new Scanner(System.in);
          //Reading the elements of array from the key board
          System.out.println("Enter the size of the Array");
          int n=input.nextInt();
          int a[]=new int[n];
          System.out.println("Enter the elements of the Array");
          for(int i=0;i<n;i++){
              a[i]=input.nextInt();
          }
        //printing the elements of Array
          for(int i=0;i<n;i++) {
              System.out.println(a[i] + "  ");
          }
       //logic to find targetsum
          for(int i=0;i<n;i++)
          {

              for(int j=i+1;j<n;j++){
                  if(a[i]+a[j] == target) {
                      System.out.println(i + "  " + j);
                      break;
                  }
              }
          }
      }
}
