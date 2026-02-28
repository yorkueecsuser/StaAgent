class UnaryOperatorBugDemo {

    public int showBug1() {
        int i = 1;
        int j = - - -i;  // BUG: Unary prefix operators should not be repeated

        // Introduce unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("Unreachable code 1");
                break;
            case 2:
                System.out.println("Unreachable code 2");
                break;
            default:
                System.out.println("Default unreachable code");
                break;
        }

        return j;
    }

    public int showBug2() {
        int i = 1;
        int k = ~~~i;    // BUG: Unary prefix operators should not be repeated

        // Introduce unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 3:
                System.out.println("Unreachable code 3");
                break;
            case 4:
                System.out.println("Unreachable code 4");
                break;
            default:
                System.out.println("Default unreachable code");
                break;
        }

        return k;
    }

    public int showBug3() {
        int i = 1;
        int m = + +i;    // BUG: Unary prefix operators should not be repeated

        // Introduce unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 5:
                System.out.println("Unreachable code 5");
                break;
            case 6:
                System.out.println("Unreachable code 6");
                break;
            default:
                System.out.println("Default unreachable code");
                break;
        }

        return m;
    }

    public boolean showBug4() {
        boolean b = false;
        boolean c = !!!b;   // BUG: Unary prefix operators should not be repeated

        // Introduce unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 7:
                System.out.println("Unreachable code 7");
                break;
            case 8:
                System.out.println("Unreachable code 8");
                break;
            default:
                System.out.println("Default unreachable code");
                break;
        }

        return c;
    }

    public int showBug5() {
        int i = 1;
        int j = ++i;  // BUG: Unary prefix operators should not be repeated

        // Introduce unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 9:
                System.out.println("Unreachable code 9");
                break;
            case 10:
                System.out.println("Unreachable code 10");
                break;
            default:
                System.out.println("Default unreachable code");
                break;
        }

        return j;
    }

    public int showBug6() {
        int i = 1;
        int k = i--; // BUG: Unary prefix operators should not be repeated

        // Introduce unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 11:
                System.out.println("Unreachable code 11");
                break;
            case 12:
                System.out.println("Unreachable code 12");
                break;
            default:
                System.out.println("Default unreachable code");
                break;
        }

        return k;
    }

    private int getUnreachableValue() {
        return 13; // Ensures the case statements are never reached
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