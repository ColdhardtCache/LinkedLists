/*
    Brian Grier; Github.com/GrierTechSolutions
    Professor Stanley; Bridgewater State University
 */
public class Node {
    //Here we create 2 global variables that can be used my any method created
    // in this class.
    int data;
    Node next;

    /*
    The node method will take in the 2 global variables as parameters
    since they cannot be directly put into the fields, simply make new ones and assign
    them to the global variables
     */
    public Node(int newData, Node newNext){
        data = newData;
        next = newNext;
    }
}
