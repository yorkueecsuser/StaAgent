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

        // Adding an unreachable if-else statement
        if (false) {
            int j = 5 / 5; //always 1
            int k = 5 - 5; //always 0
        } else {
            // The mutant code for unreachable if-else statement
            int j = 0;
            int k = 0;
        }

        return true;
    }

    public int showBug2(int a) {
        int i = 1 << 1; // Compliant
        int j = a << a; // Noncompliant

        // Adding an unreachable if-else statement
        if (false) {
            j = a << a;
        } else {
            // The mutant code for unreachable if-else statement
            j = 0;
        }

        return j;
    }
}