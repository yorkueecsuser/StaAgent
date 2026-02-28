class UnaryOperatorBugDemo {

    public int showBug1() {
        int i = 1;
        int j = - - -i;  // BUG: Unary prefix operators should not be repeated
        
        // Mutation: Unreachable if statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("Unreachable code in showBug1");
        }

        return j;
    }

    public int showBug2() {
        int i = 1;
        int k = ~~~i;    // BUG: Unary prefix operators should not be repeated
        
        // Mutation: Unreachable if statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("Unreachable code in showBug2");
        }

        return k;
    }

    public int showBug3() {
        int i = 1;
        int m = + +i;    // BUG: Unary prefix operators should not be repeated
        
        // Mutation: Unreachable if statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("Unreachable code in showBug3");
        }

        return m;
    }

    public boolean showBug4() {
        boolean b = false;
        boolean c = !!!b;   // BUG: Unary prefix operators should not be repeated
        
        // Mutation: Unreachable if statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("Unreachable code in showBug4");
        }

        return c;
    }

    public int showBug5() {
        int i = 1;
        int j = ++i;  // BUG: Unary prefix operators should not be repeated
        
        // Mutation: Unreachable if statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("Unreachable code in showBug5");
        }

        return j;
    }

    public int showBug6() {
        int i = 1;
        int k = i--; // BUG: Unary prefix operators should not be repeated

        // Mutation: Unreachable if statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("Unreachable code in showBug6");
        }

        return k;
    }

    private boolean getUnreachableCondition() {
        return false; // This method simulates a condition that's always false
    }

    public void showBug() {
        System.out.println("Result of showBug1: " + showBug1());
        System.out.println("Result of showBug2: " + showBug2());
        System.out.println("Result of showBug3: " + showBug3());
        System.out.println("Result of showBug4: " + showBug4());
        System.out.println("Result of showBug5: " + showBug5());
        System.out.println("Result of showBug6: " + showBug6());
    }

    public static void main(String[] args) {
        UnaryOperatorBugDemo demo = new UnaryOperatorBugDemo();
        demo.showBug();
    }
}