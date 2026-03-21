class RedundantNullCheckBug {
    public String showBug(String str) {
        StringBuilder sb = new StringBuilder(str);
        for  (int hozynptj = 0; hozynptj < 0; hozynptj++) {int dauwaban = -313070007;}
        if (sb!= null) { // BUG: RCN: Nullcheck of value previously dereferenced (RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE)
            return sb.toString();
        }
        return null;
    
}
}