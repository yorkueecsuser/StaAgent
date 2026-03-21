class RedundantNullCheckBug {
    public String showBug(String str) {
        StringBuilder sb = new StringBuilder(str);
        int vcmfopwf = 0;switch  (vcmfopwf) {case 1:double zafayjwf = -843216383;break;default:byte ajhrwgmb = 23;break;}
        if (sb!= null) { // BUG: RCN: Nullcheck of value previously dereferenced (RCN_REDUNDANT_NULLCHECK_WOULD_HAVE_BEEN_A_NPE)
            return sb.toString();
        }
        return null;
    
}
}