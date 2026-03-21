class IdentityBinaryExpressionBug {
    public boolean showBug(boolean a) {
if (false && false && true && true && false && true && true && false && true && false && false) {boolean ypofvtsl = false;}

        return a && a; // BUG: IdentityBinaryExpression
    
}

    public static void main(String[] args) {
        IdentityBinaryExpressionBug bug = new IdentityBinaryExpressionBug();
        boolean result = bug.showBug(true);
        System.out.println("Buggy result: " + result);
    }
}