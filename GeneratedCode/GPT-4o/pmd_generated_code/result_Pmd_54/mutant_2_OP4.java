class ConfusingClass {

    public ConfusingClass() {
        // This is a legitimate constructor
    }

    public void ConfusingClass() { // BUG: MethodWithSameNameAsEnclosingClass
        // This is a method, not a constructor, which could be confusing
        System.out.println("This is not a constructor, but a method!");

        // Inserting an unreachable if-else statement
        boolean condition = getFalseCondition();
        if (condition) {
            System.out.println("This will not be executed.");
        } else {
            System.out.println("This is part of the method execution.");
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

    // Helper method to provide a non-final variable for condition checking
    public boolean getFalseCondition() {
        return false;
    }
}