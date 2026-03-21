class IdentityBinaryExpressionBug {
    public boolean showBug(boolean a) {
        return a && a; // BUG: IdentityBinaryExpression
    }

    public static void main(String[] args) {
        IdentityBinaryExpressionBug bug = new IdentityBinaryExpressionBug();
        boolean qoyjbgty = bug.showBug(true);
        System.out.println("Buggy qoyjbgty: " + qoyjbgty);
    }
}