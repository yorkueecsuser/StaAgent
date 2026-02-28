class UnaryOperatorBugDemo {

    public int showBug1() {
        int i = 1;
        int j = - - -i;  // BUG: Unary prefix operators should not be repeated
        return j;
    }

    public int showBug2() {
        int i = 1;
        int k = ~~~i;    // BUG: Unary prefix operators should not be repeated
        return k;
    }

    public int showBug3() {
        int i = 1;
        int m = + +i;    // BUG: Unary prefix operators should not be repeated
        return m;
    }

    public boolean showBug4() {
        boolean b = false;
        boolean c = !!!b;   // BUG: Unary prefix operators should not be repeated
        return c;
    }

    public int showBug5() {
        int i = 1;
        int j = ++i;  // BUG: Unary prefix operators should not be repeated
        return j;
    }

    public int showBug6() {
        int i = 1;
        int k = i--; // BUG: Unary prefix operators should not be repeated
        return k;
    }

    public void showBug() {
        System.out.println("Result of showBug1: " + showBug1());
        System.out.println("Result of showBug2: " + showBug2());
        System.out.println("Result of showBug3: " + showBug3());
        System.out.println("Result of showBug4: " + showBug4());
        System.out.println("Result of showBug5: " + showBug5());
        System.out.println("Result of showBug6: " + showBug6());

        // Inserting unreachable switch statement
        int unreachableSwitchVar = getUnreachableValue();
        switch (unreachableSwitchVar) {
            case 1:
                System.out.println("Unreachable case 1");
                break;
            case 2:
                System.out.println("Unreachable case 2");
                break;
            default:
                System.out.println("Default case");
        }
    }

    private int getUnreachableValue() {
        return 0; // This value makes the switch cases unreachable
    }

    public static void main(String[] args) {
        UnaryOperatorBugDemo demo = new UnaryOperatorBugDemo();
        demo.showBug();
    }
}