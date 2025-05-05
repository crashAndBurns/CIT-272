public class BinaryTree<E extends Comparable<E>>{
    private TreeNode<E> root;

    public BinaryTree() {
        root = null;
    }

    public void insert(E data) {
        // When tree is empty, create a new tree node
        // Set root equal to that node
        if  (root == null) {
            root = new TreeNode<>(data);
        } else {
            insert(data, root);
        }
    }

    private void insert(E data, TreeNode<E> rootNode) {
        if (data.compareTo(root.getData()) < 0) {
            // if less than root data go left
            // Two possibilities 
            // 1. Left node is null
            if (rootNode.getLeft() == null) {
                // base case! the path we're looking at is unoccupied
                rootNode.setLeft(new TreeNode<E>(data));
            } else {
                insert(data, rootNode.getLeft());
            }
            // 2. left node is not null
        } else {
            // if greater than root data go right
            if (rootNode.getRight() == null) {
                // base case! the path we're looking at is unoccupied
                rootNode.setRight(new TreeNode<E>(data));
            } else {
                insert(data, rootNode.getRight());
            }
        }
    }

    public boolean contains(E data) {
        if (root == null) {
            return false;
        } else {
            return(contains(data, root));
        }
    }

    private boolean contains(E data, TreeNode<E> rootNode) {
        if (rootNode == null) {
            return false;
        } else {
            // If node data is what we're looking for
            if (data.compareTo(rootNode.getData()) == 0) {
                return true;
            // if node data is not what we're looking for
            } else if (data.compareTo(rootNode.getData()) < 0) {
                return (contains(data,  rootNode.getLeft()));
            } else {
                return (contains(data, rootNode.getRight()));
            }    
        }
    }

    public void inOrder() {
       inOrder(root);
    }

    private void inOrder(TreeNode<E> rootNode) {
        if (rootNode != null) {
            inOrder(rootNode.getLeft());
            System.out.println(rootNode.getData());
            inOrder(rootNode.getRight());
        }
    }
}
