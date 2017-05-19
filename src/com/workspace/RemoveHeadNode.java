
//Exhibit how to remove an head from circular linked list
/**
 * Author : beeyeas@gmail.com
 */

package com.workspace;

class RemoveHeadNode{

    static class Node {
        Integer value;
        Node next;

    }
    //Assuming the node is circular
    static Node getHeadNode(Node node){
        Node p1 = node;
        
        if (node == null) return null;

        if (p1.next == node ) return null;
        
        while (p1.next != node ){
            p1 = p1.next;
        }
        
        p1.next = node.next;
        return p1.next;
    }

    static void printNodes(Node head){
        Node node = head;
        if (node.next == head) return ;
        System.out.println("Printing details of circular linked list " + node.value);

        while (node.next != head){
            System.out.println("Current node value " + node.value);
            node = node.next;
        }
        System.out.println("Last node value " + node.value);

    }

    public static void main(String s[]){
        Node head = new Node();
        head.value = 1;
        
        Node n2 = new Node();
        n2.value = 2;
        head.next = n2;

        Node n3 = new Node();
        n3.value = 3;
        n2.next = n3;

        Node n4 = new Node();
        n4.value = 4;
        n3.next = n4;

        n4.next = head;

        printNodes(head);

        Node newHead = getHeadNode(head);
        printNodes(newHead);

    }
}