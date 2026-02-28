class XorPowerBug {

    // BUG: XorPower
    public int showBug() {
        return 2 ^ 2;
    }

    public static void main(String[] args) {
        XorPowerBug bug = new XorPowerBug();
        System.out.println(bug.showBug());
    }
}

// Mutated Java code
class XorPowerBugMutant {

    // BUG: XorPower
    public int showBug() {
        return 2 ^ 2;
    }

    public static void main(String[] args) {
        XorPowerBugMutant bug = new XorPowerBugMutant();
        System.out.println(bug.showBug());

        // Unreachable if-else statement mutation
        if (false) {
            System.out.println("This line of code will never be executed");
        } else {
            System.out.println("This line of code is unreachable and will never be executed");
        }
    }
}