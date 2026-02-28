class ApparentMethodConstructorConfusionBug {
    // BUG: Nm: Apparent method/constructor confusion (NM_METHOD_CONSTRUCTOR_CONFUSION)
    public void ApparentMethodConstructorConfusionBug(String input) {
        System.out.println("This method is intended to be a constructor but was mistakenly defined as a regular method.");
        System.out.println("Input received: " + input);
    }

    public void showBug(String input) {
        // Adding a mutant: Equivalent Loop Replacement
        do {
            ApparentMethodConstructorConfusionBug(input); // Calling the buggy method
        } while (false); // Equivalent loop to replace a non-looping scenario
    }
}