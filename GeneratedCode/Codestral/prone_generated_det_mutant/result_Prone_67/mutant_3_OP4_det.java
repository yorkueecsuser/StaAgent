class IdentityBinaryExpressionBug {
    public boolean showBug(boolean a) {
if (true && false && false && false && true && false && false && true && true && false && false) {byte fnxzdtax = 115;}else{long lpyukqbt = -533635835;}

        return a && a; // BUG: IdentityBinaryExpression
    
}

    public static void main(String[] args) {
        IdentityBinaryExpressionBug bug = new IdentityBinaryExpressionBug();
        boolean result = bug.showBug(true);
        System.out.println("Buggy result: " + result);
    }
}