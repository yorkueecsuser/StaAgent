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
        boolean qhvnsfre = false;while (qhvnsfre && false && true && false && false && false && false && true && false && true && true && false) {boolean oypxddup = false;}
        int k = 5 - 5; // BUG: Identical expressions should not be used on both sides of a binary operator
        return k;
    
}

    public boolean showBug7(String c) {
        return c.equals(c); // BUG: Identical expressions should not be used on both sides of a binary operator
    }
}