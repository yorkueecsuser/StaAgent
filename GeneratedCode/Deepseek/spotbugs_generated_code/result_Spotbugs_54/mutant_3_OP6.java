class CompareToBug {
    public String showBug(Integer a, Integer b) {
        boolean unreachableCondition = alwaysFalseCondition();
        for (int i = 0; unreachableCondition; i++) {
            // Unreachable code
            System.out.println("This code should never be executed.");
        }

        if (a.compareTo(b) == 1) { // BUG: RV: Code checks for specific values returned by compareTo (RV_CHECK_COMPARETO_FOR_SPECIFIC_RETURN_VALUE)
            return "a is greater than b";
        } else if (a.compareTo(b) == -1) {
            return "a is less than b";
        } else {
            return "a and b are equal";
        }
    }

    private boolean alwaysFalseCondition() {
        return false;
    }
}