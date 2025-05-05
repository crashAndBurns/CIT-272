public class BinaryTree<E extends Comparable<E>> {
    private TreeNode<E> root;

    // Constructor
    public BinaryTree() {
        root = null;
    }

    public void orderedInsert(E data) {
        if (root == null) {
            root = new TreeNode<>(data);
        } else {
            orderedInsert(data, root);
        }
    }

    // Insert a new node
    private void orderedInsert(E data, TreeNode<E> rootNode) {
        // if data is less than root node and
        // If left pointer is null
        // then insert left
        if (data.compareTo(rootNode.getData()) < 0) {
            // base case, the pointer to the left node is null
            if (rootNode.getLeft() == null) {
                rootNode.setLeft(new TreeNode<>(data));
            } else {
                // Keep looking recursively
                orderedInsert(data, rootNode.getLeft());
            } 
        } else {
            // if data is greater than rood node and
            // if right pointer is null
            // then insert right
            if (rootNode.getRight() == null) {
                rootNode.setRight(new TreeNode<>(data));
            } else {
                // keep looking recursively
                orderedInsert(data, rootNode.getRight());
            }
        }
    }

    // search function. Searches the tree for data supplied as a parameter.
    // returns true if the data is in the tree, returns false if it is not found.
    public boolean search(E data) {
        return(search(data, root));
    }

    // search function. Takes data and a node as paramenters.
    // Recursively searches the tree for the data and returns
    // true if it is in the tree or false if it is not found.
    public boolean search(E data, TreeNode<E> rootNode) {
        // if rootNode is empty then empty, return false
        if (rootNode == null) {
            return (false);
        } else {
            // if data is equal to node data then we stop and return true
            if (data.compareTo(rootNode.getData()) == 0) {
                return (true);
              // If data is less than root node traverse left
            } else if (data.compareTo(rootNode.getData()) < 0) {
                return(search(data, rootNode.getLeft())); 
              // if data is greater than root node traverse right
            } else {
                return(search(data, rootNode.getRight()));
            }
        }
    }

    // Print in order, calls printInOrder on the root node
    // allowing the use of System.out.println(root). Prints the 
    // whole tree in order.
    public void printInOrder() {
        printInOrder(root);
    }
    
    // Print in order function. Takes a rootNode (not necessescarily the root node)
    // recursively traverses to the left, gets the data from the node, then recursively 
    // traverses right. Prints the entire tree in order depending on the results of compareTo()
    // function. 
    private void printInOrder(TreeNode<E> rootNode) {
        if (rootNode != null) {
            printInOrder(rootNode.getLeft());
            System.out.println(rootNode.getData().toString());
            printInOrder(rootNode.getRight());
        }
    }

    // printPreOrder function starts with the root and prints the
    // left side of the tree first then prints the right side.
    public void printPreOrder() {
        printPreOrder(root);
    }

    // print preOrder function. Takes a root node (not necessecarily the root node)
    // as a parameter. Prints the data in the node, then traverses left. Will traverse
    // the entire left side until if finds a leaf node, then will traverse the right side
    // until it finds a leaf node.
    private void printPreOrder(TreeNode<E> rootNode) {
        if (rootNode != null) {
            // First deal with the node
            System.out.println(rootNode.getData().toString());

            // Then recur on left subtree
            printPreOrder(rootNode.getLeft());

            // Finally recur on right subtree
            printPreOrder(rootNode.getRight());
        }
    }

    public void printPostOrder() {
        printPostOrder(root);
    }

    private void printPostOrder(TreeNode<E> rootNode) {
        if (rootNode != null) {
            printPostOrder(rootNode.getLeft());
            printPostOrder(rootNode.getRight());
            System.out.println(rootNode.getData().toString());
        }
    }
}