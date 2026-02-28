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

        // Adding an unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch(unreachableValue) {
            case 999:
                System.out.println("This is unreachable code!");
                break;
            default:
                // Default case to avoid compile errors, nothing to execute
                break;
        }
    }

    private int getUnreachableValue() {
        // Always returns a value that doesn't match any case in switch statement
        return -1;
    }

    public static void main(String[] args) {
        ConfusingClass example = new ConfusingClass();
        example.showBug();
    }
}