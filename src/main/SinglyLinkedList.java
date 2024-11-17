package main;

public class SinglyLinkedList {
    
    private Node head;

    public void append(ChainLink newChainLink) { //append chainlink object to singly linked list
        Node newNode = new Node(newChainLink);   //take in chainlink object as data for node

        if (head == null) {   //if appending to empty linked list
            head = newNode;
        }
        else {  //if appending to non-empty linked list
            Node current = head;  //initialize current node pointer to head
            while (current.next != null) {  
                current = current.next;   //update current pointer to current next
            }
            current.next = newNode;  //when current node next value is null, it is the last node in the list, update value of current node's next to the newly created node
        }
    }

    public String retrieveNode(int index) { //See data of node at a given index
        Node current = head;
        int count = 0;

        while (current != null) {
            if (count == index) {
                return current.data.color; 
            }
            current = current.next;
            count++;
        }
        throw new IndexOutOfBoundsException();
    }

    public void displaySinglyLinkedList() {
        Node current = this.head;
        
        while (current != null) {
            System.out.print(current.data.color + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {

        SinglyLinkedList sll = new SinglyLinkedList();

        //create linked list

        ChainLink linkOne = new ChainLink("Gold");
        ChainLink linkTwo = new ChainLink("Silver");
        ChainLink linkThree = new ChainLink("Bronze");
        sll.head = new Node(linkOne);
        Node second = new Node(linkTwo);
        Node third = new Node(linkThree);

        //link nodes
        sll.head.next = second;
        second.next = third;

        //create chain link objects to append
        ChainLink linkFour = new ChainLink("Red");
        ChainLink linkFive = new ChainLink("Blue");
        ChainLink linkSix = new ChainLink("Green");

        //append chain link objects to list
        sll.append(linkFour);
        sll.append(linkFive);
        sll.append(linkSix);

        //display singly linked list
        sll.displaySinglyLinkedList();

        //Show ChainLink data at index 4
        String viewedLink = sll.retrieveNode(4);
        System.out.println("ChainLink at index 4: " + viewedLink);
    }
}
