class CompareToBug {
    public String showBug(Integer a, Integer b) {
        boolean unreachableCondition = false;
        while (unreachableCondition) { // Mutant: Unreachable while loop
            System.out.println("This line will never be executed");
        }
        if (a.compareTo(b) == 1) { // BUG: RV: Code checks for specific values returned by compareTo
            return "a is greater than b";
        } else if (a.compareTo(b) == -1) {
            return "a is less than b";
        } else {
            return "a and b are equal";
        }
    }

    // Helper method to avoid using compile-time constant directly in the condition of while loop
    private boolean getCondition() {
        return false;
    }
}