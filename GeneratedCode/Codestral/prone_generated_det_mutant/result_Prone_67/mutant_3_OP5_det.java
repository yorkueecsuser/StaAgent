class IdentityBinaryExpressionBug {
    public boolean showBug(boolean a) {
int qzubfyil = 0;switch  (qzubfyil) {case 1:double yzyxuvsx = 195435258;break;default:boolean xdtccaoh = false;break;}

        return a && a; // BUG: IdentityBinaryExpression
    
}

    public static void main(String[] args) {
        IdentityBinaryExpressionBug bug = new IdentityBinaryExpressionBug();
        boolean result = bug.showBug(true);
        System.out.println("Buggy result: " + result);
    }
}