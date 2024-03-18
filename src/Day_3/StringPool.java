package Day_3;

public class StringPool {

   static String a = "123";
    static String b = "123";
    static  StringBuffer  s = new StringBuffer("123");


    public static void main(String[] args) {
        s.append("3434");
        a += "4342";
        System.out.println(s);
        System.out.println(a == s.toString());

    }
}
