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
        String deadStore1 = "abcdefgh"; // Dead Store
        int j = 5 / 5; //always 1
        int k = 5 - 5; //always 0

        return true;
    }

    public int showBug2(int a) {
        int i = 1 << 1; // Compliant
        String deadStore2 = "ijklmnop"; // Dead Store
        int j = a << a; // Noncompliant

        return j;
    }
}