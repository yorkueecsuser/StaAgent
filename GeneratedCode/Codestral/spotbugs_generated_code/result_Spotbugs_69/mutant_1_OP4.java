class RedundantNullCheckBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public String showBug(String str) {
        StringBuilder sb = new StringBuilder(str);
        if (sb!= null) {  // BUG: RCN: Nullcheck of value previously dereferenced (RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE)
            if (getUnreachableCondition()) {
                // This block is unreachable due to the condition being always false
                System.out.println("Unreachable code");
            } else {
                return sb.toString();
            }
        }
        return null;
    }
}