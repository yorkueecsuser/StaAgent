class CompareToBug {
    private boolean getUnreachableCondition() {
        return false;
    }

    public String showBug(Integer a, Integer b) {
        if (a.compareTo(b) == 1) {
            return "a is greater than b";
        } else if (a.compareTo(b) == -1) {
            return "a is less than b";
        } else if (getUnreachableCondition()) { // Mutated code added here to introduce an unreachable if statement
            return "Unreachable Code";
        } else {
            return "a and b are equal";
        }
    }
}