class Node {
    String data;
    Node right, left;

    public Node(String d) {
        this.data = d;
        this.right = null;
        this.left = null;
    }
}
public class BinaryTree {
    public static boolean isLeaf(Node node) {
        return node.left == null && node.right == null;
    }

    public static double process(String op, double x, double y) {
        if (op.equals("+")) { return x + y; }
        if (op.equals("-")) { return x - y; }
        if (op.equals("*")) { return x * y; }
        if (op.equals("/")) { return x / y; }

        return 0;
    }

    public static double evaluate(Node root){
        if (root == null)
            return 0;

        if (isLeaf(root))
            return Double.parseDouble(root.data);

        double x = evaluate(root.left);
        double y = evaluate(root.right);
        return process(root.data, x, y);
    }


    public static boolean isOperator(String c) {
        return (c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/") || c.equals("^"));
    }
    public static void printTree(Node root) {
        if (root == null) {
            return;
        }

        if (isOperator(root.data)) {
            System.out.print("(");
        }

        printTree(root.left);
        System.out.print(root.data);
        printTree(root.right);

        if (isOperator(root.data)) {
            System.out.print(")");
        }
    }

    static int findDepth(Node root, String x) {
        if (root == null)
            return -1;

        int dist = -1;

        if ((root.data == x)||
                (dist = findDepth(root.left, x)) >= 0 ||
                    (dist = findDepth(root.right, x)) >= 0)
            return dist + 1;

        return dist;
    }
}

