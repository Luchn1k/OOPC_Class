package Day4;

import java.util.ArrayList;

public class Loops {

    public static void main(String[] args) {
        ArrayList<String>  lsit  =  new ArrayList<>();
        lsit.add("a");
        lsit.add("b");
        lsit.add("c");

        for(int i = 0;  i < lsit.size(); i ++){
            System.out.println(lsit.get(i));
        }

        for(String value : lsit){
            System.out.println(value);
        }

    }

}
