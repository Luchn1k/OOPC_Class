package Day_5;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

    public static void main(String[] args) {
        try {
            FileWriter fileWrite =   new FileWriter("D:\\Workstation\\OOPC Class\\oopc_class_day_1\\out\\production\\oopc_class_day_1\\Day_5\\example.txt",true);
            BufferedWriter writer = new BufferedWriter(fileWrite);
            writer.newLine();
            writer.write("This is a new Line that I added with java");
            writer.newLine();
            writer.write("this is the second new line");
            writer.close();

        }catch (IOException ex){
            ex.printStackTrace();
        }

    }
}
