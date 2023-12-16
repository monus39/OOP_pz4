package src.main.oop.homeworkPz4;

import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyList<>();
       list.addFirst("1");
        list.addLast("123");
        list.addFirst("54");
        System.out.println(list.getElementByIndex(0));
        System.out.println(list.getElementByIndex(2));

    }
}
