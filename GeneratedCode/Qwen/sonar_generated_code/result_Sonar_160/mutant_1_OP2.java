class IdenticalExpressionsBug {

    public boolean showBug1(int a) {
        if (a == a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
        // Mutant
        boolean result = (a == a);
        return result;
    }

    public boolean showBug2(int a) {
        if (a!= a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
        // Mutant
        boolean result = (a!= a);
        return result;
    }

    public boolean showBug3(int a, int b) {
        if (a == b && a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
        // Mutant
        boolean result = (a == b && a == b);
        return result;
    }

    public boolean showBug4(int a, int b) {
        if (a == b || a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            return true;
        }
        return false;
        // Mutant
        boolean result = (a == b || a == b);
        return result;
    }

    public int showBug5(int a) {
        int j = a / a; // BUG: Identical expressions should not be used on both sides of a binary operator
        return j;
        // Mutant
        int temp = a / a;
        return temp;
    }

    public int showBug6(int a) {
        int k = a - a; // BUG: Identical expressions should not be used on both sides of a binary operator
        return k;
        // Mutant
        int temp = a - a;
        return temp;
    }

    public boolean showBug7(Object c) {
        return c.equals(c); // BUG: Identical expressions should not be used on both sides of a binary operator
        // No mutant added as per the mutation operator description (no assignment without method invocation)
    }

    public int showBug8(int a) {
        int j = a << a; // BUG: Identical expressions should not be used on both sides of a binary operator
        return j;
        // Mutant
        int temp = a << a;
        return temp;
    }
}