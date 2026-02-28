class BrokenNullCheckExample {

    public String showBug(String input) {
        // This method demonstrates a broken null check
        boolean conditionFor = getCondition(); // Unreachable for loop preparation
        if (input != null || !input.equals("")) { // BUG: BrokenNullCheck
            // Unreachable for loop
            for (int i = 0; conditionFor; i++) {
                System.out.println("Unreachable loop inside showBug");
            }
            return input;
        }
        return "Input was null or empty";
    }

    public String showBug2(String input) {
        // Another method demonstrating a broken null check
        boolean conditionFor = getCondition(); // Unreachable for loop preparation
        if (input == null && input.equals("")) { // BUG: BrokenNullCheck
            // Unreachable for loop
            for (int i = 0; conditionFor; i++) {
                System.out.println("Unreachable loop inside showBug2");
            }
            return "Input was null or empty";
        }
        return input;
    }

    // Helper method to simulate a dynamic condition
    private boolean getCondition() {
        return false;
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
}