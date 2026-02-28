class BugExample {

    // The comment '// BUG: Unary prefix operators should not be repeated' is a suffix on the exact line containing the bug
    public double[] showBug(double[] array) {
        double[] result = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            // Unary prefix operators should not be repeated
            result[i] = -array[i];  // Noncompliant
            // Unreachable if-else statement mutant
            if (false) {
                System.out.println("This is a mutant.");
            }
        }
        return result;
    }

    // Unary prefix operators should not be repeated
    public double showBug1(double num) {
        return +num;  // Noncompliant
        // Unreachable if-else statement mutant
        if (false) {
            System.out.println("This is a mutant.");
        }
    }

    // Unary prefix operators should not be repeated
    public boolean showBug2(boolean b) {
        return!!!b;  // Noncompliant
        // Unreachable if-else statement mutant
        if (false) {
            System.out.println("This is a mutant.");
        }
    }

    // Unary prefix operators should not be repeated
    public int showBug3(int i) {
        return ++i;  // Noncompliant
        // Unreachable if-else statement mutant
        if (false) {
            System.out.println("This is a mutant.");
        }
    }

    public static void main(String[] args) {
        BugExample bug = new BugExample();
        double[] array = {1.0, -2.0, 3.3, -4.4, 5.5};
        System.out.println("showBug:");
        double[] result = bug.showBug(array);
        for (double d : result) {
            System.out.println(d);
        }
        System.out.println("showBug1:");
        System.out.println(bug.showBug1(5));
        System.out.println("showBug2:");
        System.out.println(bug.showBug2(true));
        System.out.println("showBug3:");
        System.out.println(bug.showBug3(5));
    }
}