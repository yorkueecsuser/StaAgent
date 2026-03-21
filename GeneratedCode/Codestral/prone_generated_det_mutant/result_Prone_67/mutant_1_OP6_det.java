class IdentityBinaryExpressionBug {
    public boolean showBug(boolean a) {
for  (int ifmsubym = 0; ifmsubym < 0; ifmsubym++) {double jjccmxgb = 662787444;}

        return a && a; // BUG: IdentityBinaryExpression
    
}

    public static void main(String[] args) {
        IdentityBinaryExpressionBug bug = new IdentityBinaryExpressionBug();
        boolean result = bug.showBug(true);
        System.out.println("Buggy result: " + result);
    }
}