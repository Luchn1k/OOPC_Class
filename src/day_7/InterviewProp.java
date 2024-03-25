package day_7;

import java.util.HashSet;
import java.util.Set;

public class InterviewProp {

    public static void main(String[] args) {
        String word = "Cricket";


        // code


        char[] wordArray = word.toLowerCase().toCharArray();
        Set<Character> seenList = new HashSet<>();

        for(char c : wordArray){
            if(seenList.contains(c)){
                System.out.println(Character.valueOf(c));
                break;
            }else{
                seenList.add(c);
            }
        }



    }
}
