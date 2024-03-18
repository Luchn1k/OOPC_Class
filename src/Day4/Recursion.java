package Day4;

public class Recursion {
}


class Factorial{
    public static int factorial(int num){
        if(num == 0 || num == 1)
            return  1;
        return  num * factorial(num - 1);
    }

//    public static void main(String[] args) {
//        int n = 5;
//        System.out.println(factorial(n));
//    }
}

class Fibonacci{
    public  static  int fibonacci(int n){
        if(n <= 1)
            return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fibonacci(5));

    }
}