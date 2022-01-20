package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashTableDemo {
    public static void main(String[] args) {
        //Welcome message for User
        System.out.println("Welcome to Hash Table and Binary Tree Problem Developed by, Tahir Mansuri.");

        //Creating Linked List Object
        LinkedList<String> linkedList = new LinkedList();
        Scanner sc = new Scanner(System.in);

        //Getting String Input from User
        System.out.println("Enter the String : ");
        String s = sc.nextLine();

        //Split String into String Object Array
        String a[] = s.split(" ");

        //Insert each separated string word in Linked List from Last
        for(String x : a) {
            linkedList.insertLast(x);
        }

        //Showing the Linked List String
        linkedList.showLinkedList();

        //Show Frequent Words Count
        linkedList.showFrequent();

        //Insert Map Item in Linked List
       // linkedList.mapInList();
       // linkedList.showLinkedList();

        //Remove the Word from Linked List
        System.out.println("Enter the Word to Remove from String : ");
        linkedList.removeWord(sc.next());

        linkedList.showLinkedList();
    }
}
