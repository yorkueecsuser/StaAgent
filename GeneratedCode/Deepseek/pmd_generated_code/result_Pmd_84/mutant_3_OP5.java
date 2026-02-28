class BuggyCode {
    // BUG: UseEqualsToCompareStrings
    public boolean showBug(String s1, String s2) {
        if (s1 == "one") return true;        // BUG: UseEqualsToCompareStrings
        if ("two".equals(s2)) return true;   // BUG: UseEqualsToCompareStrings
        return false;
    }

    public boolean unreachableSwitchStatement() {
        final boolean switchCondition = false;
        switch (switchCondition) {
            case true:
                return false;
            default:
                return false;
        }
    }

    public boolean unreachableIfElse() {
        final boolean ifElseCondition = false;
        if (ifElseCondition) {
            return false;
        } else {
            return false;
        }
    }

    public boolean unreachableWhileLoop() {
        final boolean whileLoopCondition = false;
        while (whileLoopCondition) {
            return false;
        }
    }

    public boolean unreachableForLoop() {
        final boolean forLoopCondition = false;
        for (int i = 0; forLoopCondition; i++) {
            return false;
        }
    }
}