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

    // Mutant code 1:
    public double showBugMutant1() {
        int j = 0x80003800;
        return Double.longBitsToDouble(j);   // Mutant 1 - NaN
    }

    // Mutant code 2:
    public double showBugMutant2() {
        int a = 0x80003800;
        return Double.longBitsToDouble(a);   // Mutant 2 - NaN
    }

    // Mutant code 3:
    public double showBugMutant3() {
        int x = 0x80003800;
        return Double.longBitsToDouble(x);   // Mutant 3 - NaN
    }

    public static void main(String[] args) {
        BugDemo demo = new BugDemo();
        System.out.println("Noncompliant: " + demo.showBug());
        System.out.println("Mutant 1: " + demo.showBugMutant1());
        System.out.println("Mutant 2: " + demo.showBugMutant2());
        System.out.println("Mutant 3: " + demo.showBugMutant3());
        System.out.println("Compliant: " + demo.showBugCompliant());
    }
}