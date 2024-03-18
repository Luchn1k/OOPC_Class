package Day_5;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Car implements Serializable {
    private  String name;
    private String brand;

    private String color;

    public Car(String name, String brand, String color) {
        this.name = name;
        this.brand = brand;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}



class TestCar{
    public static void main(String[] args) {
        Car car = new Car("M8","BMW","Black");
        System.out.println(car.getBrand());

        // save the object
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("bmw1.ser");
            ObjectOutputStream objectOutputStream =  new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(car);
            objectOutputStream.close();
            fileOutputStream.close();

        }catch (IOException ex){
            ex.printStackTrace();
        }


    }
}
