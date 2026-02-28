class BugDemo {

    public double showBug() {
        int i = 0x80003800;
        for(boolean condition = true; condition;){
            System.out.println("Unreachable loop"); // Unreachable
        }
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
    }
}