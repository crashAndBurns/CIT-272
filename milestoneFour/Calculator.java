/*
 * Date: 5/4/2025
 * Calcuator class
 * This is where the bulk of the calculations and processing of input
 * takes place. This class implements the Shunting Yard Algorithm as
 * outlined by the instructor and implemented by the student. Will build
 * an expression tree and compute the value of the root node by using
 * simple order of operations. For this calculator we used PEMDAS order
 * of operations from  Left To Right.
 */

public class Calculator {
    // Class contains no attributes
    // class contains no getter/setters
    
    // Boolean function isNUmber() takes a string as a parameter
    // and returns true if the string can be converted to a double
    // returns false if the string can not be converted to a double.
    // used to see if a string represents a number.
    public boolean isNumber(String n) {
        // use try-catch to parse  a double, return false if 
        // unable to parse a double. Return false if string is
        // empty, or string is null.
        if (n == null || n.isEmpty()) {
            return false;
        } 
        try {
            Double.parseDouble(n);
            return (true);
        } catch (NumberFormatException e) {
            return (false); 
        }
    }

    // Boolean isOperator() function. Takes a string as a parameter
    // and determines if that string is one of five mathematical operators.
    // +, -, *, /, or ^
    public boolean isOperator(String e) {
        return (e.equals("+") || e.equals("-") || e.equals("*") ||
                e.equals("/") || e.equals("^"));
    }

    // Boolean isValidExpression function. Takes an array of strings
    // as a parameter and returns true if the expression is a valid
    // mathematical expression and false if it is not.
    public boolean isValidExpression(String[] expression) {
        if (expression == null || expression.length == 0) {
            return false;
        }
        
        boolean expectOperand = true;
        for (String e: expression) {
            if (expectOperand) {
                if(!isNumber(e)) {
                    return false;
                }
                expectOperand = false;
            } else {
                if (!isOperator(e)) {
                    return false;
                }
                expectOperand = true;
            }
        }
        return !expectOperand;
    }

    //  priority function used to determine priority of operators
    // takes an operator as parameter and returns an integer for the
    // priority. ^ = 3, / and * = 2, + and - = 1, defaults to -1 Note:
    // the default case should never be reachable as we have done
    // input validation.
    private int priority(String operator) {
        switch (operator) {
            case "+" :
                return 1;
            case "-" :
                return 1;
            case "*" :
                return 2;
            case "/" :
                return 2;
            case "^" :
                return 3;
            default :
                return -1;          
        }
    }

    // Evaluate expression function takes a string array as a parameter
    // and returns the value of the root ENode.
    public double evaluate(String[] expr) {
        // Build the expression tree (return root  Enode)
        buildExpressionTree(expr);
        // return the value of the root ENode

        return (buildExpressionTree(expr).getValue());
    }

    private ENode buildExpressionTree(String[] expr) {
        // Shunting Yard Algorithm. Outline Provided By Instructor
        // and implemented by student.

        // create two stacks OperandStack(ENodes) and OperatorStack(Strings)
        Stack <ENode> operandStack = new Stack<>();
        Stack <String> operatorStack = new Stack<>();

        // First Loop - For each token in the array, create
        // 1. if token is operand, create new NumberNode
        //    with operand as it's data. Push  this onto operand stack.
        for (String token : expr) {
            if (isNumber(token)) {
                double number = Double.parseDouble(token);
                NumberNode newNumNode = new NumberNode(number);
                operandStack.push(newNumNode);
            } else {
                // 2. if token is an operator
                //  a) if operator stack is empty push the operator 
                //     string onto the stack.
                if (operatorStack.isEmpty()) {
                    operatorStack.push(token);
                } else {
                    // b) compare priority of token to 
                    //    priority of the stack top
                    // i) if stack has lower priority than token,
                    //    push it onto  operator stack.
                    if (priority(operatorStack.peek()) < priority(token)) {
                        operatorStack.push(token);
                    } else {
                        // ii) loop until top of stack has lower priority
                        while (!operatorStack.isEmpty() && priority(operatorStack.peek()) >= priority(token)) {
                            // A) pop the top operator and create a new OperatorNode
                            //    with that top operator as its data.
                            OperatorNode newOperatorNode = new OperatorNode(operatorStack.pop());
                            // B) pop the top two operands and set them
                            //    as left and right for the new
                            //    operator node. (first is right, second is left)
                            newOperatorNode.setRight(operandStack.pop());
                            newOperatorNode.setLeft(operandStack.pop());
                            // C) Push that operator node to the operand stack
                            operandStack.push(newOperatorNode);
                        }
                        // E) Push new operator onto the operator stack
                        operatorStack.push(token);
                    }
                }
            }
        }

        // Second Loop
        // While operator stack is not empty
        while (!operatorStack.isEmpty()) {
            // 1. Pop top operator, create an operator node
            OperatorNode operatorNode = new OperatorNode(operatorStack.pop());
            // 2. Pop top two operands and set them as left and right for new operator node
            operatorNode.setRight(operandStack.pop());
            operatorNode.setLeft(operandStack.pop());
            // 3.  Push t his operator node onto operand  stack
            operandStack.push(operatorNode);
        }
        // When second loop is finished pop the operand stack and return
        // this node. It will be the rood node of the expression tree
        // for the final step

        return (operandStack.pop());
    }
}