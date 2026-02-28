class BuggyCode {

    public boolean showBug(int x, int y) {
        if (x == x) { // always true
            return true;
        }
        if (x!= x) { // always false
            return false;
        }
        if (x == y && x == y) { // if the first one is true, the second one is too
            return true;
        }
        if (x == y || x == y) { // if the first one is true, the second one is too
            return true;
        }

        int j = 5 / 5; //always 1
        int k = 5 - 5; //always 0

        return true;
    }

    public int showBug2(int m) {
        int i = 1 << 1; // Compliant
        int n = m << m; // Noncompliant

        return n;
    }
}