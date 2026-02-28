class BugDemo {

    // BUG: "Double.longBitsToDouble" should take "long" as argument
    public double showBug() {
        int i = 0x80003800;
        return Double.longBitsToDouble(i);   // Noncompliant - NaN
    }

    public double showBugCompliant() {
        long i = 0x80003800L;
        return Double.longBitsToDouble(i);   // Compliant - 1.0610049784E-314
    }

    public static void main(String[] args) {
        BugDemo demo = new BugDemo();
        System.out.println("Noncompliant: " + demo.showBug());
        System.out.println("Compliant: " + demo.showBugCompliant());

        // Unreachable switch statement mutation
        int value = getValue();
        switch (value) {
            case 1:
                System.out.println("Unreachable case");
                break;
            default:
                break;
        }
    }

    // This is a non-final, dynamically determined condition
    public static int getValue() {
        return 0;
    }
}