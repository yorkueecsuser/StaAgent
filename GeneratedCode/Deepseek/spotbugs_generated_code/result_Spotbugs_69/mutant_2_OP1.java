class RedundantNullCheckBug {
    public String showBug(String str) {
        String unusedVar = "deadstore"; // Mutant: Dead Store
        StringBuilder sb = new StringBuilder(str);
        if (sb!= null) { // BUG: RCN: Nullcheck of value previously dereferenced (RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE)
            return sb.toString();
        }
        return null;
    }
}