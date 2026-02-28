class UnaryOperatorBugDemo {

    public int showBug1() {
        int i = 1;
        int j = - - -i;  // BUG: Unary prefix operators should not be repeated
        // Introduce unreachable if-else statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This block is unreachable");
        } else {
            System.out.println("This block is also unreachable");
        }
        return j;
    }

    public int showBug2() {
        int i = 1;
        int k = ~~~i;    // BUG: Unary prefix operators should not be repeated
        // Introduce unreachable if-else statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This block is unreachable");
        } else {
            System.out.println("This block is also unreachable");
        }
        return k;
    }

    public int showBug3() {
        int i = 1;
        int m = + +i;    // BUG: Unary prefix operators should not be repeated
        // Introduce unreachable if-else statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This block is unreachable");
        } else {
            System.out.println("This block is also unreachable");
        }
        return m;
    }

    public boolean showBug4() {
        boolean b = false;
        boolean c = !!!b;   // BUG: Unary prefix operators should not be repeated
        // Introduce unreachable if-else statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This block is unreachable");
        } else {
            System.out.println("This block is also unreachable");
        }
        return c;
    }

    public int showBug5() {
        int i = 1;
        int j = ++i;  // BUG: Unary prefix operators should not be repeated
        // Introduce unreachable if-else statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This block is unreachable");
        } else {
            System.out.println("This block is also unreachable");
        }
        return j;
    }

    public int showBug6() {
        int i = 1;
        int k = i--; // BUG: Unary prefix operators should not be repeated
        // Introduce unreachable if-else statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This block is unreachable");
        } else {
            System.out.println("This block is also unreachable");
        }
        return k;
    }

    // Helper method to simulate an unreachable condition
    private boolean getUnreachableCondition() {
        return false;
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