package day_7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Duplicates {

    public static void main(String[] args) {

        List<String> testList = new ArrayList<>();
        testList.add("a");
        testList.add("a");
        testList.add("b");
        testList.add("b");
        testList.add("c");
        testList.add("c");
        testList.add("d");


        //remove duplicates
        List<String> seenValues =  new ArrayList<>();
        List<String> duplicateRemoved = new ArrayList<>();

        for (String s: testList){
            if(!seenValues.contains(s)){
                seenValues.add(s);
                duplicateRemoved.add(s);
            }

        }

        for (String s : duplicateRemoved){
            System.out.println(s);
        }

        Set<String> newDuplicateRemoved = new HashSet<>(testList);
        System.out.println(newDuplicateRemoved);



    }
}
