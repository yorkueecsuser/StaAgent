class EqualsNullBug {

    public String showBug(String input) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Unreachable while loop
            // This loop is unreachable because conditionWhile is always false
        }

        if (input.equals(null)) { // BUG: EqualsNull
            return "Input is null";
        }
        return "Input is not null";
    }

    private boolean getCondition() {
        return false;
    }

    public static void main(String[] args) {
        EqualsNullBug example = new EqualsNullBug();
        System.out.println(example.showBug(null));
        System.out.println(example.showBug("Hello"));
    }
}