class CompareToBug {
    public String showBug(Integer a, Integer b) {
        if (a.compareTo(b) == 1) { // BUG: RV: Code checks for specific values returned by compareTo (RV_CHECK_COMPARETO_FOR_SPECIFIC_RETURN_VALUE)
            return "a is greater than b";
        } else if (a.compareTo(b) == -1) { // No change needed for the Equivalent Loop Replacement mutation operator
            return "a is less than b";
        } else {
            return "a and b are equal";
        }
    }

    // Following the mutation operator description, an equivalent do-while loop is added but its functionality remains the same as the existing code.
    public void equivalentLoopReplacement(Integer n) {
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < n);
    }
}