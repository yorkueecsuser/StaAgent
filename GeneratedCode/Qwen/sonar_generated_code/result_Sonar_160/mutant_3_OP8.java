class IdenticalExpressionsBug {

    public boolean showBug1(int a) {
        if (a == a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public boolean showBug1Mutant(int x) {
        if (x == x) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public boolean showBug2(int a) {
        if (a!= a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public boolean showBug2Mutant(int y) {
        if (y!= y) { // BUG: Identical expressions should not be used on both sides of a binary operator
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

    public boolean showBug3Mutant(int c, int d) {
        if (c == d && c == d) { // BUG: Identical expressions should not be used on both sides of a binary operator
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

    public boolean showBug4Mutant(int e, int f) {
        if (e == f || e == f) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    public int showBug5(int a) {
        int j = a / a; // BUG: Identical expressions should not be used on both sides of a binary operator
        return j;
    }

    public int showBug5Mutant(int g) {
        int m = g / g; // BUG: Identical expressions should not be used on both sides of a binary operator
        return m;
    }

    public int showBug6(int a) {
        int k = a - a; // BUG: Identical expressions should not be used on both sides of a binary operator
        return k;
    }

    public int showBug6Mutant(int h) {
        int n = h - h; // BUG: Identical expressions should not be used on both sides of a binary operator
        return n;
    }

    public boolean showBug7(Object c) {
        return c.equals(c); // BUG: Identical expressions should not be used on both sides of a binary operator
    }

    public boolean showBug7Mutant(Object i) {
        return i.equals(i); // BUG: Identical expressions should not be used on both sides of a binary operator
    }

    public int showBug8(int a) {
        int j = a << a; // BUG: Identical expressions should not be used on both sides of a binary operator
        return j;
    }

    public int showBug8Mutant(int l) {
        int o = l << l; // BUG: Identical expressions should not be used on both sides of a binary operator
        return o;
    }
}