public class Calculator {
    // Class contains no attributes
    // class contains no getter/setters
    // class contains three methods
    //// isOperator(), isNumber(),  isValidExpression()
    
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

    public boolean isOperator(String e) {
        return (e.equals("+") || e.equals("-") || e.equals("*") ||
                e.equals("/") || e.equals("^"));
    }

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
}