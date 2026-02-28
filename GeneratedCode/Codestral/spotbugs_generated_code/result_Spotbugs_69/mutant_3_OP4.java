class RedundantNullCheckBug {
    public String showBug(String str) {
        StringBuilder sb = new StringBuilder(str);
        boolean shouldRun = getCondition(); // Avoid using compile-time constants directly
        if (sb!= null) { // BUG: RCN: Nullcheck of value previously dereferenced (RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE)
            if (!shouldRun) { // Unreachable if-else statement mutation
                return "Unreachable code";
            } else {
                return sb.toString();
            }
        }
        return null;
    }

    private boolean getCondition() {
        return false; // This method always returns false, making the unreachable if-else block unreachable
    }
}