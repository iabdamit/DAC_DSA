package cdac.in;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeLinkedList {
    BinaryNode root;

    public BinaryTreeLinkedList() {
        this.root = null;
    }

    // inOrder Traversal
    public void inOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + "   ");
        inOrder(node.right);
    }

    // !
    public void preOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        // Process the current node (print its value)
        System.out.print(node.value + "   ");
        // Traverse the left subtree
        preOrder(node.left);
        // Traverse the right subtree
        preOrder(node.right);
    }

    // Post-order Traversal
    public void postOrder(BinaryNode node) {
        if (node == null) {
            return;
        }
        // Traverse the left subtree
        postOrder(node.left);
        // Traverse the right subtree
        postOrder(node.right);
        // Process the current node (print its value)
        System.out.print(node.value + "   ");
    }

    // insert node
    public void insert(String value) {
        BinaryNode newNode = new BinaryNode(); // memory allocated to the new Node
        newNode.value = value;
        if (root == null) {
            root = newNode;
            System.out.println("New Node inserted at the root level");
            return;
        }
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            if (presentNode.left == null) {
                presentNode.left = newNode;
                System.out.println("Node inserted in the left side tree");
                break;
            } else if (presentNode.right == null) {
                presentNode.right = newNode;
                System.out.println("Node inserted in the right side tree");
                break;
            }
            queue.add(presentNode.left);
            queue.add(presentNode.right);
        }
    }

    // levelOrder Traversal
    public void levelOrder() {
        Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.print(presentNode.value + "   ");
            if (presentNode.left != null) {
                queue.add(presentNode.left);
            }
            if (presentNode.right != null) {
                queue.add(presentNode.right);
            }
        }

    }

}