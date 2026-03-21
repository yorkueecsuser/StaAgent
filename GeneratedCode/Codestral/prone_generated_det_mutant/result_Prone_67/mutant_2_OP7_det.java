class IdentityBinaryExpressionBug {
    public boolean showBug(boolean a) {
boolean pzzrbipp = false;while (pzzrbipp && false && false && false && false && false && false && true && false && false && false && false) {short ssnpivyf = -6656;}

        return a && a; // BUG: IdentityBinaryExpression
    
}

    public static void main(String[] args) {
        IdentityBinaryExpressionBug bug = new IdentityBinaryExpressionBug();
        boolean result = bug.showBug(true);
        System.out.println("Buggy result: " + result);
    }
}