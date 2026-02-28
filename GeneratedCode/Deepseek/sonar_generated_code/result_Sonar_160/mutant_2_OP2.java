class BuggyCode {

    public boolean showBug(int a, int b) {
        if (a == a) { // always true
            return true;
        }
        if (a == a) { // duplicate of the first if statement
            return true;
        }
        if (a!= a) { // always false
            return false;
        }
        if (a!= a) { // duplicate of the third if statement
            return false;
        }
        if (a == b && a == b) { // if the first one is true, the second one is too
            return true;
        }
        if (a == b && a == b) { // duplicate of the fifth if statement
            return true;
        }
        if (a == b || a == b) { // if the first one is true, the second one is too
            return true;
        }
        if (a == b || a == b) { // duplicate of the seventh if statement
            return true;
        }

        int j = 5 / 5; //always 1
        int k = 5 - 5; //always 0

        return true;
    }

    public int showBug2(int a) {
        int i = 1 << 1; // Compliant
        int j = a << a; // Noncompliant

        return j;
    }
}