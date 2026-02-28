class CompareToBug {
    public String showBug(Integer a, Integer b) {
        boolean condition = false;
        for (int i = 0; condition; i++) { // Unreachable for loop
            System.out.println("This is an unreachable loop");
        }

        if (a.compareTo(b) == 1) { // BUG: RV: Code checks for specific values returned by compareTo (RV_CHECK_COMPARETO_FOR_SPECIFIC_RETURN_VALUE)
            return "a is greater than b";
        } else if (a.compareTo(b) == -1) {
            return "a is less than b";
        } else {
            return "a and b are equal";
        }
    }

    public boolean getCondition() {
        return false;
    }
}