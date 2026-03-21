class ApparentMethodConstructorConfusionBug {
    public void ApparentMethodConstructorConfusionBug(String input) {
        System.out.println("This method is intended to be a constructor but was mistakenly defined as a regular method.");
        System.out.println("Input received: " + input);
    }

    public void showBug(String bugInput) { // Renaming the variable 'input' to 'bugInput'
        ApparentMethodConstructorConfusionBug(bugInput); // Calling the buggy method
    }
}