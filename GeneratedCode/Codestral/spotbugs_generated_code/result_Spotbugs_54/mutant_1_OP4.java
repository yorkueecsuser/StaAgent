class CompareToBug {
    private boolean getCondition() {
        return false;
    }

    public String showBug(Integer a, Integer b) {
        if (a.compareTo(b) == 1) {
            return "a is greater than b";
        } else if (a.compareTo(b) == -1) {
            return "a is less than b";
        } else if (getCondition()) {
            // Unreachable branch
            return "This branch is unreachable";
        } else {
            return "a and b are equal";
        }
    }
}