package LinkedList;

import java.util.*;
class Node {
    int data;
    Node next;
    public Node(int data){
       this.data = data;
       this.next = null;
    }
}
class DeleteNodeInLinkedlist {
    public void deleteNode(Node node) {
        Node prev = null;

        while (node != null && node.next != null) {
            node.data = node.next.data;
            prev = node;
            node = node.next;
        }
        
        if (node != null) {
            if (prev != null)
                prev.next = null;
            else
                node = null;
        }
    }
   public static void main(String[] args) {
      DeleteNodeInLinkedlist ll = new DeleteNodeInLinkedlist();
      
   }


}