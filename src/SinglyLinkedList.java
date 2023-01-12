//Brian Grier; Github.com/GrierTechSolutions
//Professor Stanley; Bridgewater State University

//this is imported to handle some edge cases later
import java.util.NoSuchElementException;

public class SinglyLinkedList {
    //First create your global variables / variables that can be used within any method
    //this one tracks the size of the list
    int size;
    //this tracks the beginning
    Node head;
    //this tracks the end
    Node tail;

    //this creates a singly linked list. This is the constructor.
    public SinglyLinkedList(){
        size = 0;
        head = null;
        tail = null;
    }
    //This method will print out the data in the list
    public void printList(){
        //This handles when this list is empty
        if (size == 0) {
            System.out.println("This list is empty!");
            return;
        }
        //if the list is not empty set the current node as the beginning of the list.
        Node current = head;
        //while the current node is not empty prints it's data and move to the next node
        while(current != null){
            System.out.print(current.data + " -> ");
            //moves to the next node in the list
            current = current.next;
        }
        //after reaching the end, prints out end
        System.out.println("end");
    }
    //adds the first node to the singlylinked list
    public void addFirst(int data){
        //if the list is empty the node created must be set as the head and tail so the program doesn't crash
        if (size == 0){
            Node newNode = new Node(data, null);
            head = newNode;
            tail = newNode;
            //makes the list bigger by one
            ++size;
        }
        else{
            //first node is set to the head of the list
            Node newNode = new Node(data, head);
            head = newNode;
            ++size;
        }
    }
    //this method adds the last node in the list
    public void addLast(int data){
        //repeat the previous step if empty
        if (size ==0){
            Node newNode = new Node(data, null);
            head = newNode;
            tail = newNode;
            ++size;
        }
        //adds the new node to the end of the previous tail then updates the tail
        else{
            Node newNode = new Node(data, null);
            tail.next = newNode;
            tail = newNode;
            ++size;

        }
    }
    //returns the first node in the list
    public Node getFirst(){
        if (size == 0){
            throw new NoSuchElementException("This list is empty");
        }
        else{
            return head;
        }
    }
    //returns the last node in the list
    public Node getLast(){
        if (size == 0){
            throw new NoSuchElementException("This list is empty");
        }
        else{
            return tail;
        }
    }
}

