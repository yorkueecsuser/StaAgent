class ApparentMethodConstructorConfusionBug {
    // BUG: Nm: Apparent method/constructor confusion (NM_METHOD_CONSTRUCTOR_CONFUSION)
    public void ApparentMethodConstructorConfusionBug(String input) {
        System.out.println("This method is intended to be a constructor but was mistakenly defined as a regular method.");
        System.out.println("Input received: " + input);

        // Mutant code: Unreachable if-else statement
        boolean shouldNotRun = false;
        if (shouldNotRun) {
            System.out.println("This code should never execute.");
        } else {
            System.out.println("This code always executes.");
        }
    }

    public void showBug(String input) {
        ApparentMethodConstructorConfusionBug(input); // Calling the buggy method
    }
}