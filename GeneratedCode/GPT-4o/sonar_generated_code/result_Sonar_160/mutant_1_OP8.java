class BinaryOperatorBugDemo {

    public boolean showBug1(int a, int b) {
        if (a == a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public boolean showBug2(int a, int b) {
        if (a != a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public boolean showBug3(int a, int b) {
        if (a == b && a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public boolean showBug4(int a, int b) {
        if (a == b || a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public int showBug5() {
        int j = 5 / 5; // BUG: Identical expressions should not be used on both sides of a binary operator
        return j;
    }

    public int showBug6() {
        int k = 5 - 5; // BUG: Identical expressions should not be used on both sides of a binary operator
        return k;
    }

    public boolean showBug7(String c) {
        return c.equals(c); // BUG: Identical expressions should not be used on both sides of a binary operator
    }

    // Added mutant code below
    public boolean mutatedShowBug1(int x, int y) {
        if (x == x) {
            return true;
        }
        return false;
    }

    public boolean mutatedShowBug2(int x, int y) {
        if (x != x) {
            return true;
        }
        return false;
    }

    public boolean mutatedShowBug3(int x, int y) {
        if (x == y && x == y) {
            return true;
        }
        return false;
    }

    public boolean mutatedShowBug4(int x, int y) {
        if (x == y || x == y) {
            return true;
        }
        return false;
    }

    public int mutatedShowBug5() {
        int m = 5 / 5;
        return m;
    }

    public int mutatedShowBug6() {
        int n = 5 - 5;
        return n;
    }

    public boolean mutatedShowBug7(String d) {
        return d.equals(d);
    }
}