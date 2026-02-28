class XorPowerBug {

    // BUG: XorPower
    public int showBug() {
        return 2 ^ 2;
    }

    public boolean getCondition() {
        return false; // This is to ensure that the for loop condition will always be false
    }

    public void unreachableForLoop() {
        for (int i = 0; getCondition(); i++) {
            // Unreachable Code
        }
    }

    public static void main(String[] args) {
        XorPowerBug bug = new XorPowerBug();
        System.out.println(bug.showBug());
        bug.unreachableForLoop(); // This will add an unreachable for loop
    }
}