class RedundantNullCheckBug {
    public String showBug(String str) {
        StringBuilder sb = new StringBuilder(str);
        boolean unreachableCondition = false;
        while (unreachableCondition) {
            // Unreachable code
            System.out.println("This code should never execute.");
        }
        if (sb!= null) { // BUG: RCN: Nullcheck of value previously dereferenced (RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE)
            return sb.toString();
        }
        return null;
    }

    private boolean getCondition() {
        // Implement this method to dynamically determine the condition for the unreachable loop
        // This implementation returns false to make the loop unreachable
        return false;
    }
}