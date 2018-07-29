package com.sda.linkedlist;

public class LinkedList {

    private static Node head;
    private static int size;

    public LinkedList(Object data) {
        head = new Node(data);
    }

    public void add(Object data) {
        Node copy = head;
        System.out.println("copy" + head);
        head = new Node(data);
        head.next = copy;
        System.out.println("HEAD" + head);
        System.out.println("NEXT" + head.next);
        size++;
    }

    public void addTail(Object data) {
        Node copy = head;
        while (copy.next != null) {
            copy = copy.next;
        }
        copy.next = new Node(data);
        size++;
    }

    public static void getFind(int index) {
        Node copy = head;
        for (int i = 0; i < index; i++) {
            copy = copy.next;
        }
//        return copy;
        System.out.println("Number index " +index +": " + copy.getData());
    }

    public static void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }

    class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "data=" + data +
                    ", next=" + next +
                    '}';
        }
    }

}
