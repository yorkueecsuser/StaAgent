class ApparentMethodConstructorConfusionBug {
    public void ApparentMethodConstructorConfusionBug(String input) {
        System.out.println("This method is intended to be a constructor but was mistakenly defined as a regular method.");
        System.out.println("Input received: " + input);
    }

    public void showBug(String input) {
        ApparentMethodConstructorConfusionBug(input); // Original buggy method call

        // Mutant: Duplication of the buggy method call
        ApparentMethodConstructorConfusionBug(input);
    }
}