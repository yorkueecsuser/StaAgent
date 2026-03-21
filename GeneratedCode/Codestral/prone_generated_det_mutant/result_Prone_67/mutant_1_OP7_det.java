class IdentityBinaryExpressionBug {
    public boolean showBug(boolean a) {
boolean hycawxys = false;while (hycawxys && true && false && false && true && true && false && true && false && false && false && false) {double hpbjxpts = -356159975;}

        return a && a; // BUG: IdentityBinaryExpression
    
}

    public static void main(String[] args) {
        IdentityBinaryExpressionBug bug = new IdentityBinaryExpressionBug();
        boolean result = bug.showBug(true);
        System.out.println("Buggy result: " + result);
    }
}