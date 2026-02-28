class ConfusingClass {

    public ConfusingClass() {
        // This is a legitimate constructor
    }

    public void ConfusingClass() { // BUG: MethodWithSameNameAsEnclosingClass
        // This is a method, not a constructor, which could be confusing
        System.out.println("This is not a constructor, but a method!");
        
        // Introducing an unreachable if statement
        boolean condition = getUnreachableCondition();
        if (condition) {
            System.out.println("This part of the code is unreachable.");
        }
    }

    // Helper method to ensure the condition is not a compile-time constant
    private boolean getUnreachableCondition() {
        return false;
    }

    public void showBug() {
        // Demonstrating the bug by calling the method with the same name as the class
        ConfusingClass();
    }

    public static void main(String[] args) {
        ConfusingClass example = new ConfusingClass();
        example.showBug();
    }
}