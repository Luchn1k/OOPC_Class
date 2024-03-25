package day_7;

import java.util.*;

public class CollectionJava {

    public static void main(String[] args) {
        // List

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new LinkedList<>();
        List<String> list3 = new Vector<>();
        Stack<String> list4 = new Stack<>();

       // arraylist

        list1.add("abc");
        list1.add("xyz");

        for(String s : list1){
            System.out.println(s);
        }


        //linked list

        list2.add("abc");
        list3.add("xyz");

        for(String s : list1){
            System.out.println(s);
        }

        // vectors

        list3.add("abc");
        list3.add("xyz");

        for(String s : list1){
            System.out.println(s);
        }

        // stack

        list4.push("stack1");
        list4.push("stack2");

        System.out.println(list4.peek());
        System.out.println(list4.pop());
        System.out.println(list4.peek());


        // queue
        Queue<String> queue = new PriorityQueue<>();
        queue.add("q1");
        queue.add("q2");
        System.out.println(queue.poll());

        // Set interfaces

        //Hashset, TreeSet, LinkedHashSet

        // TreeSet

        TreeSet<String> treeSet = new TreeSet<>(list1);
        treeSet.add("d");
        treeSet.add("b");
        treeSet.add("a");
        treeSet.add("z");
        treeSet.add("k");
        treeSet.add("a");
        System.out.println("Tree Set");
        System.out.println(treeSet);



    }
}
