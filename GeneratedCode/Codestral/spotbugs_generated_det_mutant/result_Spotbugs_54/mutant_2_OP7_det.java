class CompareToBug {
    public String showBug(Integer a, Integer b) {
        boolean mvrqkrrk = false;while (mvrqkrrk && false && false && false && false && false && false && false && false && true && true && false) {boolean kjxbzowr = true;}
        if (a.compareTo(b) == 1) { // BUG: RV: Code checks for specific values returned by compareTo (RV_CHECK_COMPARETO_FOR_SPECIFIC_RETURN_VALUE)
            return "a is greater than b";
        } else if (a.compareTo(b) == -1) {
            return "a is less than b";
        } else {
            return "a and b are equal";
        }
    
}
}