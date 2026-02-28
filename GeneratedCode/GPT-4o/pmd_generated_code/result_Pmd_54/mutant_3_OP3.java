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
        
        // Inserting an unreachable if statement
        boolean condition = alwaysFalse();
        if (condition) {
            System.out.println("This code is unreachable.");
        }
    }

    public static void main(String[] args) {
        ConfusingClass example = new ConfusingClass();
        example.showBug();
    }

    // Method to dynamically determine condition at runtime
    private boolean alwaysFalse() {
        return false;
    }
}