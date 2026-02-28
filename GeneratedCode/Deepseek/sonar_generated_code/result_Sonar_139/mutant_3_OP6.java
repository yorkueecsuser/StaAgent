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

    public void unreachableForLoop() {
        boolean conditionFor = false;
        for (int i = 0; conditionFor; i++) { /* code */ }
    }

    public static void main(String[] args) {
        BugDemo demo = new BugDemo();
        System.out.println("Noncompliant: " + demo.showBug());
        System.out.println("Compliant: " + demo.showBugCompliant());
        demo.unreachableForLoop();
    }
}