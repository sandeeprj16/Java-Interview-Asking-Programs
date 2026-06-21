package CollectionFramework;

import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class ArrayListDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(40);
        list.add(10);
        list.add(0, 34);
        list.add(23);
        System.out.println(list);

        Vector<Integer> vector=new Vector<>();
        vector.add(11);
        vector.add(13);
        vector.add(30);
        System.out.println("vector "+vector);
    
        Stack stack=new Stack();
        stack.add("sandy");
        stack.add("mummy");
        stack.add("bhai");
        stack.add("papa");
        System.out.println("Stack: "+stack);
        System.out.println("peek: "+stack.peek());
        System.out.println("Pop: "+stack.pop());
        System.out.println("push: "+stack.push("bhai"));
        System.out.println("Stack: "+stack);

        Set set=new HashSet<>();
        set.add(12);
        set.add(13);
        set.add(13);
        set.add(55); 
        set.add(31);
        System.out.println("Set : "+set);

        Set<String> set2=new LinkedHashSet<>();
        set2.add("sandy");
        set2.add("vishal");
        set2.addAll(stack);
        System.out.println("LinkedHAshSet: "+set2);

        TreeSet treeSet=new TreeSet<>();
        treeSet.add(32);
        treeSet.add(12);
        treeSet.add(44);
        treeSet.add(22);
        treeSet.add(32);
        System.out.println("TreeSet: "+treeSet);

    }
} 