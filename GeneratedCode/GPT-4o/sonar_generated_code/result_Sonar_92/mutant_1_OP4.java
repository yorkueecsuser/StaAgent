class UnaryOperatorBugDemo {

    public int showBug1() {
        int i = 1;
        int j = - - -i;  // BUG: Unary prefix operators should not be repeated
        
        // Unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            j = 0; // This block will never execute
        } else {
            j = j; // This block is always executed
        }
        
        return j;
    }

    public int showBug2() {
        int i = 1;
        int k = ~~~i;    // BUG: Unary prefix operators should not be repeated
        
        // Unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            k = 0; // This block will never execute
        } else {
            k = k; // This block is always executed
        }
        
        return k;
    }

    public int showBug3() {
        int i = 1;
        int m = + +i;    // BUG: Unary prefix operators should not be repeated
        
        // Unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            m = 0; // This block will never execute
        } else {
            m = m; // This block is always executed
        }
        
        return m;
    }

    public boolean showBug4() {
        boolean b = false;
        boolean c = !!!b;   // BUG: Unary prefix operators should not be repeated
        
        // Unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            c = true; // This block will never execute
        } else {
            c = c; // This block is always executed
        }
        
        return c;
    }

    public int showBug5() {
        int i = 1;
        int j = ++i;  // BUG: Unary prefix operators should not be repeated
        
        // Unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            j = 0; // This block will never execute
        } else {
            j = j; // This block is always executed
        }
        
        return j;
    }

    public int showBug6() {
        int i = 1;
        int k = i--; // BUG: Unary prefix operators should not be repeated
        
        // Unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            k = 0; // This block will never execute
        } else {
            k = k; // This block is always executed
        }
        
        return k;
    }

    public void showBug() {
        System.out.println("Result of showBug1: " + showBug1());
        System.out.println("Result of showBug2: " + showBug2());
        System.out.println("Result of showBug3: " + showBug3());
        System.out.println("Result of showBug4: " + showBug4());
        System.out.println("Result of showBug5: " + showBug5());
        System.out.println("Result of showBug6: " + showBug6());
    }

    private boolean getFalseCondition() {
        return false;
    }

    public static void main(String[] args) {
        UnaryOperatorBugDemo demo = new UnaryOperatorBugDemo();
        demo.showBug();
    }
}