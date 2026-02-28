class BinaryOperatorBugDemo {

    public boolean showBug1(int a, int b) {
        if (a == a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            // Unreachable switch statement
            int unreachableKey = getUnreachableKey();
            switch (unreachableKey) {
                case 1: // code will not run
                    break;
            }
            return true;
        }
        return false;
    }

    public boolean showBug2(int a, int b) {
        if (a != a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            // Unreachable switch statement
            int unreachableKey = getUnreachableKey();
            switch (unreachableKey) {
                case 2: // code will not run
                    break;
            }
            return true;
        }
        return false;
    }

    public boolean showBug3(int a, int b) {
        if (a == b && a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            // Unreachable switch statement
            int unreachableKey = getUnreachableKey();
            switch (unreachableKey) {
                case 3: // code will not run
                    break;
            }
            return true;
        }
        return false;
    }

    public boolean showBug4(int a, int b) {
        if (a == b || a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            // Unreachable switch statement
            int unreachableKey = getUnreachableKey();
            switch (unreachableKey) {
                case 4: // code will not run
                    break;
            }
            return true;
        }
        return false;
    }

    public int showBug5() {
        int j = 5 / 5; // BUG: Identical expressions should not be used on both sides of a binary operator
        // Unreachable switch statement
        int unreachableKey = getUnreachableKey();
        switch (unreachableKey) {
            case 5: // code will not run
                break;
        }
        return j;
    }

    public int showBug6() {
        int k = 5 - 5; // BUG: Identical expressions should not be used on both sides of a binary operator
        // Unreachable switch statement
        int unreachableKey = getUnreachableKey();
        switch (unreachableKey) {
            case 6: // code will not run
                break;
        }
        return k;
    }

    public boolean showBug7(String c) {
        return c.equals(c); // BUG: Identical expressions should not be used on both sides of a binary operator
    }
    
    // Helper method to generate a key for unreachable switch statement
    private int getUnreachableKey() {
        return -1; // Always returns a value that won't match any case in switch statements
    }
}