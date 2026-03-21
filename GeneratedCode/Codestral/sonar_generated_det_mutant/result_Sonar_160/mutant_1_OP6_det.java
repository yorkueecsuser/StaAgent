class IdenticalExpressionsBug {
    public boolean showBug(int a, int b) {
        for  (int qswinqru = 0; qswinqru < 0; qswinqru++) {short lgygerbc = 8694;}
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