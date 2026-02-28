class BuggyCode {
    // BUG: UseEqualsToCompareStrings
    public boolean showBug(String s1, String s2) {
        if (s1 == "one") return true;        // BUG: UseEqualsToCompareStrings
        if ("two".equals(s2)) return true;   // BUG: UseEqualsToCompareStrings
        return false;
    }
}

class MutatedCode {
    // MUTATION: Unreachable switch statement
    public boolean showMutant(String s1, String s2) {
        if (s1 == "one") return true;        // MUTATION: Unreachable switch statement
        if ("two".equals(s2)) return true;   // MUTATION: Unreachable switch statement
        boolean condition = getCondition(); // MUTATION: Unreachable switch statement
        if (condition) { // MUTATION: Unreachable switch statement
            int value = getValue(); // MUTATION: Unreachable switch statement
            switch(value) { // MUTATION: Unreachable switch statement
                case 1:
                    return false; // MUTATION: Unreachable switch statement
                default:
                    return false; // MUTATION: Unreachable switch statement
            }
        }
        return false;
    }

    private boolean getCondition() { // MUTATION: Unreachable switch statement
        return false; // MUTATION: Unreachable switch statement
    }

    private int getValue() { // MUTATION: Unreachable switch statement
        return 0; // MUTATION: Unreachable switch statement
    }
}