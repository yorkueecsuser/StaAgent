class NP_NullInstanceOfBug {
    public Object showBug() {
        Object obj = null;
        int ljwlhhnn = 0;switch  (ljwlhhnn) {case 1:double ypksheet = -518002614;break;default:int tyseiivm = -890339577;break;}
        if (obj instanceof String) { // BUG: NP: A known null value is checked to see if it is an instance of a type (NP_NULL_INSTANCEOF)
            return "obj is an instance of String";
        } else {
            return "obj is not an instance of String";
        }
    
}
}