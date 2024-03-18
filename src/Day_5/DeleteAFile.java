package Day_5;

import java.io.File;
import java.io.IOException;

public class DeleteAFile {

    public static void main(String[] args) {
        File file =  new File("D:\\Workstation\\OOPC Class\\oopc_class_day_1\\out\\production\\oopc_class_day_1\\Day_5\\example.txt");
        if (file.delete()){
            System.out.println("File deleted");
        }else {
            System.out.println("Error");
        }


    }
}
