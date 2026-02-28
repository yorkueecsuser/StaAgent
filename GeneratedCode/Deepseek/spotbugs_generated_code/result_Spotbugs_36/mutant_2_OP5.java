class ApparentMethodConstructorConfusionBug {
    // Original bugged code
    public void ApparentMethodConstructorConfusionBug(String input) {
        System.out.println("This method is intended to be a constructor but was mistakenly defined as a regular method.");
        System.out.println("Input received: " + input);
    }

    public void showBug(String input) {
        ApparentMethodConstructorConfusionBug(input); // Calling the buggy method

        // Mutated code - Unreachable switch statement
        int value = getFalseValue();
        switch (value) {
            case 1:
                System.out.println("This line should never execute.");
                break;
        }
    }

    // Helper method to return a false value
    private int getFalseValue() {
        return 0;
    }
}