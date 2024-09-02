class Node {
  int data;
  Node left;
  Node right;
                 
  public Node(int d) {
      data = d;
      left = null;
      right = null;
  }
}
class BST {
    public Node createNewNode(int L) {           // Create a new node with given data
      return new Node(L);
  }
    public Node insert(Node node, int val) {
      if (node == null) {
          return createNewNode(val);
      }
      if (val < node.data) {
          node.left = insert(node.left, val);
      } else if (val > node.data) {
          node.right = insert(node.right, val);
      }
      return node;
  }
    public void inOrderTraversal(Node node) {
      if (node != null) {
          inOrderTraversal(node.left);
          System.out.print(" " + node.data);
          inOrderTraversal(node.right);
      }
  }
}

public class BinaryTree {
  public static void main(String[] args) {
      BST a = new BST();
      Node root = null;
      root = a.insert(root, 9);
      root = a.insert(root, 2);
      root = a.insert(root, 6);
      root = a.insert(root, 12);
      root = a.insert(root, 5);
      root = a.insert(root, 7);
      root = a.insert(root, 1);
      root = a.insert(root, 14);

      System.out.print("\nBinary Tree: ");
      a.inOrderTraversal(root);              // Print the tree in in-order traversal
  }
}

