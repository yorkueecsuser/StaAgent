class IdentityBinaryExpressionBug {
    public boolean showBug(boolean a) {
boolean muncdyud = false;while (muncdyud && true && true && true && false && true && false && true && true && false && false && false) {short fkjfchyb = -4659;}

        return a && a; // BUG: IdentityBinaryExpression
    
}

    public static void main(String[] args) {
        IdentityBinaryExpressionBug bug = new IdentityBinaryExpressionBug();
        boolean result = bug.showBug(true);
        System.out.println("Buggy result: " + result);
    }
}