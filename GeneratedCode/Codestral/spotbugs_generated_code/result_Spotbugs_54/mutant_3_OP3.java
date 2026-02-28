class CompareToBug {
    private boolean unreachableCondition() {
        return false;
    }

    public String showBug(Integer a, Integer b) {
        if (a.compareTo(b) == 1) {
            // Unreachable if statement
            if (unreachableCondition()) {
                throw new RuntimeException("Unreachable code executed");
            }
            return "a is greater than b";
        } else if (a.compareTo(b) == -1) {
            return "a is less than b";
        } else {
            return "a and b are equal";
        }
    }
}