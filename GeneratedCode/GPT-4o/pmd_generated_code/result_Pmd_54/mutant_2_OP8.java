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

    public static void main(String[] args) {
        ConfusingClass example = new ConfusingClass();
        example.showBug();
    }

    // Mutant code added
    public void a() { // Renamed method to 'a' as per the mutation operator
        // This is a method, not a constructor, which could be confusing
        System.out.println("This is not a constructor, but a method!");
    }

    public void demonstrateMutation() {
        // Demonstrating the mutation by calling the renamed method
        a();
    }

    public static void mainMutated(String[] args) {
        ConfusingClass mutatedExample = new ConfusingClass();
        mutatedExample.demonstrateMutation();
    }
}