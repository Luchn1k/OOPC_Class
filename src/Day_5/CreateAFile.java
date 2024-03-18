package Day_5;

import java.io.File;
import java.io.IOException;

public class CreateAFile {
    public static void main(String[] args) {
        try{
            File file =  new File("D:\\Workstation\\OOPC Class\\oopc_class_day_1\\out\\production\\oopc_class_day_1\\Day_5\\example.txt");
            if(file.createNewFile()){
                System.out.println("file Created");
            }

            File files =  new File("D:\\Workstation\\OOPC Class\\oopc_class_day_1\\out\\production\\oopc_class_day_1\\Day_5\\example");

            if(files.mkdir()){
                System.out.println("repo Created");
            }
        }catch(IOException ex){
            ex.printStackTrace();
        }
    }
}
