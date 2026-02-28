class UnaryOperatorBugDemo {

    public int showBug1() {
        int i = 1;
        int j = - - -i;  // BUG: Unary prefix operators should not be repeated
        boolean conditionWhile1 = getCondition();
        while (conditionWhile1) {
            // Unreachable while loop
        }
        return j;
    }

    public int showBug2() {
        int i = 1;
        int k = ~~~i;    // BUG: Unary prefix operators should not be repeated
        boolean conditionWhile2 = getCondition();
        while (conditionWhile2) {
            // Unreachable while loop
        }
        return k;
    }

    public int showBug3() {
        int i = 1;
        int m = + +i;    // BUG: Unary prefix operators should not be repeated
        boolean conditionWhile3 = getCondition();
        while (conditionWhile3) {
            // Unreachable while loop
        }
        return m;
    }

    public boolean showBug4() {
        boolean b = false;
        boolean c = !!!b;   // BUG: Unary prefix operators should not be repeated
        boolean conditionWhile4 = getCondition();
        while (conditionWhile4) {
            // Unreachable while loop
        }
        return c;
    }

    public int showBug5() {
        int i = 1;
        int j = ++i;  // BUG: Unary prefix operators should not be repeated
        boolean conditionWhile5 = getCondition();
        while (conditionWhile5) {
            // Unreachable while loop
        }
        return j;
    }

    public int showBug6() {
        int i = 1;
        int k = i--; // BUG: Unary prefix operators should not be repeated
        boolean conditionWhile6 = getCondition();
        while (conditionWhile6) {
            // Unreachable while loop
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

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        UnaryOperatorBugDemo demo = new UnaryOperatorBugDemo();
        demo.showBug();
    }
}