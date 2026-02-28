class ConfusingClass {

    public ConfusingClass() {
        // This is a legitimate constructor
    }

    public void ConfusingClass() { // BUG: MethodWithSameNameAsEnclosingClass
        // This is a method, not a constructor, which could be confusing
        System.out.println("This is not a constructor, but a method!");
        
        // Inserted unreachable switch statement
        int unreachableValue = getUnreachableValue();
        switch (unreachableValue) {
            case 1:
                System.out.println("This case will never be executed.");
                break;
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
    
    // A method to ensure the switch statement is unreachable
    private int getUnreachableValue() {
        return -1; // This value ensures the switch case is never hit
    }
}