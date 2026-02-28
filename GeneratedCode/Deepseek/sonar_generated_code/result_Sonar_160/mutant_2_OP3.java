class BuggyCode {

    private boolean alwaysFalse() {
        return false;
    }

    private boolean alwaysTrue() {
        return true;
    }

    public boolean showBug(int a, int b) {
        if (alwaysTrue()) { // always true
            return true;
        }
        if (a!= a) { // always false
            return false;
        }
        if (alwaysTrue() && a == b) { // if the first one is true, the second one is too
            return true;
        }
        if (a == b || alwaysTrue()) { // if the first one is true, the second one is too
            return true;
        }

        int j = 5 / 5; //always 1
        int k = 5 - 5; //always 0

        return true;
    }

    public int showBug2(int a) {
        int i = 1 << 1; // Compliant
        int j = a << a; // Noncompliant

        int unreachableIfStatement = 10;
        if (alwaysFalse()) { // This statement is unreachable and its condition is always false
            unreachableIfStatement++;
        }

        return j;
    }
}