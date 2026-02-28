class BuggyCode {

    public boolean showBug(int a, int b) {
        if (a == a) { // always true
            return true;
        }
        if (a!= a) { // always false
            return false;
        }
        if (a == b && a == b) { // if the first one is true, the second one is too
            return true;
        }
        if (a == b || a == b) { // if the first one is true, the second one is too
            return true;
        }

        int j = 5 / 5; //always 1
        int k = 5 - 5; //always 0

        // Add mutant for Unreachable if statement
        boolean neverHappens = getNeverHappens();
        if (neverHappens) {
            a = a + 1; // unreachable statement
        }

        return true;
    }

    public int showBug2(int a) {
        int i = 1 << 1; // Compliant
        int j = a << a; // Noncompliant

        // Add mutant for Unreachable if statement
        boolean neverHappens = getNeverHappens();
        if (neverHappens) {
            a = a + 1; // unreachable statement
        }

        return j;
    }

    // Method to create a neverHappens condition
    public boolean getNeverHappens() {
        return false;
    }
}