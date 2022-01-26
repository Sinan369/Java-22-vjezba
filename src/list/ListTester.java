package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTester {
    public static void main(String[] args) {
        System.out.println("---------- Array List ----------");
        System.out.println(" ");
        List<String> namesArrayList = new ArrayList<>();
        namesArrayList.add("Mrko");
        namesArrayList.add("Sinan");
        namesArrayList.add("Sinan");
        namesArrayList.add("adnan");
        namesArrayList.add("Mrko");

        for (String element : namesArrayList){
            System.out.println(element);
        }

        System.out.println("---------- Linked List ----------");
        System.out.println(" ");

        List<String> namesLinkedList = new LinkedList<>();
        namesLinkedList.add("Mrko");
        namesLinkedList.add("Sinan");
        namesLinkedList.add("Sinan");
        namesLinkedList.add("adnan");
        namesLinkedList.add("Mrko");

        for (String element : namesLinkedList){
            System.out.println(element);
        }

    }
}
