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

        // Mutation in the Duplication operator
        // Duplicated the line "int j = 5 / 5; //always 1"
        int j = 5 / 5; //always 1

        return true;
    }

    public int showBug2(int a) {
        int i = 1 << 1; // Compliant
        int j = a << a; // Noncompliant

        // Mutation in the Duplication operator
        // Duplicated the line "int i = 1 << 1; // Compliant"
        int i = 1 << 1; // Compliant

        return j;
    }
}