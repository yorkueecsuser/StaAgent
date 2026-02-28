class CompareToBug {
    public String showBug(Integer a, Integer b) {
        boolean condition = false;
        while(condition) { // Unreachable while loop
            System.out.println("This loop should never execute");
        }
        if (a.compareTo(b) == 1) { // BUG: RV: Code checks for specific values returned by compareTo
            return "a is greater than b";
        } else if (a.compareTo(b) == -1) {
            return "a is less than b";
        } else {
            return "a and b are equal";
        }
    }

    private boolean getCondition() {
        // This method always returns false to make the while loop unreachable
        return false;
    }
}