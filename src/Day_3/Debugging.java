package Day_3;


class A{
    String name  = "10";
    String age = "12";

    @Override
    public String toString() {
        String value = "name : " + name  +"\nage : " +age;
        return value;
    }
}
public class Debugging {



    public static void main(String[] args) {
        A a1 =  new A();

        System.out.println(a1);

    }


}
