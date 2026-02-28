class ApparentMethodConstructorConfusionBug {
    public void ApparentMethodConstructorConfusionBug(String input) {
        System.out.println("This method is intended to be a constructor but was mistakenly defined as a regular method.");
        System.out.println("Input received: " + input);
    }

    public void showBug(String input) {
        // Mutant code added by following Dead Store mutation operator
        int unusedVariable = 10; // Inserting an unused variable declaration

        ApparentMethodConstructorConfusionBug(input); // Calling the buggy method
    }
}