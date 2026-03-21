class IdentityBinaryExpressionBug {
    public boolean showBug(boolean a) {
if (false && false && false && true && false && true && false && false && true && true && false) {short sjwwrbqh = 8971;}else{String ppokygol = "qnjcdbkv";}

        return a && a; // BUG: IdentityBinaryExpression
    
}

    public static void main(String[] args) {
        IdentityBinaryExpressionBug bug = new IdentityBinaryExpressionBug();
        boolean result = bug.showBug(true);
        System.out.println("Buggy result: " + result);
    }
}