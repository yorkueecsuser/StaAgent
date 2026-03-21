class IdentityBinaryExpressionBug {
    public boolean showBug(boolean a) {
for  (int swfaxkbh = 0; swfaxkbh < 0; swfaxkbh++) {float eeezjasf = -371469550;}

        return a && a; // BUG: IdentityBinaryExpression
    
}

    public static void main(String[] args) {
        IdentityBinaryExpressionBug bug = new IdentityBinaryExpressionBug();
        boolean result = bug.showBug(true);
        System.out.println("Buggy result: " + result);
    }
}