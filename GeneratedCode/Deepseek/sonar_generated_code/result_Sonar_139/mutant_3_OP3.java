class BugDemo {

    public double showBug() {
        int i = 0x80003800;
        if (false) {
            i = 0x80003800;
        }
        return Double.longBitsToDouble(i);
    }

    public double showBugCompliant() {
        long i = 0x80003800L;
        return Double.longBitsToDouble(i);
    }

    public static void main(String[] args) {
        BugDemo demo = new BugDemo();
        System.out.println("Noncompliant: " + demo.showBug());
        System.out.println("Compliant: " + demo.showBugCompliant());
    }
}