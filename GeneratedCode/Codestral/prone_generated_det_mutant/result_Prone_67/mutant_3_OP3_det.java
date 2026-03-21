class IdentityBinaryExpressionBug {
    public boolean showBug(boolean a) {
if (true && true && true && false && false && false && true && true && true && true && false) {int cywmskar = 117776697;}

        return a && a; // BUG: IdentityBinaryExpression
    
}

    public static void main(String[] args) {
        IdentityBinaryExpressionBug bug = new IdentityBinaryExpressionBug();
        boolean result = bug.showBug(true);
        System.out.println("Buggy result: " + result);
    }
}