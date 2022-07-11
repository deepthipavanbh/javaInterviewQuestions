package CodingPractice;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class WordSearch {

    public static void main(String args[]) throws IOException {

        //Reading data from the file line by line
        /*
        BufferedReader reader = new BufferedReader(new FileReader("D:/Tejasvi/abc.txt"));

        for(String currentWord = reader.readLine();currentWord!=null;currentWord=reader.readLine())
        {
            System.out.println(currentWord);
        }*/

         //Reading data from the keyboard 

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the pool of letters");
        String letters = scanner.nextLine();
        System.out.println("Eneter the target word");
        String target=scanner.nextLine();




          //storing the occurences of each character in the string letters in map
        Map<Character,Integer> letterCountMap = getCharacterCountMap(letters);
        System.out.println("Given Letter count:"+letterCountMap);
        Map<Character,Integer> targetCountMap = getCharacterCountMap(target);
        System.out.println("Given target count:"+targetCountMap);
       //checking target is in letters or not
        if(letterCountMap.entrySet().containsAll(targetCountMap.entrySet()))
        {
            System.out.println(" target word is present ");
        }

        //creating a list  from targetkeys
        List<Character> keyTargetList =  Arrays.asList(targetCountMap.keySet().toArray(new Character[0]));
        System.out.println(keyTargetList);

        //creating new map with keyTargetList
        Map<Character,Integer> newMap = new HashMap<>(letterCountMap);
        newMap.keySet().retainAll(keyTargetList);
        System.out.println("New map :"+newMap);
        //finding the minimum value from the new map which tells number of times occurance of the given word
        int min = (int)Collections.min(newMap.values());
       System.out.println(min+"times  "+target+" prestent in the given pool of letters");
    }

    //logic for calculating occurances of each letter
    private static Map<Character, Integer> getCharacterCountMap(String letters) {
        Map<Character , Integer>  lettersCountMap = new HashMap<>();

        for(int i=0; i<letters.length(); i++){
            //fetching each character at index i from letters
            char currentChar = letters.charAt(i);
            //checking if the character is already in the map if so increasing count value or else just adding the chara
            //cter into the map..doing this using ternary operator
              int count = lettersCountMap.containsKey(currentChar ) ?
                            lettersCountMap.get(currentChar) : 0;
              lettersCountMap.put(currentChar,count+1);

        }
        return lettersCountMap;
    }
}
