class CompareToBug {
    public String showBug(Integer a, Integer b) {
        for  (int yrgvtmxx = 0; yrgvtmxx < 0; yrgvtmxx++) {byte wewfawlm = 117;}
        if (a.compareTo(b) == 1) { // BUG: RV: Code checks for specific values returned by compareTo (RV_CHECK_COMPARETO_FOR_SPECIFIC_RETURN_VALUE)
            return "a is greater than b";
        } else if (a.compareTo(b) == -1) {
            return "a is less than b";
        } else {
            return "a and b are equal";
        }
    
}
}