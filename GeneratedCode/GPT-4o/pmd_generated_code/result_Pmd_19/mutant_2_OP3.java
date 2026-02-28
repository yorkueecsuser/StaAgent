class BrokenNullCheckExample {

    public String showBug(String input) {
        // This method demonstrates a broken null check
        if (input != null || !input.equals("")) { // BUG: BrokenNullCheck
            return input;
        }

        // Unreachable if statement mutation
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            return "This path is never taken.";
        }

        return "Input was null or empty";
    }

    public String showBug2(String input) {
        // Another method demonstrating a broken null check
        if (input == null && input.equals("")) { // BUG: BrokenNullCheck
            return "Input was null or empty";
        }

        // Unreachable if statement mutation
        boolean unreachableCondition = getFalseCondition();
        if (unreachableCondition) {
            return "This path is never taken.";
        }

        return input;
    }

    public static void main(String[] args) {
        BrokenNullCheckExample example = new BrokenNullCheckExample();

        // Example usage of showBug method
        System.out.println("Result of showBug with null: " + example.showBug(null));
        System.out.println("Result of showBug with empty string: " + example.showBug(""));

        // Example usage of showBug2 method
        System.out.println("Result of showBug2 with null: " + example.showBug2(null));
        System.out.println("Result of showBug2 with empty string: " + example.showBug2(""));
    }

    // This method provides a dynamic false condition to ensure no unreachable statement errors
    private boolean getFalseCondition() {
        return false;
    }
}