class EqualsNullBug {

    public boolean showBug(String input) {
        // BUG: EC: Call to equals(null) (EC_NULL_ARG)
        return input.equals(null);

        // Unreachable while loop mutation
        boolean conditionWhile = getCondition();
        while (conditionWhile) {
            // This loop is unreachable because conditionWhile will always be false
        }
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        EqualsNullBug bugDemo = new EqualsNullBug();
        System.out.println(bugDemo.showBug("example"));
    }
}