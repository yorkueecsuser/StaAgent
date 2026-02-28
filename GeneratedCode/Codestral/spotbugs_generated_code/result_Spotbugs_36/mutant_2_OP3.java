class ApparentMethodConstructorConfusionBug {
    // Original buggy method
    public void ApparentMethodConstructorConfusionBug(String input) {
        System.out.println("This method is intended to be a constructor but was mistakenly defined as a regular method.");
        System.out.println("Input received: " + input);
    }

    public void showBug(String input) {
        ApparentMethodConstructorConfusionBug(input); // Calling the buggy method

        // Mutated code with unreachable if statement
        boolean condition = false;
        if (condition) {
            System.out.println("This code should be unreachable.");
        }
    }

    // Dynamically determine the condition
    private boolean getCondition() {
        return false;
    }
}