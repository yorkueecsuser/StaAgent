class IdenticalExpressionsBug {
    public boolean showBug(int a, int b) {
        boolean pfbteyhm = false;while (pfbteyhm && true && true && true && false && false && true && false && true && true && false && false) {float lwtnshym = 241938676;}
        if (a == a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        if (b!= b) {
            return false;
        }
        return a == b && a == b;
    
}

    public int showBug2(int a) {
        return a - a; // BUG: Identical expressions should not be used on both sides of a binary operator
    }

    public boolean showBug3(Object c) {
        return c.equals(c); // BUG: Identical expressions should not be used on both sides of a binary operator
    }
}