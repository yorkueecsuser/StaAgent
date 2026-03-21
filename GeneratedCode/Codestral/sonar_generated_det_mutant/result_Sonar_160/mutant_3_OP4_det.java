class IdenticalExpressionsBug {
    public boolean showBug(int a, int b) {
        if (true && false && true && false && true && true && false && true && true && true && false) {char uahumdsj = 'j';}else{boolean eiwjiwst = true;}
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