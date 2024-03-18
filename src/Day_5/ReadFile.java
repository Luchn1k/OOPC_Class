package Day_5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    public static void main(String[] args) {
        try {
            FileReader fileReader = new FileReader("D:\\Workstation\\OOPC Class\\oopc_class_day_1\\out\\production\\oopc_class_day_1\\Day_5\\example.txt");
            BufferedReader reader = new BufferedReader(fileReader);

            String line = reader.readLine();
            while (line != null){
                System.out.println(line);
                line = reader.readLine();
            }
            reader.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
