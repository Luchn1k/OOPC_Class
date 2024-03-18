package Day_5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CarRebuild {

    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream  = new FileInputStream("bmw1.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Object obj  = objectInputStream.readObject();
            Car car = (Car) obj;

            System.out.println(car.getColor());

        }catch (IOException | ClassNotFoundException ex){
            ex.printStackTrace();
        }
    }
}
