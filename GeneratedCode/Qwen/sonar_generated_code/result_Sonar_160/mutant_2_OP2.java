class IdenticalExpressionsBug {

    public boolean showBug1(int a) {
        if (a == a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
        int temp1 = a; // Mutant: Duplicating assignment statement
    }

    public boolean showBug2(int a) {
        if (a!= a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
        int temp2 = a; // Mutant: Duplicating assignment statement
    }

    public boolean showBug3(int a, int b) {
        if (a == b && a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
        int temp3 = a; // Mutant: Duplicating assignment statement
    }

    public boolean showBug4(int a, int b) {
        if (a == b || a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
        int temp4 = b; // Mutant: Duplicating assignment statement
    }

    public int showBug5(int a) {
        int j = a / a; // BUG: Identical expressions should not be used on both sides of a binary operator
        return j;
        int temp5 = j; // Mutant: Duplicating assignment statement
    }

    public int showBug6(int a) {
        int k = a - a; // BUG: Identical expressions should not be used on both sides of a binary operator
        return k;
        int temp6 = k; // Mutant: Duplicating assignment statement
    }

    public boolean showBug7(Object c) {
        return c.equals(c); // BUG: Identical expressions should not be used on both sides of a binary operator
        Object temp7 = c; // Mutant: Duplicating assignment statement
    }

    public int showBug8(int a) {
        int j = a << a; // BUG: Identical expressions should not be used on both sides of a binary operator
        return j;
        int temp8 = j; // Mutant: Duplicating assignment statement
    }
}