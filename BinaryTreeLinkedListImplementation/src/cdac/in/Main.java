package cdac.in;

public class Main {

    public static void main(String[] args) {
        BinaryTreeLinkedList bll = new BinaryTreeLinkedList();
        BinaryNode bN1 = new BinaryNode();
        bN1.value = "N1";
        BinaryNode bN2 = new BinaryNode();
        bN2.value = "N2";
        BinaryNode bN3 = new BinaryNode();
        bN3.value = "N3";
        BinaryNode bN4 = new BinaryNode();
        bN4.value = "N4";
        BinaryNode bN5 = new BinaryNode();
        bN5.value = "N5";
        BinaryNode bN6 = new BinaryNode();
        bN6.value = "N6";
        BinaryNode bN7 = new BinaryNode();
        bN7.value = "N7";
        BinaryNode bN8 = new BinaryNode();
        bN8.value = "N8";
        BinaryNode bN9 = new BinaryNode();
        bN9.value = "N9";

        bN1.left = bN2;
        bN1.right = bN3;

        bN2.left = bN4;
        bN2.right = bN5;

        bN3.left = bN6;
        bN3.right = bN7;

        bN4.left = bN8;
        bN4.right = bN9;
        System.out.print("In Order : ");
        bll.root = bN1;
        bll.inOrder(bll.root);
        System.out.println();
        System.out.print("Pre Order : ");
        bll.preOrder(bll.root);
        System.out.println();
        System.out.print("Post Order : ");
        bll.postOrder(bll.root);

    }

}
