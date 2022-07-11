import java.util.Scanner;

public class DuplicateWords {

          public static int findDuplicateWord(String s,String word){
              //parsing the string by spaces
              String str[]=s.split(" ");

              //finding the word occurance
              int count=0;
              for(String a:str){
                  if(word.equals(a))
                      count++;
              }
              return count;
          }

    public static void main(String[] args) {

                Scanner keyboared =  new Scanner(System.in);
        System.out.println("Enter the string");
        String s = keyboared.nextLine();
        System.out.println("enter the word ");
        String word= keyboared.nextLine();
        //calling findDuplicateWord() method to find the no of occurrences of given word
        System.out.println(word+"  presented "+DuplicateWords.findDuplicateWord(s,word) +" times");
    }

}
