class ConfusingClass {

    public ConfusingClass() {
        // This is a legitimate constructor
    }

    public void ConfusingClass() { // BUG: MethodWithSameNameAsEnclosingClass
        // This is a method, not a constructor, which could be confusing
        System.out.println("This is not a constructor, but a method!");

        // Inserting the unreachable if-else statement
        boolean condition = getCondition(); // dynamically determined at runtime
        if (condition) {
            System.out.println("This branch is reachable.");
        } else {
            System.out.println("This branch is unreachable."); // Unique unreachable code
        }
    }

    public boolean getCondition() {
        return false; // The condition for the unreachable branch
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