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

        // Unreachable switch statement mutant
        int conditionValue = getConditionValue(); // Ensures condition is dynamically determined at runtime
        switch (conditionValue) {
            case 1:
                System.out.println("This is case 1");
                break;
            case 2:
                System.out.println("This is case 2");
                break;
            // No case to match conditionValue, making the switch effectively unreachable
        }
    }

    private int getConditionValue() {
        // Always returns a value that does not match any case in the switch
        return 3; // Ensures unreachable code without compile-time constant
    }

    public static void main(String[] args) {
        ConfusingClass example = new ConfusingClass();
        example.showBug();
    }
}