public class Q2 {
    public static void main(String[] args) {
        Node node = new Node("+");
        node.left = new Node("-");
        node.left.right = new Node("6");
        node.left.left = new Node("+");
        node.left.left.right = new Node("*");
        node.left.left.right.left = new Node("2");
        node.left.left.right.right = new Node("1");
        node.left.left.left = new Node("3");
        node.right = new Node("-");
        node.right.left = new Node("5");
        node.right.right = new Node("4");
        BinaryTree.printTree(node);
        System.out.println("");
        System.out.println("The value of the expression tree is " + BinaryTree.evaluate(node));

    }
}
