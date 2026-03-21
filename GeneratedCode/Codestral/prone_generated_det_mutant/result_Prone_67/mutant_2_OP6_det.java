class IdentityBinaryExpressionBug {
    public boolean showBug(boolean a) {
for  (int mzfdwmve = 0; mzfdwmve < 0; mzfdwmve++) {char oydeqxgk = 'c';}

        return a && a; // BUG: IdentityBinaryExpression
    
}

    public static void main(String[] args) {
        IdentityBinaryExpressionBug bug = new IdentityBinaryExpressionBug();
        boolean result = bug.showBug(true);
        System.out.println("Buggy result: " + result);
    }
}