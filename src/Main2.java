import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Main2 {

    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();
        ArrayList<Integer> array2 = new ArrayList<>();

        array2.add(10);
        array2.add(23);
        // abc = 123
        // xyz = 234


        Map<String,Integer> datamap =  new HashMap<>();

        datamap.put("BACKGROUND",123);
        datamap.put("xyz",234);

        for(String key: datamap.keySet()){
            System.out.println(key);
        }

        for(Map.Entry<String,Integer> value: datamap.entrySet()){
            System.out.println("key :" + value.getKey());
            System.out.println("value :" + value.getValue());
        }
        System.out.println(datamap.get("BACKGROUND"));

        array2.forEach((value) -> System.out.println(value + 102));

    }
}
