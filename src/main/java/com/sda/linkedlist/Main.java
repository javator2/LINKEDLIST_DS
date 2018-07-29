package com.sda.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList lista = new LinkedList(2);

        for (int i = 0; i < 5; i++) {
            lista.add(i);
        }

        LinkedList.printList();
        LinkedList.getFind(3);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException er) {

        }
    }
}
