class BugDemo {

    public double showBug() {
        int i = 0x80003800;
        return Double.longBitsToDouble(i);   // Noncompliant - NaN
    }

    public double showBugCompliant() {
        long i = 0x80003800L;
        return Double.longBitsToDouble(i);   // Compliant - 1.0610049784E-314
    }

    public void unreachableSwitchStatementMutant() {
        boolean condition = false;
        switch (condition? 1 : 0) {
            case 1:
                break;
            case 0:
                break;
            default:
                break;
        }
    }

    public static void main(String[] args) {
        BugDemo demo = new BugDemo();
        System.out.println("Noncompliant: " + demo.showBug());
        System.out.println("Compliant: " + demo.showBugCompliant());
        demo.unreachableSwitchStatementMutant();
    }
}