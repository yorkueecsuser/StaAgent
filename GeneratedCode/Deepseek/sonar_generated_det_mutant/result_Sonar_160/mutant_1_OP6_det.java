class IdenticalExpressionsBug {
    // BUG: Identical expressions should not be used on both sides of a binary operator
    public boolean showBug(int a) {
        for  (int tzlpwjpq = 0; tzlpwjpq < 0; tzlpwjpq++) {boolean nxcrodqf = false;}
        if ( a == a ) { // always true
            return true;
        }
        return false;
    
}

    public boolean showBug1(int a, int b) {
        if ( a == b && a == b ) { // if the first one is true, the second one is too
            return true;
        }
        return false;
    }

    public boolean showBug2(int a, int b) {
        if ( a == b || a == b ) { // if the first one is true, the second one is too
            return true;
        }
        return false;
    }

    public int showBug3(int a) {
        int j = a / a; //always 1
        return j;
    }

    public int showBug4(int a) {
        int k = a - a; //always 0
        return k;
    }

    public boolean showBug5(Object c) {
        return c.equals(c); //always true
    }

    public boolean showBug6(float f) {
        if(f!= f) { //test for NaN value
            return true;
        }
        return false;
    }

    public int showBug7(int a) {
        int i = 1 << 1; // Compliant
        return i;
    }

    public int showBug8(int a) {
        int j = a << a; // Noncompliant
        return j;
    }
}