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

    // Mutant code
    public boolean mutant1(int a, int b) {
        int x = a; // Renamed 'a' to 'x'
        int y = b; // Renamed 'b' to 'y'
        if (x == x) { 
            return true;
        }
        return false;
    }

    public boolean mutant2(int m, int n) { // Renamed 'a' to 'm', 'b' to 'n'
        if (m != m) { 
            return true;
        }
        return false;
    }

    public boolean mutant3(int p, int q) { // Renamed 'a' to 'p', 'b' to 'q'
        if (p == q && p == q) { 
            return true;
        }
        return false;
    }

    public boolean mutant4(int u, int v) { // Renamed 'a' to 'u', 'b' to 'v'
        if (u == v || u == v) { 
            return true;
        }
        return false;
    }

    public int mutant5() {
        int l = 5 / 5; // Renamed 'j' to 'l'
        return l;
    }

    public int mutant6() {
        int m = 5 - 5; // Renamed 'k' to 'm'
        return m;
    }

    public boolean mutant7(String s) { // Renamed 'c' to 's'
        return s.equals(s); 
    }
}