/*
 * OperatorNode
 * Date: 5/4/2025
 * Basic operator node stores the value of an operator as a string
 * and has pointers to  nodes to the left and right ENodes. PBI but
 * implements getValue() method written by the Student.
 */

public class OperatorNode implements ENode {
    private String operator;
    private ENode left;
    private ENode right;

    public OperatorNode(String op) {
        operator = op;
        left = null;
        right = null;
    }


    public String getOperator() {
        return this.operator;
    }

    // public void setOperator(String operator) {
    //     this.operator = operator;
    // }

    public ENode getLeft() {
        return this.left;
    }

    public void setLeft(ENode left) {
        this.left = left;
    }

    public ENode getRight() {
        return this.right;
    }

    public void setRight(ENode right) {
        this.right = right;
    }

    // getValue method implemented for ENodes.
    // gets value of the left operand and the right operand
    // determines the operator used based on the operator attribute
    // then performs the correct mathematical operation based on the
    // required operator and returns this value.
    @Override
    public double getValue() {
        // Get value of the left
        double leftSide = left.getValue();
        // get value of the right
        double rightSide = right.getValue();
        // perform associated opeartion according to operator
        switch (operator) {
            case "+" :
                return leftSide + rightSide;
            case "-" :
                return leftSide - rightSide;
            case "*" :
                return leftSide * rightSide;
            case "/" :
                return leftSide / rightSide;
            case "^" :
                return Math.pow(leftSide, rightSide);
            default :
                return 0;
        }
    }
}
