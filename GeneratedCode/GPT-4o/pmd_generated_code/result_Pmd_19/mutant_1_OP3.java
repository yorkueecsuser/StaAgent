class BrokenNullCheckExample {

    public String showBug(String input) {
        // This method demonstrates a broken null check
        if (input != null || !input.equals("")) { // BUG: BrokenNullCheck
            return input;
        }

        // Unreachable if statement - uses a method to generate a never true condition
        boolean unreachableCondition = generateUnreachableCondition();
        if (unreachableCondition) {
            return "This path is unreachable";
        }

        return "Input was null or empty";
    }

    public String showBug2(String input) {
        // Another method demonstrating a broken null check
        if (input == null && input.equals("")) { // BUG: BrokenNullCheck
            return "Input was null or empty";
        }

        // Unreachable if statement - uses a method to generate a never true condition
        boolean unreachableCondition = generateUnreachableCondition();
        if (unreachableCondition) {
            return "This path is unreachable";
        }

        return input;
    }

    // Method to generate an unreachable condition
    private boolean generateUnreachableCondition() {
        // This condition is dynamically determined but always false
        return false && (System.currentTimeMillis() < 0);
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