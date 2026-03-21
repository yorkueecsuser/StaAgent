class IdentityBinaryExpressionBug {
    public boolean showBug(boolean a) {
if (true && false && true && true && false && true && false && false && true && true && false) {char npsutjay = 'x';}

        return a && a; // BUG: IdentityBinaryExpression
    
}

    public static void main(String[] args) {
        IdentityBinaryExpressionBug bug = new IdentityBinaryExpressionBug();
        boolean result = bug.showBug(true);
        System.out.println("Buggy result: " + result);
    }
}