import java.util.*;
// Que-->> https://practice.geeksforgeeks.org/problems/burning-tree/1/

class Node {
      int data;
      Node left;
      Node right;

      Node(int data) {
            this.data = data;
            left = null;
            right = null;
      }
}
public class BurningTree {
      static Node buildTree(String str) {
            if (str.length() == 0 || str.charAt(0) == 'N') {
                  return null;
            }
            String ip[] = str.split(" ");
            Node root = new Node(Integer.parseInt(ip[0]));
            Queue<Node> queue = new LinkedList<>();
            queue.add(root);
            int i = 1;
            while (queue.size() > 0 && i < ip.length) {
                  Node currNode = queue.peek();
                  queue.remove();
                  String currVal = ip[i];
                  if (!currVal.equals("N")) {
                        currNode.left = new Node(Integer.parseInt(currVal));
                        queue.add(currNode.left);
                  }
                  i++;
                  if (i >= ip.length)
                        break;
                  currVal = ip[i];
                  if (!currVal.equals("N")) {
                        currNode.right = new Node(Integer.parseInt(currVal));
                        queue.add(currNode.right);
                  }
                  i++;
            }
            return root;
      }
}
