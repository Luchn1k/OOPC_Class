public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance(){
        if(instance == null)
            instance =  new Singleton();
        return  instance;
    }


}

class TestSingleton {
    public static void main(String[] args) {
        Singleton s = Singleton.getInstance();
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
    }


}

