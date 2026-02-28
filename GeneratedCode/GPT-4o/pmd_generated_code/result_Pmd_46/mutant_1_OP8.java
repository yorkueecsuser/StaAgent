class FinalizeVisibilityExample {

    // Incorrectly overriding finalize() method as public
    public void finalize() { // BUG: FinalizeShouldBeProtected
        System.out.println("Finalize method called.");
    }

    public String showBug() {
        // Attempt to demonstrate the bug by manually calling finalize (which should not be public)
        finalize();
        return "Finalize method was called manually.";
    }

    public static void main(String[] args) {
        FinalizeVisibilityExample example = new FinalizeVisibilityExample();
        System.out.println(example.showBug());
    }
}

// Mutation: Renaming a user-defined variable
class FinalizeVisibilityExampleMutant {

    // Incorrectly overriding finalize() method as public
    public void finalize() { // BUG: FinalizeShouldBeProtected
        System.out.println("Finalize method called.");
    }

    public String displayBug() { // Renaming the method "showBug" to "displayBug"
        // Attempt to demonstrate the bug by manually calling finalize (which should not be public)
        finalize();
        return "Finalize method was called manually.";
    }

    public static void main(String[] args) {
        FinalizeVisibilityExampleMutant example = new FinalizeVisibilityExampleMutant();
        System.out.println(example.displayBug());
    }
}