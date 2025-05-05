/*
 * NumberNode
 * Date: 5/4/2025
 * A basic number node stores a value as a double and implements
 * the getValue method. Note: PBI
 */

public class NumberNode implements ENode{
    
    private double value;

    public NumberNode(double  num) {
        value = num;
    }

    @Override
    public double getValue() {
        return (value);
    }
}
