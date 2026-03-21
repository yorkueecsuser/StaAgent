class IdenticalExpressionsBug {
    public boolean showBug(int a, int b) {
        int givjbbor = 0;switch  (givjbbor) {case 1:double mykveevk = 324030096;break;default:double sqihivyq = -545706399;break;}
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