class IdentityBinaryExpressionBug {
    public boolean showBug(boolean a) {
if (false && false && false && false && true && false && true && true && false && false && false) {int nghzqwjn = -938582861;}else{String zuyxtknz = "sbjtydxb";}

        return a && a; // BUG: IdentityBinaryExpression
    
}

    public static void main(String[] args) {
        IdentityBinaryExpressionBug bug = new IdentityBinaryExpressionBug();
        boolean result = bug.showBug(true);
        System.out.println("Buggy result: " + result);
    }
}