package com.bridgelabz;

import java.util.HashMap;
import java.util.Map;

class Node <T extends Comparable<T>> {
    public T data;
    public Node next;

    //Node Constructor for Creating New Node
    Node(T data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList <T extends Comparable<T>> {

    Map<T,Integer> wordsFrequency = new HashMap<T,Integer>();

    int location = 0;

    Node head;
    Node tail;
    //Insert Data from Last
    public void insertLast(T data) {
        Node newNode = new Node(data);
        if(tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        location++;
        System.out.println("Location:"+location);
    }

    //Display Node in Linked List
    public void showLinkedList() {
        if(head == null) {
            System.out.println("Linked List is Empty.");
        } else {
            Node<T> temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
        }
    }

    //Show Frequent String
    public void showFrequent() {
        if(head == null) {
            System.out.println("Linked List is Empty.");
        } else {
            Node<T> temp = head;
            while(temp != null) {
                if(wordsFrequency.containsKey(temp.data)) {
                    wordsFrequency.put(temp.data,1+wordsFrequency.get(temp.data));
                } else {
                    wordsFrequency.put(temp.data,1);
                }
                temp = temp.next;
            }
            System.out.println(wordsFrequency);
        }
    }

    //Store Map Object in Linked List
    public void mapInList() {
        for(Map.Entry<T,Integer> M : wordsFrequency.entrySet()) {
            System.out.println(M.getKey()+" : "+M.getValue());
            insertLast((T) (M.getKey()+":"+M.getValue()));
        }
    }

    //Remove Word from Linked List
    public void removeWord(T word) {
        if(head == null) {
            System.out.println("Linked List is Empty.");
        } else {
            if(word.compareTo((T)head.data) == 0) {
                head = head.next;
            } else {
                Node<T> prevNode = head;
                Node<T> temp = head.next;
                while(prevNode != null) {
                    if(temp.data.compareTo(word) == 0) {
                        prevNode.next = temp.next;
                    }
                    prevNode = prevNode.next;
                    temp = temp.next;
                }
            }
        }
    }
}
