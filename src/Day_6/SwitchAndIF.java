package Day_6;

public class SwitchAndIF {

    public static void main(String[] args) {
        int x = 10;

        int [] intList = {10,20,30,40,50,60,70};

        for (int i : intList){
            if(i == 20){
                continue;
            }
            System.out.println("not ok "+ i);
        }
    }
}
