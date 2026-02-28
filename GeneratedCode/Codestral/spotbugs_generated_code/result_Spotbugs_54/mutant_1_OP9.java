class CompareToBug {
    public String showBug(Integer a, Integer b) {
        if (a.compareTo(b) == 1) { // Original bug: checking for specific value 1
            return "a is greater than b";
        } else if (a.compareTo(b) == -1) {
            return "a is less than b";
        } else {
            return "a and b are equal";
        }
    }

    // Mutant code: Equivalent Loop Replacement (not applicable in this context)
    // Instead, we introduce a new bug based on the RV_CHECK_COMPARETO_FOR_SPECIFIC_RETURN_VALUE rule
    public String showMutantBug(Integer a, Integer b) {
        int comparisonResult = a.compareTo(b);
        if (comparisonResult == 1 || comparisonResult == 2) { // Mutant bug: checking for specific values 1 and 2
            return "a is greater than b";
        } else if (comparisonResult == -1 || comparisonResult == -2) {
            return "a is less than b";
        } else {
            return "a and b are equal";
        }
    }
}