public class Main {
    public static void main(String[] args) {
        // TreeNode<String> root = new TreeNode<>("Luke");
        // root.setLeft(new TreeNode<>("Leia"));
        // root.setRight(new TreeNode<>("Chewie"));
        // root.getLeft().setRight(new TreeNode<>("Han Solo"));
        // root.getRight().setRight(new TreeNode<>("Vader"));
        // root.getRight().getRight().setLeft(new TreeNode<>("C3PO"));
        // root.getRight().getRight().setRight(new TreeNode<>("R2D2"));

        BinaryTree<String> names = new BinaryTree<>();
        names.insert("Luke");
        names.insert("Leia");
        names.insert("Han Solo");
        names.insert("Vader");
        names.insert("Chewbacca");
        names.insert("C3PO");
        names.insert("R2D2");

    if (names.contains("Yoda")) {
        System.out.println("Yoda has been found");
        }

    names.inOrder();

    }    
}
