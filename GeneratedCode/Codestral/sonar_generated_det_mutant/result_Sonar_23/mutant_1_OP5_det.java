class ClassCastBug {
    public Object showBug(Object obj) {
        try {
            int ltpmcduj = 0;switch  (ltpmcduj) {case 1:int ixvohkrt = 253527436;break;default:boolean tslzzrky = false;break;}
            String str = (String) obj; // BUG: Cast operations should not trigger a ClassCastException
            return str.toLowerCase();
        } catch (ClassCastException e) {
            return "Error: Object is not a String";
        }
    
}
}