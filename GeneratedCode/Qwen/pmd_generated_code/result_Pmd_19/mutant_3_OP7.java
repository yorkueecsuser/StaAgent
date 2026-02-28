class NullCheckExample {

    public String showBug(String input) {
        // should be &&
        if (input!= null ||!input.equals("")) { // BUG: BrokenNullCheck
            boolean conditionWhile = getCondition();
            while (conditionWhile) { // Unreachable while loop
                // This loop is unreachable because conditionWhile is always false
                conditionWhile = false;
            }
            return input;
        }
        // should be ||
        if (input == null && input.equals("")) { // BUG: BrokenNullCheck
            boolean conditionWhile = getCondition();
            while (conditionWhile) { // Unreachable while loop
                // This loop is unreachable because conditionWhile is always false
                conditionWhile = false;
            }
            return input;
        }
        return null;
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        NullCheckExample example = new NullCheckExample();
        System.out.println(example.showBug(null)); // This will throw NullPointerException
    }
}