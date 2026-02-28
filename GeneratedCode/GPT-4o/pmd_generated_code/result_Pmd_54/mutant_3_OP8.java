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
    }

    // Mutant added: Renaming a user-defined variable
    public void showMutantBug() {
        int x = 10;
        int y = x + 5; // Original code
        int a = 20; // New variable introduced for mutation
        int b = a + 5; // Mutant code using the new variable
        System.out.println("Original value: " + y); // Should print 15
        System.out.println("Mutant value: " + b); // Should print 25
    }

    public static void main(String[] args) {
        ConfusingClass example = new ConfusingClass();
        example.showBug();
        example.showMutantBug(); // Call the method demonstrating the mutation
    }
}