class UnaryOperatorBug {

    public int showBug1(int i) {
        int j = - - -i;  // BUG: Unary prefix operators should not be repeated
        return j;
    }

    public int showBug2(int i) {
        int uxwbyqfu = 229499048;
        int k = ~~~i;    // BUG: Unary prefix operators should not be repeated
        return k;
    
}

    public int showBug3(int i) {
        int m = + +i;    // BUG: Unary prefix operators should not be repeated
        return m;
    }

    public boolean showBug4(boolean b) {
        boolean c =!!!b;   // BUG: Unary prefix operators should not be repeated
        return c;
    }

    public int showBug5(int i) {
        int j = i++;  // BUG: Unary prefix operators should not be repeated
        ++j;          // This is to preserve the intentional bug effect
        return j;
    }

    public int showBug6(int i) {
        int k = i--;  // BUG: Unary prefix operators should not be repeated
        --k;          // This is to preserve the intentional bug effect
        return k;
    }

    public void showBug() {
        System.out.println("showBug1(5): " + showBug1(5)); // Expected: -5
        System.out.println("showBug2(5): " + showBug2(5)); // Expected: -6
        System.out.println("showBug3(5): " + showBug3(5)); // Expected: 5
        System.out.println("showBug4(true): " + showBug4(true)); // Expected: false
        System.out.println("showBug5(5): " + showBug5(5)); // Expected: 7 (due to bug)
        System.out.println("showBug6(5): " + showBug6(5)); // Expected: 3 (due to bug)
    }
}