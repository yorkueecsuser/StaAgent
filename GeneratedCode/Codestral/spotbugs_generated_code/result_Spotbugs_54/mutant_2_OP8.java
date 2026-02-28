class CompareToBug {
    public String showBug(Integer a, Integer b) {
        int c = a.compareTo(b); // Renaming the original 'a' variable to 'c'
        if (c == 1) { // BUG: RV: Code checks for specific values returned by compareTo (RV_CHECK_COMPARETO_FOR_SPECIFIC_RETURN_VALUE)
            return "a is greater than b";
        } else if (c == -1) {
            return "a is less than b";
        } else {
            return "a and b are equal";
        }
    }
}