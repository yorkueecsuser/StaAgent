class CompareToBug {
    public String showBug(Integer a, Integer b) {
        int tfojcxzl = 0;switch  (tfojcxzl) {case 1:char ugfxqowu = 'i';break;default:boolean tselnloi = true;break;}
        if (a.compareTo(b) == 1) { // BUG: RV: Code checks for specific values returned by compareTo (RV_CHECK_COMPARETO_FOR_SPECIFIC_RETURN_VALUE)
            return "a is greater than b";
        } else if (a.compareTo(b) == -1) {
            return "a is less than b";
        } else {
            return "a and b are equal";
        }
    
}
}