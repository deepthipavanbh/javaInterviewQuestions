package CodingPractice;

import java.util.HashMap;
import java.util.Map;

public class TwoSum1 {

    public static void main(String args[]){
       //Declaring  static Array of integers and target sum
        int[] numbers = new int[] {2,3,7,4,8};
        int target =7;
        //calling method getTwoSum which returns indexes of two numbers whose  sum makes target
          int[] result =  getTwoSum(numbers,target);
        System.out.println(result [0] +"   "+ result[1]);
    }

      //Defining getTwoSum method
    public static int[] getTwoSum(int[] numbers,int target){
       //to keep track of visited  numbers declaring a map:the key is going to be the value of the number and the
        //value is going to be the position of the number(the index in the array)
        //using the map we are traversing once,instead of traversing the array twice like for each element in
        // //the outer loop,all the elements in
        //the inner loop  until find the target sum which takes lot of time
         Map<Integer,Integer> visitedNumbers = new HashMap<>();

        for(int i=0;i<numbers.length;i++){
            //the number in delta which we are looking for
            int delta =target - numbers[i];
                if(visitedNumbers.containsKey(delta))
                {
                    return new int[] { visitedNumbers.get(delta),i};
                }
                visitedNumbers.put(numbers[i],i);

        }
                return new int[] {-1,-1};
    }


}
