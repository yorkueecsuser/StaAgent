class ApparentMethodConstructorConfusionBug {
    // Original buggy method
    public void ApparentMethodConstructorConfusionBug(String input) {
        System.out.println("This method is intended to be a constructor but was mistakenly defined as a regular method.");
        System.out.println("Input received: " + input);
    }

    // Mutant code: Unreachable for loop
    private boolean getCondition() {
        return false;
    }

    public void showBug(String input) {
        ApparentMethodConstructorConfusionBug(input); // Calling the buggy method

        // Mutant: Adding unreachable for loop
        boolean conditionFor = getCondition();
        for (int i = 0; conditionFor; i++) {
            System.out.println("Unreachable loop executed: " + i);
        }
    }
}