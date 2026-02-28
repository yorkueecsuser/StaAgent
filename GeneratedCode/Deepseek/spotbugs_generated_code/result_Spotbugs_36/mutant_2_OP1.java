class ApparentMethodConstructorConfusionBug {
    // BUG: Nm: Apparent method/constructor confusion (NM_METHOD_CONSTRUCTOR_CONFUSION)
    public void ApparentMethodConstructorConfusionBug(String input) {
        System.out.println("This method is intended to be a constructor but was mistakenly defined as a regular method.");
        System.out.println("Input received: " + input);

        // Mutated code: Dead Store
        String deadStoreVariable = "abcdefgh"; // Unused variable declaration
    }

    public void showBug(String input) {
        ApparentMethodConstructorConfusionBug(input); // Calling the buggy method
    }
}