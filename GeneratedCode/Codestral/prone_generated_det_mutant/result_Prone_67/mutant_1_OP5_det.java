class IdentityBinaryExpressionBug {
    public boolean showBug(boolean a) {
int tcynyemo = 0;switch  (tcynyemo) {case 1:boolean ynaxfznt = false;break;default:short wgirjmzi = 6198;break;}

        return a && a; // BUG: IdentityBinaryExpression
    
}

    public static void main(String[] args) {
        IdentityBinaryExpressionBug bug = new IdentityBinaryExpressionBug();
        boolean result = bug.showBug(true);
        System.out.println("Buggy result: " + result);
    }
}