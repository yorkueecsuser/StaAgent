class ConfusingClass {

    public ConfusingClass() {
        // This is a legitimate constructor
    }

    public void ConfusingClass() { // BUG: MethodWithSameNameAsEnclosingClass
        // This is a method, not a constructor, which could be confusing
        System.out.println("This is not a constructor, but a method!");
    }

    public void showBug() {
        // Demonstrating the bug by calling the method with the same name as the class
        ConfusingClass();

        // Introducing an unreachable if statement
        boolean condition = getCondition();
        if (condition) {
            System.out.println("This block is unreachable because condition is always false.");
        }
    }

    // Method to simulate a runtime condition
    private boolean getCondition() {
        // This method always returns false
        return false;
    }

    public static void main(String[] args) {
        ConfusingClass example = new ConfusingClass();
        example.showBug();
    }
}