public class TreeNode<E>{
    private E data;
    private TreeNode<E> left;
    private TreeNode<E> right;

    public TreeNode() {
        data = null;
        left = null;
        right = null;
    }

    public TreeNode(E data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public E getData() {
        return this.data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public TreeNode<E> getLeft() {
        return this.left;
    }

    public void setLeft(TreeNode<E> next) {
        this.left = next;
    }


    public TreeNode<E> getRight() {
        return this.right;
    }

    public void setRight(TreeNode<E> right) {
        this.right = right;
    }
}
