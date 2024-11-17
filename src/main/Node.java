package main;

public class Node {
    ChainLink data;
    String color;
    Node next;
    
    public Node(ChainLink data) {
        this.data = data;
        this.next = null;
    }
}
