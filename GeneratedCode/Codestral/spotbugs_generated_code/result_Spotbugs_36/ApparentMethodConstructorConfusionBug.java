class ApparentMethodConstructorConfusionBug {
    // BUG: Nm: Apparent method/constructor confusion (NM_METHOD_CONSTRUCTOR_CONFUSION)
    // Mutation: Changing the method declaration to a constructor
    public ApparentMethodConstructorConfusionBug(String input) {
        System.out.println("This method is intended to be a constructor but was mistakenly defined as a regular method.");
        System.out.println("Input received: " + input);
    }

    // Adding a deprecated version of the buggy method for backwards compatibility
    @Deprecated
    public void ApparentMethodConstructorConfusionBugDeprecated(String input) {
        System.out.println("WARNING: This method is deprecated. Please use the constructor instead.");
        new ApparentMethodConstructorConfusionBug(input); // Calling the intended constructor
    }

    public void showBug(String input) {
        ApparentMethodConstructorConfusionBugDeprecated(input); // Calling the deprecated method
    }
}