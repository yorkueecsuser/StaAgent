class RedundantNullCheckBug {
    private boolean getCondition() {
        return false;
    }

    public String showBug(String str) {
        StringBuilder sb = new StringBuilder(str);
        boolean condition = getCondition();
        for (int i = 0; condition; i++) {
            // Unreachable loop
            System.out.println("This is an unreachable loop");
        }
        if (sb!= null) { // BUG: RCN: Nullcheck of value previously dereferenced (RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE)
            return sb.toString();
        }
        return null;
    }
}