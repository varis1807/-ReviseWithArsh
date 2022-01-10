import java.util.*;

// Que-->> https://practice.geeksforgeeks.org/problems/delete-n-nodes-after-m-nodes-of-a-linked-list/1/
class Node {
      int data;
      Node next;

      Node(int data) {
            this.data = data;
            this.next = null;
      }
}

public class DeleteNNodesAfterMNodesOfLinkedList {
      public static void linkdelete(Node head, int M, int N) {
            Node temp = head;
            int mul = 1, count = 1;
            int x = N;

            while (temp != null && temp.next != null) {
                  if (count == M * mul) {
                        Node prev = temp;
                        while (x > 0 && temp.next != null) {
                              temp = temp.next;
                              x--;
                        }
                        prev.next = temp.next;
                        mul++;
                        x = N;
                  }
                  count++;
                  temp = temp.next;
            }
      }
}