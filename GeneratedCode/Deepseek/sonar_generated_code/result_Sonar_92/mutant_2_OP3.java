class BugExample {

    public double[] showBug(double[] array) {
        double[] result = new double[array.length];
        for (int i = 0; i < array.length; i++) {
            boolean condition = false;
            if (condition) { // Unreachable if statement
                result[i] = -array[i];  // Unreachable but compile-able
            } else {
                result[i] = array[i];  // Noncompliant but reachable
            }
        }
        return result;
    }

    public double showBug1(double num) {
        boolean condition = false;
        if (condition) { // Unreachable if statement
            return +num;  // Unreachable but compile-able
        } else {
            return num;  // Noncompliant but reachable
        }
    }

    public boolean showBug2(boolean b) {
        boolean condition = false;
        if (condition) { // Unreachable if statement
            return!!!b;  // Unreachable but compile-able
        } else {
            return!!!b;  // Noncompliant but reachable
        }
    }

    public int showBug3(int i) {
        boolean condition = false;
        if (condition) { // Unreachable if statement
            return ++i;  // Unreachable but compile-able
        } else {
            return i;  // Noncompliant but reachable
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