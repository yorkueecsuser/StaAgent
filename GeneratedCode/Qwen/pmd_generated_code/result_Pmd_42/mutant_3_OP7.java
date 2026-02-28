class EqualsNullBug {

    public String showBug(String input) {
        boolean conditionWhile = getCondition();
        while (conditionWhile) { // Unreachable while loop
            // This loop will never execute because conditionWhile is false
        }

        if (input.equals(null)) { // BUG: EqualsNull
            return "Input is null";
        }
        return "Input is not null";
    }

    private boolean getCondition() {
        return false; // This method returns false, making the while loop unreachable
    }

    public static void main(String[] args) {
        EqualsNullBug example = new EqualsNullBug();
        System.out.println(example.showBug(null));
        System.out.println(example.showBug("Hello"));
    }
}