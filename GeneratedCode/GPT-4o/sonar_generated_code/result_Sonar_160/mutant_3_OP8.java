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

    // Mutant 1: Renaming a variable in showBug1
    public boolean showBug1_mutant1(int x, int y) {
        if (x == x) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    // Mutant 2: Renaming a variable in showBug2
    public boolean showBug2_mutant2(int x, int y) {
        if (x != x) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    // Mutant 3: Renaming a variable in showBug3
    public boolean showBug3_mutant3(int x, int y) {
        if (x == y && x == y) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    // Mutant 4: Renaming a variable in showBug4
    public boolean showBug4_mutant4(int x, int y) {
        if (x == y || x == y) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
    }

    // Mutant 5: Renaming a variable in showBug5
    public int showBug5_mutant5() {
        int x = 5 / 5; // BUG: Identical expressions should not be used on both sides of a binary operator
        return x;
    }

    // Mutant 6: Renaming a variable in showBug6
    public int showBug6_mutant6() {
        int x = 5 - 5; // BUG: Identical expressions should not be used on both sides of a binary operator
        return x;
    }

    // Mutant 7: Renaming a variable in showBug7
    public boolean showBug7_mutant7(String x) {
        return x.equals(x); // BUG: Identical expressions should not be used on both sides of a binary operator
    }
}