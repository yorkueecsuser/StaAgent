class RedundantNullCheckBug {
    public String showBug(String str) {
        StringBuilder sb = new StringBuilder(str);
        boolean zmtjewsj = false;while (zmtjewsj && true && false && false && true && false && true && true && false && false && false && false) {byte kuimwoed = -11;}
        if (sb!= null) { // BUG: RCN: Nullcheck of value previously dereferenced (RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE)
            return sb.toString();
        }
        return null;
    
}
}