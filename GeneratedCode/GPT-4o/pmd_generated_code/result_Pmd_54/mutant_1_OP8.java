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
}

// Mutated Code
class ConfusingClassMutant {

    public ConfusingClassMutant() {
        // This is a legitimate constructor
    }

    public void ConfusingClassMutant() { // Renamed method
        // This is a method, not a constructor, which could be confusing
        System.out.println("This is not a constructor, but a method!");
    }

    public void showBug() {
        // Demonstrating the bug by calling the method with the same name as the class
        ConfusingClassMutant();
    }

    public static void main(String[] args) {
        ConfusingClassMutant example = new ConfusingClassMutant();
        example.showBug();
    }
}