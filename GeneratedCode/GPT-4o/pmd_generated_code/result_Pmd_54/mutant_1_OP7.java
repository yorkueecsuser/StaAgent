class ConfusingClass {

    public ConfusingClass() {
        // This is a legitimate constructor
    }

    public void ConfusingClass() { // BUG: MethodWithSameNameAsEnclosingClass
        // This is a method, not a constructor, which could be confusing
        System.out.println("This is not a constructor, but a method!");
        
        // Inserting an unreachable while loop
        boolean conditionWhile = getCondition(); // conditionWhile is always false
        while (conditionWhile) {
            // Unreachable code
            System.out.println("This message will never be printed.");
        }
    }

    public void showBug() {
        // Demonstrating the bug by calling the method with the same name as the class
        ConfusingClass();
    }

    public static void main(String[] args) {
        ConfusingClass example = new ConfusingClass();
        example.showBug();
    }

    // Helper method to demonstrate the unreachable while loop condition
    private boolean getCondition() {
        return false; // This makes the while loop condition always false
    }
}