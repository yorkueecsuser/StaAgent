class IdentityBinaryExpressionBug {
    public boolean showBug(boolean a) {
int ihvkmgwd = 0;switch  (ihvkmgwd) {case 1:String vphcmcvj = "gdhkfepn";break;default:int rjziwsvl = -726559064;break;}

        return a && a; // BUG: IdentityBinaryExpression
    
}

    public static void main(String[] args) {
        IdentityBinaryExpressionBug bug = new IdentityBinaryExpressionBug();
        boolean result = bug.showBug(true);
        System.out.println("Buggy result: " + result);
    }
}