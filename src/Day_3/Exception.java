package Day_3;

import java.io.BufferedReader;
import java.io.FileReader;

public class Exception {

    public static void main(String[] args) {

     try {

         String s = null;
//         System.out.println(10/1);
//         System.out.println(s.length());
         System.out.println("this ");
         throw new CustomException("null point exception");
     }catch (ArithmeticException ex){
         //ex.printStackTrace();
         System.out.println("error");
     }catch (NullPointerException e){
         System.out.println("null point");
     }catch (java.lang.Exception ex){
        ex.printStackTrace();
     } finally {
         System.out.println("finaly");
     }
        System.out.println("hello");




    }



}
