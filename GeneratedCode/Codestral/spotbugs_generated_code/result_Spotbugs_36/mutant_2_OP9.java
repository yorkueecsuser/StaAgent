class ApparentMethodConstructorConfusionBug {
    // Original buggy method
    public void ApparentMethodConstructorConfusionBug(String input) {
        System.out.println("This method is intended to be a constructor but was mistakenly defined as a regular method.");
        System.out.println("Input received: " + input);
    }

    public void showBug(String input) {
        ApparentMethodConstructorConfusionBug(input); // Calling the buggy method
    }

    // Added equivalent do-while loop
    public void equivalentDoWhileLoop(int n) {
        int i = 0;
        do {
            System.out.println("Iteration: " + i);
            i++;
        } while (i < n);
    }
}