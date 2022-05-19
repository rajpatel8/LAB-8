public class Q1 {
    public static void main(String[] args) {
        Node node = new Node("+");
        node.left = new Node("-");
        node.left.right = new Node("W");
        node.left.left = new Node("+");
        node.left.left.right = new Node("*");
        node.left.left.right.left = new Node("Y");
        node.left.left.right.right = new Node("Z");
        node.left.left.left = new Node("X");
        node.right = new Node("-");
        node.right.left = new Node("U");
        node.right.right = new Node("V");
        BinaryTree.printTree(node);
        System.out.println("");
    }
}
