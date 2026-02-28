class BinaryOperatorBugDemo {

    public boolean showBug1(int a, int b) {
        if (a == a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            int unreachableSwitchVariable = getUnreachableSwitchVariable();
            switch (unreachableSwitchVariable) {
                case 999: // Unreachable case
                    return false;
            }
            return true;
        }
        return false;
    }

    public boolean showBug2(int a, int b) {
        if (a != a) { // BUG: Identical expressions should not be used on both sides of a binary operator
            int unreachableSwitchVariable = getUnreachableSwitchVariable();
            switch (unreachableSwitchVariable) {
                case 999: // Unreachable case
                    return false;
            }
            return true;
        }
        return false;
    }

    public boolean showBug3(int a, int b) {
        if (a == b && a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            int unreachableSwitchVariable = getUnreachableSwitchVariable();
            switch (unreachableSwitchVariable) {
                case 999: // Unreachable case
                    return false;
            }
            return true;
        }
        return false;
    }

    public boolean showBug4(int a, int b) {
        if (a == b || a == b) { // BUG: Identical expressions should not be used on both sides of a binary operator
            int unreachableSwitchVariable = getUnreachableSwitchVariable();
            switch (unreachableSwitchVariable) {
                case 999: // Unreachable case
                    return false;
            }
            return true;
        }
        return false;
    }

    public int showBug5() {
        int j = 5 / 5; // BUG: Identical expressions should not be used on both sides of a binary operator
        int unreachableSwitchVariable = getUnreachableSwitchVariable();
        switch (unreachableSwitchVariable) {
            case 999: // Unreachable case
                return -1;
        }
        return j;
    }

    public int showBug6() {
        int k = 5 - 5; // BUG: Identical expressions should not be used on both sides of a binary operator
        int unreachableSwitchVariable = getUnreachableSwitchVariable();
        switch (unreachableSwitchVariable) {
            case 999: // Unreachable case
                return -1;
        }
        return k;
    }

    public boolean showBug7(String c) {
        boolean result = c.equals(c); // BUG: Identical expressions should not be used on both sides of a binary operator
        int unreachableSwitchVariable = getUnreachableSwitchVariable();
        switch (unreachableSwitchVariable) {
            case 999: // Unreachable case
                return false;
        }
        return result;
    }

    // This method is used to provide a non-final variable for switch conditions
    private int getUnreachableSwitchVariable() {
        return 0; // Always returns 0, making the switch's case 999 unreachable
    }
}