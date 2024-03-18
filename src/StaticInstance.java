public class StaticInstance {
    public static  int x = 10;
    public int y = 20;

}



class TestStaticInstance{
    public static void main(String[] args) {
        StaticInstance s1 = new StaticInstance();
        System.out.println(StaticInstance.x);
        System.out.println(s1.y);

        s1.y = 30;
        StaticInstance.x = 50;

        System.out.println(StaticInstance.x);
        System.out.println(s1.y);
        System.out.println("--------------------");
        StaticInstance s2 = new StaticInstance();
        System.out.println(s2.x);
        System.out.println(s2.y);



    }
}
