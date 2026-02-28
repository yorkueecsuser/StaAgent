class CompareToBug {
    public String showBug(Integer a, Integer b) {
        if (a.compareTo(b) == 1) { // BUG: RV: Code checks for specific values returned by compareTo (RV_CHECK_COMPARETO_FOR_SPECIFIC_RETURN_VALUE)
            // Mutant: Duplicate the assignment statement
            java.lang.Integer result = a.compareTo(b);
            if (result == 1) { // This line is the duplicated assignment statement
                return "a is greater than b";
            }
        } else if (a.compareTo(b) == -1) {
            return "a is less than b";
        } else {
            return "a and b are equal";
        }
        return "a and b are equal"; // This line is added to avoid unreachable statement error
    }
}